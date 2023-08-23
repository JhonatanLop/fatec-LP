package abralho.lp;

import java.util.Arrays;
import java.util.Collections;

public class Baralho {
    private Carta[] cartas = new Carta[57];
    private int indice = 56;

    // public Baralho() {
    // Carta[] cartas = new Carta[56];
    //     // nipe paus
    //     for(int i = 0; i < 14; i++){
    //         if(i == 0){
    //             Carta card = new Carta("A","paus");
    //             cartas[i] = card;
    //         }
    //         else if (i != 0){
    //             String nome = Integer.toString(i + 1);
    //             Carta card = new Carta(nome,"paus");
    //             cartas[i] = card;
    //         }
    //     }

    //     // nipe ouro
    //     for(int i = 0; i < 15; i++){
    //         if(i == 0){
    //             Carta card = new Carta("A","paus");
    //             cartas[i] = card;
    //         }
    //         else if (i != 0){
    //             String nome = Integer.toString(i + 1);
    //             Carta card = new Carta(nome,"ouro");
    //             cartas[i+13] = card;
    //         }
    //     }

    //     // nipe espadas
    //     for(int i = 0; i < 15; i++){
    //         String nome = Integer.toString(i + 1);
    //         Carta card = new Carta(nome,"espadas");
    //         cartas[i+26] = card;
    //     }

    //     // nipe copas
    //     for(int i = 0; i < 15; i++){
    //         String nome = Integer.toString(i + 1);
    //         Carta card = new Carta(nome,"copas");
    //         cartas[i+39] = card;
    //     }

    //     for(int i = 0; i < 4; i ++){
    //         Carta card = new Carta("coringa","coringa");
    //         cartas[i+52] = card;
    //     }
    // }

    public Baralho(){
        cartas = new Carta[56];
        // cartas[0] = new Carta("A","Espadas");
        // cartas[1] = new Carta("A","Paus");
        // cartas[2] = new Carta("A","Ouros");
        // cartas[3] = new Carta("A","Copas");
        // cartas[4] = new Carta("K","Espadas");
        // cartas[5] = new Carta("K","Paus");
        // cartas[6] = new Carta("K","Ouros");
        // cartas[7] = new Carta("K","Copas");
        // cartas[8] = new Carta("Q","Espadas");
        // cartas[9] = new Carta("Q","Paus");
        // cartas[10] = new Carta("Q","Ouros");
        // cartas[11] = new Carta("Q","Copas");
        // cartas[12] = new Carta("J","Espadas");
        // cartas[13] = new Carta("J","Paus");
        // cartas[14] = new Carta("J","Ouros");
        // cartas[15] = new Carta("J","Copas");
        cartas[0] = new Carta("Joker","Joker");
        cartas[1] = new Carta("Joker","Joker");
        cartas[2] = new Carta("Joker","Joker");
        cartas[3] = new Carta("Joker","Joker");
        String[] naipes = {"copas", "paus", "ouros", "espadas"};
        String[] nomes = {"AS", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int conta = 4;
        for (int i = 0; i < naipes.length; i++) {
            for (int x = 0; x < 13; x++) {
                cartas[conta] = new Carta(nomes[x],naipes[i]);
                conta++;
            }
        }
    }       

    public void incluirCarta(int indice, Carta carta) {
        cartas[indice] = carta;
    }

    public static Carta distribuirCarta(Baralho baralho) {
        Carta[] cartas = baralho.getCartas();
        Carta novaCarta = cartas[0];
        int cont = 0;
        for (int i = cartas.length; i <= cartas.length; i--) {
            if (cartas[i] != null) {
                novaCarta = cartas[i];
                cartas[i] = null;
                return novaCarta;
            } else {
                cont += 1;
            }
        }
        if ((cartas.length - cont) > 0) {
            return novaCarta;
        } else {
            return null;
        }
    }

    public static Baralho embaralhar(Baralho baralho) {
        for (int i = 0; i < 5; i++) {
            int ale1 = (int) (Math.random() * baralho.getIndice());
            int ale2 = (int) (Math.random() * baralho.getIndice());
            Collections.swap(Arrays.asList(baralho.cartas), ale1, ale2);
        }
        return baralho;
    }

    public static boolean hasCarta(Baralho baralho) {
        int qtd = 0;
        for (int i = 0; i < baralho.cartas.length; i++) {
            if (baralho.cartas[i] != null) {
                qtd += 1;
            }
        }
        if (qtd > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void ImprimirBaralho(Baralho baralho) {
        for (int i = 0; i < 56; i++) {
            if (baralho.cartas[i] != null) {                
                System.out.println(baralho.cartas[i].getNome() + " " + baralho.cartas[i].getNaipe());
            }
        }
    }

    public Carta[] getCartas() { return cartas; }
    public int getIndice() { return indice; }
    public void setCartas(Carta[] cartas) { this.cartas = cartas; }
    public void setIndice(int indice) { this.indice = indice; }
}