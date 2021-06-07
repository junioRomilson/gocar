package model;

public class Cliente {
    private Long id;
    private String nome;
    private Long cpf;
    private String email;
    private String contato;
    private Long rg;
    private Long cep;
    private String uf;
    private String logradouro;
    private String bairro;
    private String cidade;

    public Cliente() {}

    public Cliente(Long id,String nome, Long cpf, String email, String contato,
                   Long rg, Long cep, String uf, String logradouro, String bairro, String cidade) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.contato = contato;
        this.rg = rg;
        this.cep = cep;
        this.uf = uf;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Cliente(String nome, Long cpf, String email, String contato,
                   Long rg, Long cep, String uf, String logradouro, String bairro, String cidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.contato = contato;
        this.rg = rg;
        this.cep = cep;
        this.uf = uf;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Long getRg() {
        return rg;
    }

    public void setRg(Long rg) {
        this.rg = rg;
    }

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
