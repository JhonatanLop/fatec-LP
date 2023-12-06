package math.area;

import static org.junit.Assert.*;

import org.junit.Test;

import math.area.poligons.Triangle;

public class TriangleTest {
    @Test
    public void testCalculateAreaEquilateralTriangle() {
        // Arrange
        Triangle triangulo = new Triangle();
        Double[] medida_lados = {5.0, 5.0, 5.0};
        triangulo.setSide(medida_lados);

        // Act
        double actualArea = triangulo.calcularArea();

        // Assert
        assertEquals(10.825317547305483, actualArea, 0.0001);
    }

    @Test
    public void testCalculateAreaScaleneTriangle() {
        // Arrange
        Triangle triangulo = new Triangle();
        Double[] medida_lados = {3.0, 4.0, 5.0};
        triangulo.setSide(medida_lados);

        // Act
        double actualArea = triangulo.calcularArea();

        // Assert
        assertEquals(6.0, actualArea, 0.0001);
    }

    @Test
    public void testCalculateAreaIsoscelesTriangle() {
        // Arrange
        Triangle triangulo = new Triangle();
        Double[] medida_lados = {4.0, 4.0, 5.0};
        triangulo.setSide(medida_lados);

        // Act
        double actualArea = triangulo.calcularArea();

        // Assert
        assertEquals(7.81, actualArea, 0.01);
    }

    @Test
    public void testCalculateAreaRightTriangle() {
        // Arrange
        Triangle triangulo = new Triangle();
        Double[] medida_lados = {3.0, 4.0, 5.0};
        triangulo.setSide(medida_lados);

        // Act
        double actualArea = triangulo.calcularArea();

        // Assert
        assertEquals(6.0, actualArea, 0.0001);
    }
}