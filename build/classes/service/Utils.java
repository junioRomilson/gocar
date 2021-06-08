package service;

import model.Carro;
import session.DadosSession;

import javax.swing.text.MaskFormatter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Locale;

public class Utils {
    public static DecimalFormat df = new DecimalFormat("#,###.##",new DecimalFormatSymbols(Locale.GERMAN));

    public static final String AS = "ás";
    public static final String SELECIONE = "Selecione";

    MaskFormatter mascaraCpf = null;
    MaskFormatter mascaraTelefone = null;
    MaskFormatter mascaraCep = null;
    MaskFormatter mascaraData = null;
    MaskFormatter mascaraHora = null;

    public static MaskFormatter getMascaraCPF() throws ParseException {
        return new MaskFormatter("###.###.###-##");
    }

    public static MaskFormatter getMascaraTelefone() throws ParseException {
        return new MaskFormatter("(##)#####-####");
    }

    public static MaskFormatter getMascaraCEP() throws ParseException {
        return new MaskFormatter("##.###-###");
    }
    public static MaskFormatter getMascaraData() throws ParseException {
        return new MaskFormatter("##/##/####");
    }
    public static MaskFormatter getMascaraHora() throws ParseException {
        return new MaskFormatter("##:##");
    }

    public static Long calcularDiasAluguel() {

        String[] dataRetirada = DadosSession.getDataRetirada().split("/");
        String[] dataDevolucao = DadosSession.getDataDevolucao().split("/");

        LocalDateTime dataDiffRetirada = LocalDateTime.of(
                Integer.valueOf(dataRetirada[2]), Integer.valueOf(dataRetirada[1]), Integer.valueOf(dataRetirada[0]), 0,0,0
        );
        LocalDateTime dataDiffDevolucao = LocalDateTime.of(
                Integer.valueOf(dataDevolucao[2]), Integer.valueOf(dataDevolucao[1]), Integer.valueOf(dataDevolucao[0]), 0,0,0
        );
        return dataDiffRetirada.until(dataDiffDevolucao, ChronoUnit.DAYS) + 1;
    }

    public static Boolean validarData(String dataRetirada, String dataDevolucao) {

        String[] dataR = dataRetirada.split("/");
        String[] dataD = dataDevolucao.split("/");

        LocalDateTime dataDiffRetirada = LocalDateTime.of(
                Integer.valueOf(dataR[2]), Integer.valueOf(dataR[1]), Integer.valueOf(dataR[0]), 0,0,0
        );
        LocalDateTime dataDiffDevolucao = LocalDateTime.of(
                Integer.valueOf(dataD[2]), Integer.valueOf(dataD[1]), Integer.valueOf(dataD[0]), 0,0,0
        );

        return (dataDiffDevolucao.isBefore(dataDiffRetirada)) ? false : true ;
    }

    public static String calcularValorAluguel(Carro carro, Long diasAluguel){
        return "R$ "+ df.format(Double.valueOf(carro.getValor() * diasAluguel))+",00";
    }

    public static String[] listarUFs(){
        String siglas = "AC_AL_AP_AM_BA_CE_DF_ES_GO_MA_MT_MS_MG_PA_PB_PR_PE_PI_RJ_RN_RS_RO_RR_SC_SP_SE_TO";
        String[] estados = siglas.split("_");
        return estados;
    }

    public static boolean valiadarCpf(String CPF) {
        if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222") ||
            CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888") ||
            CPF.equals("99999999999") || (CPF.length() != 11)
        ) return false;

        char dig10, dig11;
        int soma, i, resto, num, peso;

        try {
            soma = 0;
            peso = 10;
            for (i=0; i<9; i++) {
                num = (int)(CPF.charAt(i) - 48);
                soma = soma + (num * peso);
                peso = peso - 1;
            }

            resto = 11 - (soma % 11);
            dig10 = ((resto == 10) || (resto == 11)) ? '0' :  (char) (resto + 48);

            soma = 0;
            peso = 11;
            for(i=0; i<10; i++) {
                num = (int)(CPF.charAt(i) - 48);
                soma = soma + (num * peso);
                peso = peso - 1;
            }

            resto = 11 - (soma % 11);
            dig11 = ((resto == 10) || (resto == 11)) ? '0' : (char) (resto + 48);

            return ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) ? true : false;

        } catch (InputMismatchException erro) {
            return false ;
        }
    }
    public static String imprimirCpf(String CPF){
        return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." + CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }
}
