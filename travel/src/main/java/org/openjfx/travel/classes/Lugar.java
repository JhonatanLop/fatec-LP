package org.openjfx.travel.classes;

public class Lugar {
    String nome;
    String pais;
    String estado;
    String cidade;
    String planejamentoT;
    int cep;
    String cafe;
    int nBanheiro;
    int nHospedes;
    int nQuartos;
    boolean wifiFree;
    boolean petPermission;

    public Lugar(
        String nome,
        String pais,
        String estado,
        String cidade,
        String planejamentoT,
        int cep,
        String cafe,
        int nBanheiro,
        int nHospedes,
        int nQuartos,
        boolean wifiFree,
        boolean petPermission
    ) {
        this.nome = nome;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.planejamentoT = planejamentoT;
        this.cep = cep;
        this.cafe = cafe;
        this.nBanheiro = nBanheiro;
        this.nHospedes = nHospedes;
        this.nQuartos = nQuartos;
        this.wifiFree = wifiFree;
        this.petPermission = petPermission;
    }

    public void setNome(String nome) { this.nome = nome; }
    public void setPais(String pais) { this.pais = pais; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public void setPlanejamentoT(String planejamentoT) { this.planejamentoT = planejamentoT; }
    public void setCep(int cep) { this.cep = cep; }
    public void setCafe(String cafe) { this.cafe = cafe; }
    public void setnBanheiro(int nBanheiro) { this.nBanheiro = nBanheiro; }
    public void setnHospedes(int nHospedes) { this.nHospedes = nHospedes; }
    public void setnQuartos(int nQuartos) { this.nQuartos = nQuartos; }
    public void setWifiFree(boolean wifiFree) { this.wifiFree = wifiFree; }
    public void setPetPermission(boolean petPermission) { this.petPermission = petPermission; } 

    public String getNome() { return nome; }
    public String getPais() { return pais; }
    public String getEstado() { return estado; }
    public String getCidade() { return cidade; }
    public String getPlanejamentoT() { return planejamentoT; }
    public int getCep() { return cep; }
    public String getCafe() { return cafe; }
    public int getnBanheiro() { return nBanheiro; }
    public int getnHospedes() { return nHospedes; }
    public int getnQuartos() { return nQuartos; }
    public boolean isWifiFree() { return wifiFree; }
    public boolean isPetPermission() { return petPermission; }
}
