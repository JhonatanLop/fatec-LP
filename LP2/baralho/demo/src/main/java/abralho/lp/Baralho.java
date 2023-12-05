package abralho.lp;

import java.util.Arrays;
import java.util.Collections;

public class Baralho {
    private Carta[] cartas = new Carta[57];
    private int indice = 56;

    public Baralho(){
        cartas = new Carta[56];
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