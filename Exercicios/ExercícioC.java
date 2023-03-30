package Exercicios;
import java.util.Scanner;
import java.util.ArrayList;

public class ExercícioC {
    static Scanner leia = new Scanner(System.in);
    static ArrayList<Integer> lista = new ArrayList<Integer>();
    
    
    // x = leia_inteiros("")
    // a,b,c = x[1], [2], [3]
    // se a + b == c ou a == b + c ou b == a + c ou a == b ou a == c ou b == c
    //     escreva "S"
    // senão
    //     escreva "N"
    // fim

    static public void calcular() {
        for (int i = 0; i < 3; i++) {
            System.out.println("digite os valores de x");
            int x = leia.nextInt();
            lista.add(x);
        }
        int a, b, c;
        a = lista.get(0);
        b = lista.get(1);
        c = lista.get(2);

        if (a + b == c || a == b + c || b == a + c || a == b || a == c || b == c) {
            System.out.println("S");
        }
        else{
            System.out.println("N");
        }
    }

    public static void main(String[] args) {
        calcular();
    }
}
