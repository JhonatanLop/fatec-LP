package Atividades;

import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class ExercicioB {
    static Scanner leia = new Scanner(System.in);

    // entrada = leia_inteiros("")
    // a = entrada[1]
    // b = entrada[2]
    // escreva (a/b) formato "%2.f"

    // transformar o pseudocódigo em código java

    static public void calcular() {
        int a;
        System.out.println("digite o primeiro número");
        a = leia.nextInt();
        int b;
        System.out.println("digite o segundo número");
        b = leia.nextInt();

        double resultado = (a / b);
        System.out.printf("%.2f", resultado);
    }

    public static void main(String[] args) {
        calcular();
    }
}