package org.openjfx.atividade;

public class Viagem {
    private String documentoViajante;
	private String localChegada;
	private String localPartida;
	private String nomeViajante;
	private String transporte;
    private String dataChegada;
    private String dataPartida;
	
	public Viagem(String documentoViajante,
                    String localChegada,
                    String localPartida,
                    String nomeViajante,
                    String transporte,
                    String dataChegada,
                    String dataPartida){

        this.documentoViajante = documentoViajante;
        this.localChegada = localChegada;
        this.localPartida = localPartida;
        this.nomeViajante = nomeViajante;
        this.transporte = transporte;
        this.dataChegada = dataChegada;
        this.dataPartida = dataPartida;
	}

    public String getDocumentoViajante() { return documentoViajante; }

    public void setDocumentoViajante(String documentoViajante) { this.documentoViajante = documentoViajante; }

    public String getLocalChegada() { return localChegada; }

    public void setLocalChegada(String localChegada) { this.localChegada = localChegada; }

    public String getLocalPartida() { return localPartida; }

    public void setLocalPartida(String localPartida) { this.localPartida = localPartida; }

    public String getNomeViajante() { return nomeViajante; }

    public void setNomeViajante(String nomeViajante) { this.nomeViajante = nomeViajante; }

    public String getTransporte() { return transporte; }

    public void setTransporte(String transporte) { this.transporte = transporte; }

    public String getDataChegada() { return dataChegada; }

    public void setDataChegada(String dataChegada) { this.dataChegada = dataChegada; }

    public String getDataPartida() { return dataPartida; }

    public void setDataPartida(String dataPartida) { this.dataPartida = dataPartida; }
}
