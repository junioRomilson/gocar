package session;

import model.Carro;
import model.Cliente;
import model.Usuario;

public class DadosSession {

    public static Usuario usuarioLogado = new Usuario();

    public static String dataRetirada;
    public static String dataDevolucao;

    public static String horaRetirada;
    public static String horaDevolucao;
    public static Double valorAluguel;
    public static String agencia;

    public static Carro carroAluguel;
    public static Integer catalogo;

    public static Cliente cliente;
    public static int indexCliente;

    public static Cliente getCliente() {
        return cliente;
    }

    public static void setCliente(Cliente cliente) {
        DadosSession.cliente = cliente;
    }

    public static int getIndexCliente() {
        return indexCliente;
    }

    public static void setIndexCliente(int indexCliente) {
        DadosSession.indexCliente = indexCliente;
    }

    public static Carro getCarroAluguel() {
        return carroAluguel;
    }

    public static void setCarroAluguel(Carro carroAluguel) {
        DadosSession.carroAluguel = carroAluguel;
    }

    public static Integer getCatalogo() {
        return catalogo;
    }

    public static void setCatalogo(Integer catalogo) {
        DadosSession.catalogo = catalogo;
    }

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

    public static String getHoraRetirada() {
        return horaRetirada;
    }

    public static void setHoraRetirada(String horaRetirada) {
        DadosSession.horaRetirada = horaRetirada;
    }

    public static String getHoraDevolucao() {
        return horaDevolucao;
    }

    public static void setHoraDevolucao(String horaDevolucao) {
        DadosSession.horaDevolucao = horaDevolucao;
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


    public static void setUsuarioLogado(Usuario usuario){
        DadosSession.usuarioLogado = usuario;
    }

    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public static boolean existeUsuarioLogado(){
        return (DadosSession.usuarioLogado.getId() != null) ? true : false;
    }
}
