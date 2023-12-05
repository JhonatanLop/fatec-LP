package org.openjfx.travel.classes;

import java.util.Date;

public class Viagem {
    String passageiros;
    String lugarIda;
    String lugarVolta;
    String transpIda;
    String tranpVolta;
    Date dataIda;
    Date dataVolta;

    public Viagem(
        String passageiros,
        String lugarIda,
        String lugarVolta,
        String transpIda,
        String tranpVolta,
        Date dataIda,
        Date dataVolta
    ){ 
        this.passageiros = passageiros;
        this.lugarIda = lugarIda;
        this.lugarVolta = lugarVolta;
        this.transpIda = transpIda;
        this.tranpVolta = tranpVolta;
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
    }

    public Viagem(String string, String string2, String string3, String string4, String string5,
            java.sql.Date convertToDate, java.sql.Date convertToDate2) {
    }

    public String getPassageiros() { return passageiros; }
    public String getLugarIda() { return lugarIda; }
    public String getLugarVolta() { return lugarVolta; }
    public String getTranspIda() { return transpIda; }
    public String getTranpVolta() { return tranpVolta; }
    public Date getDataIda() { return dataIda; }
    public Date getDataVolta() { return dataVolta; }
    
    public void setPassageiros(String passageiros) { this.passageiros = passageiros; }
    public void setLugarIda(String lugarIda) { this.lugarIda = lugarIda; }
    public void setLugarVolta(String lugarVolta) { this.lugarVolta = lugarVolta; }
    public void setTranspIda(String transpIda) { this.transpIda = transpIda; }
    public void setTranpVolta(String tranpVolta) { this.tranpVolta = tranpVolta; }
    public void setDataIda(Date dataIda) { this.dataIda = dataIda; }
    public void setDataVolta(Date dataVolta) { this.dataVolta = dataVolta; }
}