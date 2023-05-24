package org.travel.classes;

import java.util.Date;

public class Passageiros {
    private String nome;
    private int CPF;
    private int telefone;
    private Date nascimento;
    private String email;
    private String password;
    private int cep;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String municipio;
    private String estado;

    public Passageiros(
        String nome,
        int CPF,
        int telefone,
        Date nascimento,
        String email,
        String password,
        int cep,
        String logradouro,
        int numero,
        String complemento,
        String bairro,
        String municipio,
        String estado
    ) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.email = email;
        this.password = password;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.municipio = municipio;
        this.estado = estado;
    }

    public String getNome() { return nome; }
    public int getCPF() { return CPF; }
    public int getTelefone() { return telefone; }
    public Date getNascimento() { return nascimento; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public int getCep() { return cep; }
    public String getLogradouro() { return logradouro; }
    public int getNumero() { return numero; }
    public String getComplemento() { return complemento; }
    public String getBairro() { return bairro; }
    public String getMunicipio() { return municipio; }
    public String getEstado() { return estado; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCPF(int CPF) { this.CPF = CPF; }
    public void setTelefone(int telefone) { this.telefone = telefone; }
    public void setNascimento(Date nascimento) { this.nascimento = nascimento; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setCep(int cep) { this.cep = cep; }
    public void setLogradouto(String logradouro) { this.logradouro = logradouro; }
    public void setNumero(int numero) { this.numero = numero; }
    public void setComplemento(String complemento) { this.complemento = complemento; }
    public void setBairro(String bairro) { this.bairro = bairro; }
    public void setMunicipio(String municipio) { this.municipio = municipio; }
    public void setEstado(String estado) { this.estado = estado; }

}
