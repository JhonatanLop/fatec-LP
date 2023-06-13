package org.openjfx.travel.classes;

import java.util.Date;
import java.util.List;

public class Viagem {
    Passageiros passageiros;
    Lugar lugarIda;
    Lugar lugarVolta;
    Veiculo transpIda;
    Veiculo tranpVolta;
    Date dataIda;
    Date dataVolta;

    public Viagem(
        Passageiros passageiros,
        Lugar lugarIda,
        Lugar lugarVolta,
        Veiculo transpIda,
        Veiculo tranpVolta,
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

    public Passageiros getPassageiros() { return passageiros; }
    public Lugar getLugarIda() { return lugarIda; }
    public Lugar getLugarVolta() { return lugarVolta; }
    public Veiculo getTranspIda() { return transpIda; }
    public Veiculo getTranpVolta() { return tranpVolta; }
    public Date getDataIda() { return dataIda; }
    public Date getDataVolta() { return dataVolta; }
    
    public void setPassageiros(Passageiros passageiros) { this.passageiros = passageiros; }
    public void setLugarIda(Lugar lugarIda) { this.lugarIda = lugarIda; }
    public void setLugarVolta(Lugar lugarVolta) { this.lugarVolta = lugarVolta; }
    public void setTranspIda(Veiculo transpIda) { this.transpIda = transpIda; }
    public void setTranpVolta(Veiculo tranpVolta) { this.tranpVolta = tranpVolta; }
    public void setDataIda(Date dataIda) { this.dataIda = dataIda; }
    public void setDataVolta(Date dataVolta) { this.dataVolta = dataVolta; }

}
