package session;

public class DadosSession {
    public  static String dataRetirada;
    public static String dataDevolucao;
    public static Double valorAluguel;
    public static String agencia;

    public static String getDataRetirada() {
        return dataRetirada;
    }

    public static void setDataRetirada(String dataRetirada) {
        DadosSession.dataRetirada = dataRetirada;
    }

    public static String getDataDevolucao() {
        return dataDevolucao;
    }

    public static void setDataDevolucao(String dataDevolucao) {
        DadosSession.dataDevolucao = dataDevolucao;
    }

    public static Double getValorAluguel() {
        return valorAluguel;
    }

    public static void setValorAluguel(Double valorAluguel) {
        DadosSession.valorAluguel = valorAluguel;
    }

    public static String getAgencia() {
        return agencia;
    }

    public static void setAgencia(String agencia) {
        DadosSession.agencia = agencia;
    }
}
