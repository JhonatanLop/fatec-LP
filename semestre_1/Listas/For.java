package Listas;
import java.util.Scanner;

public class For {
    // Implemente um aplicativo em Java que peça um número inicial ao usuário, uma
    // razão e calcule os termos de uma P.G (Progressão Geométrica), armazenando esses
    // valores em um vetor de tamanho 10.

    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            int vec[] = new int[10];
            
            // recebe o primeiro indice da progressão
            System.out.println("digite o primeiro indice");
            int numInc = leia.nextInt();
            vec[0] = numInc;

            // recebe a razão da progressão
            System.out.println("digite a razão:");
            int razao = leia.nextInt();

            // preenche o vetor
            for (int i = 1; i < vec.length; i++) {  
                // numero anterior é o atual - 1
                int numAnt = i - 1;
                // nessa posição o vetor receberá o valor anterior vezes a razão
                vec[i] = vec[numAnt] * razao;
            }

            // printa os itens
            for (int j = 0; j < vec.length; j++){
                System.out.println((j + 1) + "º iten da lista é: " + vec[j]);
            }
        }
    }
}
