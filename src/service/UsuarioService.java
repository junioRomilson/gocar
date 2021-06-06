package service;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    public static Usuario usuarioLogado = new Usuario();
    List<Usuario> bdUsuarios = new ArrayList<Usuario>();

    public boolean validarLogin(String usuario, String senha){

        setarUsuariosBD();

        for (Usuario user: this.bdUsuarios) {
            if(user.getUsuario().equals(usuario) && user.getSenha().equals(senha)){
                this.usuarioLogado = user;
                return true;
            }
        }

        return false;
    }

    public boolean existeUsuarioLogado(){
        return (this.usuarioLogado.getId() != null) ? true : false;
    }

    private void setarUsuariosBD(){
        this.bdUsuarios.add(new Usuario(1L, "root", "123456"));
        this.bdUsuarios.add(new Usuario(2L, "operacional", "123456"));
        this.bdUsuarios.add(new Usuario(3L, "gerente", "123456"));
    }

}
