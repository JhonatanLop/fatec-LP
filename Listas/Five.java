package Listas;
import java.util.Random;
import java.util.Scanner;

public class Five {
    // Escreve um programa que sorteio, aleatoriamente, 10 números e armazene estes em um vetor.
    // Em seguida, o usuário digita um número e seu programa em Java deve acusar se o número
    // digitado está no vetor ou não. Se estiver, diga a posição que está. 

    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            Random gerador = new Random();
            
            int vec[] = new int[10];

            // preenche a lista com números aleatórios de 0 a 100
            for (int i = 0; i < vec.length; i++) {
                vec[i] = gerador.nextInt(100);
                System.out.println(vec[i]);
            }

            // recebe valor do usuário
            int chute;
            System.out.println("escolha um número de 0 a 100");
            chute = leia.nextInt();

            // verifica se ele acertou o número
            boolean acertou = false;
            int position = 0;
            for (int j = 0; j < vec.length; j++) {
                if (chute == vec[j]) {
                    acertou = true;
                    position = j + 1;
                }
            }
            if (acertou) {
                System.out.printf("Você acertou!\n o númeor está na posição %d",position);
            } else {
                System.out.println("Vc errou...");
            }
        }
    }
}
