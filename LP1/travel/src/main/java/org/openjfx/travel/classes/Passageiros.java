package org.openjfx.travel.classes;

import java.util.Date;

public class Passageiros {
    private int psId;
    private String nome;
    private int CPF;
    private int telefone;
    private Date nascimento;
    private String email;
    private String password;
    private int cep;
    private String logradouro;
    private String numero;
    private String bairro;
    private String municipio;
    private String uf;

    // construtor sem id
    public Passageiros(
        String nome,
        int CPF,
        int telefone,
        Date nascimento,
        String email,
        String password,
        int cep,
        String logradouro,
        String numero,
        String bairro,
        String municipio,
        String uf
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
        this.bairro = bairro;
        this.municipio = municipio;
        this.uf = uf;
    }

    // construtor com id
    public Passageiros(
        int psId,
        String nome,
        int CPF,
        int telefone,
        Date nascimento,
        String email,
        String password,
        int cep,
        String logradouro,
        String numero,
        String bairro,
        String municipio,
        String uf
    ) {
        this.psId = psId;
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.email = email;
        this.password = password;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.municipio = municipio;
        this.uf = uf;
    }

    public int getId() { return psId; }
    public String getNome() { return nome; }
    public int getCPF() { return CPF; }
    public int getTelefone() { return telefone; }
    public Date getNascimento() { return nascimento; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public int getCep() { return cep; }
    public String getLogradouro() { return logradouro; }
    public String getNumero() { return numero; }
    public String getBairro() { return bairro; }
    public String getMunicipio() { return municipio; }
    public String getUf() { return uf; }

    public void setId(int psId) { this.psId = psId; }
    public void setNome(String nome) { this.nome = nome; }
    public void setCPF(int CPF) { this.CPF = CPF; }
    public void setTelefone(int telefone) { this.telefone = telefone; }
    public void setNascimento(Date nascimento) { this.nascimento = nascimento; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setCep(int cep) { this.cep = cep; }
    public void setLogradouto(String logradouro) { this.logradouro = logradouro; }
    public void setNumero(String numero) { this.numero = numero; }
    public void setBairro(String bairro) { this.bairro = bairro; }
    public void setMunicipio(String municipio) { this.municipio = municipio; }
    public void setUf(String uf) { this.uf = uf; }

}
