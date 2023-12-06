package edu.fatec.lp2.exercicio2;

import edu.fatec.lp2.exercicio2.classes.ItemCompra;
import edu.fatec.lp2.exercicio2.classes.ListaCompra;
import edu.fatec.lp2.exercicio2.classes.Produto;
import edu.fatec.lp2.exercicio2.classes.Supermercado;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        // criando mercados
        Supermercado mercado1 = new Supermercado("Mercado1");

        // criando produtos
        Produto p1 = new Produto(
            "Produto1",
            "10",
            "descricao 1",
            10.0,
            0.05,
            mercado1);
        
        Produto p2 = new Produto(
            "Produto2",
            "10",
            "descricao 1",
            1500.0,
            0.1,
            mercado1);

        // criando ItemCompra
        ItemCompra item1 = new ItemCompra(p1, 0.05);
        ItemCompra item2 = new ItemCompra(p2, 0.15);

        // criando listaCompra
        ListaCompra lista1 = new ListaCompra(2);
        lista1.incluir(item1);
        lista1.incluir(item2);

        // calculando preco por lista de compra
        System.out.println(lista1.calcularPreco());

        // calculando preco por item
        System.out.println(item2.calcularPreco());
    }
}
