package org.openjfx.travel.classes;

public class Lugar {
    String nome;
    double latitude;
    double longitude;
    String planejamentoT;
    int cep;
    boolean cafe;
    int nBanheiro;
    int nHospedes;
    int nQuartos;
    boolean wifiFree;
    boolean petPermission;

    public Lugar(
        String nome,
        double latitude,
        double longitude,
        String planejamentoT,
        int cep,
        boolean cafe,
        int nBanheiro,
        int nHospedes,
        int nQuartos,
        boolean wifiFree,
        boolean petPermission
    ) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
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
    public void setLatitude(double latitude) { this.latitude = latitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }
    public void setPlanejamentoT(String planejamentoT) { this.planejamentoT = planejamentoT; }
    public void setCep(int cep) { this.cep = cep; }
    public void setCafe(boolean cafe) { this.cafe = cafe; }
    public void setnBanheiro(int nBanheiro) { this.nBanheiro = nBanheiro; }
    public void setnHospedes(int nHospedes) { this.nHospedes = nHospedes; }
    public void setnQuartos(int nQuartos) { this.nQuartos = nQuartos; }
    public void setWifiFree(boolean wifiFree) { this.wifiFree = wifiFree; }
    public void setPetPermission(boolean petPermission) { this.petPermission = petPermission; } 

    public String getNome() { return nome; }
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public String getPlanejamentoT() { return planejamentoT; }
    public int getCep() { return cep; }
    public boolean getCafe() { return cafe; }
    public int getnBanheiro() { return nBanheiro; }
    public int getnHospedes() { return nHospedes; }
    public int getnQuartos() { return nQuartos; }
    public boolean isWifiFree() { return wifiFree; }
    public boolean isPetPermission() { return petPermission; }
}
