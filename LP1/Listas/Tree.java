package Listas;
import java.util.Scanner;

// Implemente um aplicativo em Java que peça um número inicial ao usuário, uma razão e calcule
// os termos de uma P.A (Progressão Aritmética), armazenando esses valores em um vetor de tamanho 10. 

public class Tree {
    static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) {
        int vec[] = new int[10];

        // recebe primeiro termo da pa
        System.out.println("digite o primeiro termo da PA");
        int pa = leia.nextInt();

        // recebe primeiro a razão
        System.out.println("digite a razão da PA");
        int razao = leia.nextInt();

        // constroi a sequencia
        for (int i = 0 ; i <10; i++) {
            vec[i] = pa + (i * razao);
        }

        // printa a sequencia
        for (int j = 0; j < vec.length; j++) {
            System.out.println("o termo " + (j+1) + " é: " +vec[j]);
        }
    }
}
