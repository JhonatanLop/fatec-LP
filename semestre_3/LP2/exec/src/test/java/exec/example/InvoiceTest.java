package exec.example;

import static org.junit.Assert.*;

import org.junit.Test;

import exec.example.exercicio2.Invoice;

public class InvoiceTest {
    
    @Test
    public void Main() {
        Invoice invoice = new Invoice(12, "Creatina", 2, 2.4);
        assertEquals(4.8, invoice.getInvoiceAmout(),0);
    }

    @Test
    public void neg(){
        Invoice invoice = new Invoice(12, "Creatina", -1, 2.4);
        assertEquals(0, invoice.getQtdCompraItem());
    }
}
