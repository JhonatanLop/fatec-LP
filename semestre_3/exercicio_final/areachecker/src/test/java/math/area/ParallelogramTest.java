package math.area;

import static org.junit.Assert.*;

import org.junit.Test;

import math.area.poligons.Parallelogram;

public class ParallelogramTest {
    
    @Test
    public void testeCalculoAreaParalelogramo() {
        // Arrange
        Parallelogram parallelogram = new Parallelogram();
        parallelogram.setBase(5);
        parallelogram.setHeight(10);

        // Act
        double actualArea = parallelogram.calcularArea();

        // Assert
        assertEquals(50, actualArea, 0.0001);
    }
}
