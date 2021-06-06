package service;

import model.Aluguel;
import model.Carro;
import model.Cliente;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;

public class AluguelService {

    public static LinkedList<Aluguel> alugueis = new LinkedList<>();

    public static LinkedList<Aluguel> listar(){
        return alugueis;
    }

    public static boolean adicionar(Aluguel aluguel){
        Long id = gerarId();
        aluguel.setId(id);
        if(alugueis.contains(aluguel)){
            return false;
        }
        alugueis.add(aluguel);
        return true;
    }

    public static boolean deletar(Aluguel aluguel){
        if(alugueis.contains(aluguel)){
            alugueis.removeIf(aluguelLista ->  aluguelLista.equals(aluguel));
            return true;
        }
        return false;
    }

    public static Aluguel consultarPorId(Long id){
        Aluguel aluguelRetorno = new Aluguel();
        for (Aluguel aluguel: alugueis) {
            if(aluguel.getId().compareTo(id) == 0){
                aluguelRetorno = aluguel;
            }
        }
        return aluguelRetorno;
    }

    public static LinkedList<Aluguel> consultarPorCliente(Cliente cliente){
        LinkedList<Aluguel> aluguelRetorno = new LinkedList<>();
        for (Aluguel aluguel: alugueis) {
            if(aluguel.getCliente().equals(cliente)){
                aluguelRetorno.add(aluguel);
            }
        }
        return aluguelRetorno;
    }

    public static LinkedList<Aluguel> consultarPorCarro(Carro carro){
        LinkedList<Aluguel> aluguelRetorno = new LinkedList<>();
        for (Aluguel aluguel: alugueis) {
            if(aluguel.getCarro().equals(carro)){
                aluguelRetorno.add(aluguel);
            }
        }
        return aluguelRetorno;
    }

    public static Aluguel atualizar(Long id, Aluguel aluguelAtualizar){
        AtomicReference<Boolean> atualizado = new AtomicReference<>(false);
        alugueis.forEach(aluguelLista -> {
            if(aluguelLista.getId().compareTo(id) == 0){
                aluguelLista = aluguelAtualizar;
                atualizado.set(true);
            }
        });

        if(atualizado.get()){
            return aluguelAtualizar;
        } else {
            return null;
        }
    }

    private static Long gerarId(){
        if(alugueis.isEmpty()){
            return 1L;
        }
        alugueis.stream().sorted();
        return alugueis.get(alugueis.size()-1).getId()+1;
    }

    public void inserirAlugueis(){
        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("Teste");
        cliente.setCpf(123L);

        Carro carro = new Carro();
        carro.setId(1L);
        carro.setAno(2021);
        carro.setMarca("Gol");
        carro.setPlaca("AAA1111");
        carro.setValor(150.00);

        Aluguel aluguel1 = new Aluguel();
        aluguel1.setId(1L);
        aluguel1.setCliente(cliente);
        aluguel1.setCarro(carro);
        aluguel1.setLocalRetirada("Brasília - DF");
        aluguel1.setDataRetirada("01/01/2021");
        aluguel1.setDataDevolucao("02/01/2021");
        aluguel1.setValorAluguel(200.50);

        Aluguel aluguel2 = new Aluguel();
        aluguel2.setId(2L);
        aluguel2.setCliente(cliente);
        aluguel2.setCarro(carro);
        aluguel2.setLocalRetirada("São Paulo - SP");
        aluguel2.setDataRetirada("01/10/2021");
        aluguel2.setDataDevolucao("02/10/2021");
        aluguel2.setValorAluguel(400.50);

        alugueis.add(aluguel1);
        alugueis.add(aluguel2);

    }
}
