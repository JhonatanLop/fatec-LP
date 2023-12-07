package math.area;

import static org.junit.Assert.*;

import org.junit.Test;

import math.area.poligons.Triangle;

public class TriangleTest {
    @Test
    public void testCalculateAreaZeroBase() {
        // Arrange
        Triangle triangle = new Triangle(0.0, 5.0);

        // Act
        double actualArea = triangle.calcularArea();

        // Assert
        assertEquals(0.0, actualArea, 0.0001);
    }

    @Test
    public void testCalculateAreaZeroHeight() {
        // Arrange
        Triangle triangle = new Triangle(5.0, 0.0);

        // Act
        double actualArea = triangle.calcularArea();

        // Assert
        assertEquals(0.0, actualArea, 0.0001);
    }

    @Test
    public void testCalculateAreaNegativeBaseAndHeight() {
        // Arrange
        Triangle triangle = new Triangle(-5.0, -5.0);

        // Act
        double actualArea = triangle.calcularArea();

        // Assert
        assertEquals(12.5, actualArea, 0.0001);
    }
}