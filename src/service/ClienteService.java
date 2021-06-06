package service;

import model.Cliente;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;

public class ClienteService {

    public static LinkedList<Cliente> clientes = new LinkedList<>();

    public static LinkedList<Cliente> listar(){
        return clientes;
    }

    public static boolean adicionar(Cliente cliente){
        Long id = gerarId();
        cliente.setId(id);
        if(clientes.contains(cliente)){
            return false;
        }
        clientes.add(cliente);
        return true;
    }

    public static boolean deletar(Cliente cliente){
        if(clientes.contains(cliente)){
            clientes.removeIf(clienteLista ->  clienteLista.equals(cliente));
            return true;
        }
        return false;
    }

    public static Cliente consultarPorId(Long id){
        Cliente clienteRetorno = new Cliente();
        for (Cliente cliente: clientes) {
            if(cliente.getId().compareTo(id) == 0){
                clienteRetorno = cliente;
            }
        }
        return clienteRetorno;
    }

    public static Cliente consultarPorCpf(Long cpf){
        Cliente clienteRetorno = null;
        for (Cliente cliente: clientes) {
            if(cliente.getCpf().compareTo(cpf) == 0){
                clienteRetorno = cliente;
            }
        }
        return clienteRetorno;
    }

    public static boolean jaExiste(Long cpf){
        Cliente cliente = consultarPorCpf(cpf);
        return (cliente == null) ? false : true;
    }

    public static Cliente atualizar(Long id, Cliente clienteAtualizar){
        AtomicReference<Boolean> atualizado = new AtomicReference<>(false);
        clientes.forEach(clienteLista -> {
            if(clienteLista.getId().compareTo(id) == 0){
                clienteLista = clienteAtualizar;
                atualizado.set(true);
            }
        });

        if(atualizado.get()){
            return clienteAtualizar;
        } else {
            return null;
        }
    }

    private static Long gerarId(){
        if(clientes.isEmpty()){
            return 1L;
        }
        clientes.stream().sorted();
        return clientes.get(clientes.size()-1).getId()+1;
    }
}
