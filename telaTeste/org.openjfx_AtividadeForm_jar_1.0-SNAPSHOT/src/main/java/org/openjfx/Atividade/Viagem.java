package org.openjfx.Atividade;

public class Viagem {
    private String documentoViajante;
	private String localChegada;
	private String localPartida;
	private String nomeViajante;
	private String transporte;
	
	public Viagem(String documentoViajante,
                    String localChegada,
                    String localPartida,
                    String nomeViajante,
                    String transporte) {

        this.documentoViajante = documentoViajante;
        this.localChegada = localChegada;
        this.localPartida = localPartida;
        this.nomeViajante = nomeViajante;
        this.transporte = transporte;
	}
	
    public void getDocumentoViajante(String documentoViajante) {
        this.documentoViajante = documentoViajante;
    }
    
    public void getLocalChegada(String localChegada) {
        this.localChegada = localChegada;
    }

    public void getLocalPartida(String localPartida) {
        this.localPartida = localPartida;
    }

    public void getNomeViajante(String nomeViajante) {
        this.nomeViajante = nomeViajante;
    }

    public void getTransporte(String transporte) {
        this.transporte = transporte;
    }

    public void setDocumentoViajante(String documentoViajante) { 
        
    }
}
