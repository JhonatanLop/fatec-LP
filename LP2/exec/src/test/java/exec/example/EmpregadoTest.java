package exec.example;

import static org.junit.Assert.*;

import org.junit.Test;

import exec.example.exercicio3.Empregado;

public class EmpregadoTest {
    
    @Test
    public void Main(){
        Empregado empregado = new Empregado("jhow","lopes",1200.0);
        assertEquals(empregado.getFistName() , "jhow");
        assertEquals(empregado.getLastName() , "lopes");
    }
    
    @Test
    public void calc(){
        Empregado empregado1 = new Empregado("jhow","lopes",1200.0);
        Empregado empregado2 = new Empregado("Eron","Moraes",1305.0);
        empregado1.setSalarioMensal(empregado1.getSalarioMensal()*0.1+empregado1.getSalarioMensal());
        empregado2.setSalarioMensal(empregado2.getSalarioMensal()*0.1+empregado2.getSalarioMensal());
        assertEquals(1320,empregado1.getSalarioMensal(), 0.01);
        assertEquals(1435.5,empregado2.getSalarioMensal(), 0.01);
    }
}
