package abralho.lp;

import java.util.Arrays;
import java.util.Collections;

public class Baralho {
    private Carta[] cartas = new Carta[4];
    private int indice = cartas.length;

    public Baralho (){

        // nipe paus
        // for(int i = 0; i < 10; i++){
        //     Carta card = new Carta(i,"paus");
        // }
    }
    
    public void incluirCarta(int indice, Carta carta){
        cartas[indice] = carta; 
    }

    public static Carta distribuirCarta(Baralho baralho){
        Carta[] cartas = baralho.getCartas();
        for (int i = cartas.length; i <= cartas.length; i--) {
            if (cartas[i] != null) {
                Carta novaCarta = cartas[i];
                return novaCarta;
            }
        }
        return null;
    }

    public static Baralho embaralharBaralho(Baralho baralho){
        for (int i = 0; i < 5; i++){
            int ale1 = (int) (Math.random() * baralho.getIndice());
            int ale2 = (int) (Math.random() * baralho.getIndice());
            Collections.swap(Arrays.asList(baralho.cartas), ale1, ale2);
        }
        return baralho;
    }

    public static boolean hasCarta(Baralho baralho){
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



    public Carta[] getCartas() { return cartas; }
    public int getIndice() { return indice; }
    public void setCartas(Carta[] cartas) { this.cartas = cartas; }
    public void setIndice(int indice) { this.indice = indice; }}
