package Listas;
import java.util.Scanner;
import java.util.Vector;

public class Two {
    // Implemente um programa em Java que peça 10 números, armazene eles em um vetor 
    // e diga qual elemento é o maior, qual é o menor e seus valores.

    public static void main (String[]args) {
        Scanner leia = new Scanner(System.in);
        
        int tamanho = 10;
        int vec[] = new int[10];
        int menor = Integer.MAX_VALUE;
        int posicao;
        posicao = 0;

        // lendo o menor número
        for(int i= 0; i < tamanho; i++){
            System.out.printf("Digite o número na posição: " + (i+1));
            vec[i] = leia.nextInt();
            if (vec[i] < menor) {
                menor = vec[i];
                posicao = i;
            }
        }
        System.out.println("menor número: " + menor);
        // formatando posição
        System.out.println("posição: " + (posicao + 1));
    }
}
