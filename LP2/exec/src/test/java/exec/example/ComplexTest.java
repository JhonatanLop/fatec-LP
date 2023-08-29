package exec.example;

import static org.junit.Assert.*;

import org.junit.Test;

import exec.example.exercicio4.Complex;

public class ComplexTest {
    
    @Test
    public void divisorTest(){
        Complex numero1 = new Complex(1.0, 2.0);
        Complex numero2 = new Complex(3.0, 4.0);

        Complex resultadoEsperado = new Complex(-0.2, 0.4);
        Complex resultado = numero1.dividir(numero2);

        assertEquals(resultadoEsperado, resultado);
    }
}
