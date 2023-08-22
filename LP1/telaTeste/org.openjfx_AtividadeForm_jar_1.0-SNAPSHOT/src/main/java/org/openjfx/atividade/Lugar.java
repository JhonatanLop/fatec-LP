package org.openjfx.atividade;

public class Lugar {
    String nome;
    String pais;
    String estado;
    String cidade;
    
    public Lugar(String nomeLugar, String pais2, String estado2, String cidade2) { this.nome = nomeLugar; this.pais = pais2;
        this.estado = estado2;
        this.cidade = cidade2;
    }

    public String getNome() { return nome; }

    public String getPais() { return pais; }

    public String getEstado() { return estado; }

    public String getCidade() { return cidade; }

    public void setNome(String nome) { this.nome = nome; }

    public void setPais(String pais) { this.pais = pais; }

    public void setEstado(String estado) { this.estado = estado; }

    public void setCidade(String cidade) { this.cidade = cidade; }
    
}
