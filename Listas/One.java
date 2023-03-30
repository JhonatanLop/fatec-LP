package Listas;
import java.util.Scanner;

public class One {
    
    // implemente um algoritmo em java que receba 10 números e armazene-os num vetor
    // e ele indique qual elemento é o menor e o valor.
    
    static Scanner leia = new Scanner(System.in);
    public static void main (String args[]){
        int slots = 10;
        // criando vetor
        int vec [] = new int[slots];

        // preenchendo os espaços
        for(int i = 0; i < vec.length; i++){
            int cont = i + 1;
            System.out.println("digite o " + cont + "º número");
            vec[i] = leia.nextInt();
        }

        //printa vetor pra debug
        for (int j = 0; j < vec.length; j++) {
            System.out.println("vec["+j+"]" + " = " + vec[j]);   
        }

        // verificação do menor número
        int menor;
        int posicao;
        menor = vec[0];
        posicao = 0;

        // lendo o menor número
        for(int i: vec){
            if (vec[i] < menor) {
                menor = vec[i];
                posicao = i;
            }
        }
        System.out.println("menor número: " + menor);
        System.out.println("posição: " + posicao);
    }
}
