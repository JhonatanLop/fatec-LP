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

    public int countProducts() {
        int sum = 0;
        // verifica quantidades de produtos disponíveis
        for (ItemCompra item : this.itensCompra) {
            sum += item.getQuantidade();
        }
        return sum;
    }

    public void incluir(ItemCompra item) {
        if (item.getDesconto() > item.getProduto().getDescontoMaximo()) {
            System.out.println("Desconto maior que o permitido");
            return;
        }
        if (this.itensCompra.size() >= qtdeMax) {
            System.out.println("Lista cheia");
        } else {
            this.itensCompra.add(item);
        }
    }

    // insire o máximo de intens possíveis
    public void addLimite(Produto produto) {
        int currentCount = countProducts();
        int quantidadeToAdd = qtdeMax - currentCount;
    
        if (quantidadeToAdd > 0) {
            ItemCompra newItem = new ItemCompra(quantidadeToAdd,produto, quantidadeToAdd);
            itensCompra.add(newItem);
        }
    }

    public double calcularPreco() {
        double precoTotal = 0.0;
        for (ItemCompra item : this.itensCompra) {
            precoTotal += item.getProduto().getPreco() + (item.getProduto().getPreco() * item.getDesconto());
        }
        return precoTotal;
    }
}
