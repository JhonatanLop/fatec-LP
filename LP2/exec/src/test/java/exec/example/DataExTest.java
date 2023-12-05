package exec.example;

import static org.junit.Assert.*;

import org.junit.Test;

import exec.example.exercicio5.DataEx;

public class DataExTest {
    @Test
    public void testAvancaDia() throws Exception {
        DataEx data = new DataEx(31, 10, 2023);
        assertEquals("1/11/2023", data.avancaDia());
    }
}
