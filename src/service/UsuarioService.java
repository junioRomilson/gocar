package service;

import model.Usuario;
import session.DadosSession;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    List<Usuario> bdUsuarios = new ArrayList<Usuario>();

    public boolean validarLogin(String usuario, String senha){

        setarUsuariosBD();

        for (Usuario user: this.bdUsuarios) {
            if(user.getUsuario().equals(usuario) && user.getSenha().equals(senha)){
                DadosSession.setUsuarioLogado(user);
                return true;
            }
        }

        return false;
    }

    private void setarUsuariosBD(){
        this.bdUsuarios.add(new Usuario(1L, "root", "123456"));
        this.bdUsuarios.add(new Usuario(2L, "operacional", "123456"));
        this.bdUsuarios.add(new Usuario(3L, "gerente", "123456"));
    }

}
