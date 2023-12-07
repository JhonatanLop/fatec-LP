package edu.fatec.lp2.exercicio2.classes;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListaCompraTest {

    private ListaCompra listaCompra;

    @BeforeEach
    public void setUp() {
        listaCompra = new ListaCompra(5);
    }

    @Test
    public void testCountItens() {
        Supermercado familia = new Supermercado("Super mercado família");

        ItemCompra item1 = new ItemCompra(3, new Produto("geladinho 1", "1", "é gelado", 10.0, 0.25, familia), 0);
        ItemCompra item2 = new ItemCompra(2, new Produto("salgado 2", "5.0", "é salgado", 4.0, 0.0, familia), 0);

        listaCompra.incluir(item1);
        listaCompra.incluir(item2);

        int expectedCount = 5;
        int actualCount = listaCompra.countItens();

        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testIncluir() {
        Supermercado familia = new Supermercado("Super mercado família");

        ItemCompra item = new ItemCompra(new Produto("geladinho 1", "1", "é gelado", 10.0, 0.25, familia), 2);

        listaCompra.incluir(item);

        ArrayList<ItemCompra> expectedItens = new ArrayList<>();
        expectedItens.add(item);

        Assertions.assertEquals(expectedItens, listaCompra.getItensCompra());
    }

    @Test
    public void testAddLimite() {
        Supermercado familia = new Supermercado("Super mercado família");
        Produto produto = new Produto("geladinho 1", "1", "é gelado", 10.0, 0.25, familia);
    
        // Definir o limite máximo
        int maxQuantity = 10;
        listaCompra.setQtdeMax(maxQuantity);
    
        // Adicionar o produto usando addLimite()
        listaCompra.addLimite(produto);
    
        // Verificar se a quantidade total de itens é igual ao limite máximo
        Assertions.assertEquals(maxQuantity, listaCompra.countProducts());
    
        // Verificar se o último item adicionado tem a quantidade correta
        ItemCompra lastItem = listaCompra.getItensCompra().get(listaCompra.getItensCompra().size() - 1);
        Assertions.assertEquals(maxQuantity, lastItem.getQuantidade());
    }

    @Test
    public void testCalcularPreco() {
        Supermercado familia = new Supermercado("Super mercado família");
        ItemCompra item1 = new ItemCompra(1, new Produto("geladinho 1", "1", "é gelado", 10.0, 0.25, familia), 50.0);
        ItemCompra item2 = new ItemCompra(1, new Produto("salgado 2", "5.0", "é salgado", 4.0, 0.0, familia), 0.0);

        listaCompra.incluir(item1);
        listaCompra.incluir(item2);

        double expectedPreco = 9.0;
        double actualPreco = listaCompra.calcularPreco();

        Assertions.assertEquals(expectedPreco, actualPreco);
    }
}