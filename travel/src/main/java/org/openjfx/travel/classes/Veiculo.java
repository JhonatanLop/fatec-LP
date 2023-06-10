package org.openjfx.travel.classes;

import java.util.Date;
public class Veiculo {
    String marca;
    String modelo;
    Date anoFab;
    String identf;
    int numChassi;
    String tipo;
    String carroceria;
    int capacPassag;
    double espacoCarg;
    String motorizacao;
    String transmissao;
    double consumo;

    public Veiculo(
        String marca,
        String modelo,
        Date anoFab,
        String identf,
        int numChassi,
        String tipo,
        String carroceria,
        int capacPassag,
        double espacoCarg,
        String motorizacao,
        String transmissao,
        double consumo
    ){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.identf = identf;
        this.numChassi = numChassi;
        this.tipo = tipo;
        this.carroceria = carroceria;
        this.capacPassag = capacPassag;
        this.espacoCarg = espacoCarg;
        this.motorizacao = motorizacao;
        this.transmissao = transmissao;
        this.consumo = consumo;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public Date getAnoFab() { return anoFab; }
    public String getIdentf() { return identf; }
    public int getNumChassi() { return numChassi; }
    public String getTipo() { return tipo; }
    public String getCarroceria() { return carroceria; }
    public int getCapacPassag() { return capacPassag; }
    public double getEspacoCarg() { return espacoCarg; }
    public String getMotorizacao() { return motorizacao; }
    public String getTransmissao() { return transmissao; }
    public double getConsumo() { return consumo; }

    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setAnoFab(Date anoFab) { this.anoFab = anoFab; }
    public void setIdentf(String identf) { this.identf = identf; }
    public void setNumChassi(int numChassi) { this.numChassi = numChassi; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setCarroceria(String carroceria) { this.carroceria = carroceria; }
    public void setCapacPassag(int capacPassag) { this.capacPassag = capacPassag; }
    public void setEspacoCarg(double espacoCarg) { this.espacoCarg = espacoCarg; }
    public void setMotorizacao(String motorizacao) { this.motorizacao = motorizacao; }
    public void setTransmissao(String transmissao) { this.transmissao = transmissao; }
    public void setConsumo(double consumo) { this.consumo = consumo; }

    
}
