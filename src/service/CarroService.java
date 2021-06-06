package service;

import model.Carro;
import model.Cliente;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;

public class CarroService {

    public static LinkedList<Carro> carros = new LinkedList<>();

    public static LinkedList<Carro> listar(){
        return carros;
    }

    public static boolean adicionar(Carro carro){
        Long id = gerarId();
        carro.setId(id);
        if(carros.contains(carro)){
            return false;
        }
        carros.add(carro);
        return true;
    }

    public static boolean deletar(Carro carro){
        if(carros.contains(carro)){
            carros.removeIf(carroLista ->  carroLista.equals(carro));
            return true;
        }
        return false;
    }

    public static Carro consultarPorId(Long id){
        Carro carroRetorno = new Carro();
        for (Carro carro: carros) {
            if(carro.getId().compareTo(id) == 0){
                carroRetorno = carro;
            }
        }
        return carroRetorno;
    }

    public static Carro consultarPorPlaca(String placa){
        Carro carroRetorno = null;
        for (Carro carro: carros) {
            if(carro.getPlaca().equalsIgnoreCase(placa)){
                carroRetorno = carro;
            }
        }
        return carroRetorno;
    }

    public static LinkedList<Carro> consultarPorMarca(String marca){
        LinkedList<Carro> carrosRetorno = null;
        for (Carro carro: carros) {
            if(carro.getMarca().equalsIgnoreCase(marca)){
                carrosRetorno.add(carro);
            }
        }
        return carrosRetorno;
    }

    public static boolean jaExiste(String placa){
        Carro carro = consultarPorPlaca(placa);
        return (carro == null) ? false : true;
    }

    public static Carro atualizar(Long id, Carro carroAtualizar){
        AtomicReference<Boolean> atualizado = new AtomicReference<>(false);
        carros.forEach(carroLista -> {
            if(carroLista.getId().compareTo(id) == 0){
                carroLista = carroAtualizar;
                atualizado.set(true);
            }
        });

        if(atualizado.get()){
            return carroAtualizar;
        } else {
            return null;
        }
    }

    private static Long gerarId(){
        if(carros.isEmpty()){
            return 1L;
        }
        carros.stream().sorted();
        return carros.get(carros.size()-1).getId()+1;
    }
}
