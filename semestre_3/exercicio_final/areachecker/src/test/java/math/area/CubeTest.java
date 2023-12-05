package math.area;

import static org.junit.Assert.*;

import org.junit.Test;

import math.area.classes.Cube;

public class CubeTest {
    
    @Test
    public void testCalculateArea() {
        Cube cube = new Cube();
        cube.setSide(5);
        double expectedArea = 125;
        double actualArea = cube.calcularArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }
    
    @Test
    public void testCalculateAreaWithZeroSide() {
        Cube cube = new Cube();
        cube.setSide(0);
        double expectedArea = 0;
        double actualArea = cube.calcularArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }
    
    @Test
    public void testCalculateAreaWithNegativeSide() {
        Cube cube = new Cube();
        cube.setSide(5);
        double expectedArea = 125;
        double actualArea = cube.calcularArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }
}