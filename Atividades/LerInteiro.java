package Atividades;
import java.util.Scanner;

public class LerInteiro {
    Scanner leia = new Scanner(System.in);
    int n;
    int bobo;
    String resp = "S";
    
    public String comparador() {
        System.out.println("digite o valor de n ");
        n = leia.nextInt();
        System.out.println("digite o valor de bobo ");
        bobo = leia.nextInt();

      for (; n > bobo; bobo++) {
        resp += "\nN";
      }
        return resp;
    }

    public static void main(String[] args) {
        LerInteiro resposta = new LerInteiro();
        System.out.println(resposta.comparador());
    }
}
