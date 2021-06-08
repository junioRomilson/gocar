package model;

public class Carro {
    private Long id;
    private String marca;
    private Double valor;
    private int ano;
    private String placa;
    private String grupo;

    public Carro() {

    }

    public Carro(Long id, String marca, Double valor, int ano, String placa, String grupo) {
        this.id = id;
        this.marca = marca;
        this.valor = valor;
        this.ano = ano;
        this.placa = placa;
        this.grupo = grupo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

}
