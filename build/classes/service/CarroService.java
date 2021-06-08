package service;

import model.Carro;
import model.Cliente;
import model.EnumModelo;

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
        LinkedList<Carro> carrosRetorno = new LinkedList<>();
        for (Carro carro: carros) {
            if(carro.getMarca().equals(marca)){
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

    public static void inserirCarros(){
        Carro gol =
            new Carro(gerarId(), EnumModelo.GOL.getModelo(), 399.00, 2021, "AAA-1111", "A");
        Carro kwid =
            new Carro(gerarId(),EnumModelo.KWUID.getModelo(), 300.00, 2020, "AAA-2222", "A");
        Carro uno =
                new Carro(gerarId(),EnumModelo.UNO.getModelo(), 359.00, 2017, "AAA-3333", "A");
        Carro hb20s =
                new Carro(gerarId(),EnumModelo.HB20.getModelo(), 499.00, 2021, "BBB-1111", "FS");
        Carro cronos =
                new Carro(gerarId(),EnumModelo.CRONOS.getModelo(), 400.00, 2020, "BBB-2222", "FS");
        Carro nissan =
                new Carro(gerarId(),EnumModelo.NISSAN_VERSA.getModelo(), 459.00, 2017, "BBB-3333", "FS");
        Carro citroen =
                new Carro(gerarId(),EnumModelo.CITROEN_CACTOS.getModelo(), 699.00, 2021, "CCC-1111", "GC");
        Carro kicks =
                new Carro(gerarId(),EnumModelo.KICKS.getModelo(), 600.00, 2020, "CCC-2222", "GC");
        Carro duster =
                new Carro(gerarId(),EnumModelo.DUSTER.getModelo(), 659.00, 2017, "CCC-3333", "GC");
        carros.add(gol);
        carros.add(kwid);
        carros.add(uno);
        carros.add(hb20s);
        carros.add(cronos);
        carros.add(nissan);
        carros.add(citroen);
        carros.add(kicks);
        carros.add(duster);
    }
}
