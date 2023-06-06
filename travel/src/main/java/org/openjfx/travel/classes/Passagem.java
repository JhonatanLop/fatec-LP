package org.openjfx.travel.classes;

import java.util.Date;
import java.util.List;

public class Passagem {
    private Viagem viagem;
    private List<Passageiros> Passageiros;
    private Lugar origim;
    private Lugar destino;
    private Veiculo tranpIda;
    private Veiculo tranpVolta;
    private Date dataIda;
    private Date dataVolta;

    public Passagem(
        Viagem viagem,
        List<Passageiros> Passageiros,
        Lugar origim,
        Lugar destino,
        Veiculo tranpIda,
        Veiculo tranpVolta,
        Date dataIda,
        Date dataVolta
    ) {
        this.viagem = viagem;
        this.Passageiros = Passageiros;
        this.origim = origim;
        this.destino = destino;
        this.tranpIda = tranpIda;
        this.tranpVolta = tranpVolta;
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
    }

    public Viagem getViagem() { return viagem; }
    public List<Passageiros> getPassageiros() { return Passageiros; }
    public Lugar getOrigim() { return origim; }
    public Lugar getDestino() { return destino; }
    public Veiculo getTranpIda() { return tranpIda; }
    public Veiculo getTranpVolta() { return tranpVolta; }
    public Date getDataIda() { return dataIda; }
    public Date getDataVolta() { return dataVolta; }
    
    public void setViagem(Viagem viagem) { this.viagem = viagem; }
    public void setPassageiros(List<Passageiros> passageiros) { Passageiros = passageiros; }
    public void setOrigim(Lugar origim) { this.origim = origim; }
    public void setDestino(Lugar destino) { this.destino = destino; }
    public void setTranpIda(Veiculo tranpIda) { this.tranpIda = tranpIda; }
    public void setTranpVolta(Veiculo tranpVolta) { this.tranpVolta = tranpVolta; }
    public void setDataIda(Date dataIda) { this.dataIda = dataIda; }
    public void setDataVolta(Date dataVolta) { this.dataVolta = dataVolta; }}