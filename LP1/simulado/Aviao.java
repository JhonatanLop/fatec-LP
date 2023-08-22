public class Aviao {
    private String fabricante;
    private String modelo;
    private int numeroPassageiros;

    public Aviao(
        String fabricante,
        String modelo,
        int NumeroPassageiros) {
    this.fabricante = fabricante;
    this.modelo = modelo;
    this.numeroPassageiros = NumeroPassageiros;
    }

    public String getFabricante() { return fabricante; }
    public String getModelo() { return modelo; }
    public int getNumeroPassageiros() { return numeroPassageiros; }
    

    public static void cair(Aviao aviao){
        System.out.println("MAYDAY, MAYDAY, AVIÃO " + aviao.getModelo() + aviao.getFabricante() + "ESTÁ CAI*******");
    }

    public static void decolar(Aviao aviao) {
        System.out.println("decolagem permitida para o avião " + aviao.getFabricante() + aviao.getModelo() + ", boa viagem");
    }

    public static void pousar(Aviao aviao){
        System.out.println("pouso permitido para o aviaõ " + aviao.getFabricante() + aviao.getModelo());
    }

    public static void main(String[] Args) {
        Aviao av1 = new Aviao("boing" , "A340", 200);
        Aviao av2 = new Aviao("boing" , "A340", 200);
        Aviao av3 = new Aviao("Embraer" , "outrolá", 200);

        cair(av1);
        decolar(av3);
        pousar(av2);
    }
}