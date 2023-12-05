package org.openjfx.atividade;

public class Veiculo {
    String marca;
    String modelo;
    String ano;
    String tipo;

    public Veiculo(String marca, String modelo, String ano, String tipo){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
    }

    public String getMarca() { return marca; }

    public String getModelo() { return modelo; }

    public String getAno() { return ano; }

    public String getTipo() { return tipo; }
}
