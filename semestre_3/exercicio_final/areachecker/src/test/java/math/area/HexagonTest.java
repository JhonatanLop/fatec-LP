package math.area;

import static org.junit.Assert.*;

import org.junit.Test;

import math.area.classes.Hexagon;

public class HexagonTest {
    
    @Test
    public void testCalculateArea() {
        Hexagon hexagon = new Hexagon();
        hexagon.setSide(5);
        double expectedArea = 64.9519052838329;
        double actualArea = hexagon.calcularArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }
    
    @Test
    public void testCalculateAreaWithZeroSideLength() {
        Hexagon hexagon = new Hexagon();
        hexagon.setSide(0);
        double expectedArea = 0;
        double actualArea = hexagon.calcularArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }
}