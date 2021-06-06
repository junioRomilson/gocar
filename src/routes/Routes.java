package routes;

import projeto.*;

public class Routes {

    public void goLogin(){
        Login telaLogin = new Login();
        telaLogin.setVisible(true);
    }

    public void goAlugar(){
        Alugar telaAlugar = new Alugar();
        telaAlugar.setVisible(true);
    }

    public void goHome(){
        Home telaHome = new Home();
        telaHome.setVisible(true);
    }

    public void goCadastroCliente(){
        CadastroCliente telaCadastroCliente = new CadastroCliente();
        telaCadastroCliente.setVisible(true);
    }

    public void goListar(){
        Listar telaListar = new Listar();
        telaListar.setVisible(true);
    }

    public void goLotacao(){
        Locacao telaLocacao = new Locacao();
        telaLocacao.setVisible(true);
    }

    public void goCatalogo1() {
        Catalago1 telaCatalogo1 = new Catalago1();
        telaCatalogo1.setVisible(true);
    }

    public void goCatalogo2() {
        Catalago2 telaCatalogo2 = new Catalago2();
        telaCatalogo2.setVisible(true);
    }

    public void goCatalogo3() {
        Catalago3 telaCatalogo3 = new Catalago3();
        telaCatalogo3.setVisible(true);
    }
}
