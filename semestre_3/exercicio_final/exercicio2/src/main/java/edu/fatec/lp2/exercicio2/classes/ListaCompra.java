package edu.fatec.lp2.exercicio2.classes;

import java.util.ArrayList;

import edu.fatec.lp2.exercicio2.interfaces.Calculavel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ListaCompra implements Calculavel{
    private ArrayList<ItemCompra> itensCompra;
    private int qtdeMax;


    public ListaCompra(int qtdeMax) {
        this.qtdeMax = qtdeMax;
        this.itensCompra = new ArrayList<ItemCompra>();
    }

    public int countItens() {
        int sum = 0;
        // verifica quantidades de produtos disponíveis
        for (ItemCompra item : this.itensCompra) {
            sum += item.getQuantidade();
        }
        return sum;
    }

    public void incluir(ItemCompra item) {
        if (this.itensCompra.size() >= qtdeMax) {
            System.out.println("Lista cheia");
        } else {
            this.itensCompra.add(item);
        }
    }

    // insire o máximo de intens possíveis
    public void addLimite(Produto produto) {
        itensCompra.add(new ItemCompra(produto, qtdeMax - countItens()));
    }

    public double calcularPreco() {
        double precoTotal = 0.0;
        for (ItemCompra item : this.itensCompra) {
            precoTotal += item.calcularPreco();
        }
        return precoTotal;
    }
}
