package math.area;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import math.area.classes.Triangle;

public class TriangleTest {
    @Test
    public void testCalculateAreaEquilateralTriangle() {
        // Arrange
        Triangle triangulo = new Triangle();
        List<Double> medida_lados = Arrays.asList(5.0, 5.0, 5.0);
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
        List<Double> medida_lados = Arrays.asList(3.0, 4.0, 5.0);
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
        List<Double> medida_lados = Arrays.asList(4.0, 4.0, 5.0);
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
        List<Double> medida_lados = Arrays.asList(3.0, 4.0, 5.0);
        triangulo.setSide(medida_lados);

        // Act
        double actualArea = triangulo.calcularArea();

        // Assert
        assertEquals(6.0, actualArea, 0.0001);
    }
}