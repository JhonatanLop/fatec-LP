package abralho.lp;

import java.util.Scanner;

public class Main {
    static Scanner leia = new Scanner(System.in);
    static Baralho baralho = new Baralho();
    
    
    public static void main(String[] args) {
        int resp;
        while (true){
            System.out.println("qual metodo desja usar?\n1- distribuir cartas\n2- embaralhar\n3- Verificar se há cartas\n4- Imprimir baralho");
            resp = leia.nextInt();
            if (resp == 1) {
                Carta carta = Baralho.distribuirCarta(baralho);
                System.out.println("A carte é:"+carta.getNaipe()+carta.getNome());
            } else if(resp == 2) {
                baralho = Baralho.embaralhar(baralho);
            } else if(resp == 3) {
                System.out.println(Baralho.hasCarta(baralho));
            } else if(resp == 4) {
                Baralho.ImprimirBaralho(baralho);
            }
        }
    }
}
