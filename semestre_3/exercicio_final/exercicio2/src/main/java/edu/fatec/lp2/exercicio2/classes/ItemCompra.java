package edu.fatec.lp2.exercicio2.classes;

import edu.fatec.lp2.exercicio2.interfaces.Calculavel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ItemCompra implements Calculavel{
    private int quantidade;
    private Produto produto;
    private double desconto;

    public ItemCompra(Produto produto, double desconto) {
        this.produto = produto;
        this.desconto = desconto;
    }

    @Override
    public double calcularPreco() {
        double preco = this.produto.getPreco();
        double precoFinal = preco - (preco * desconto);
        return precoFinal;
    }
}
