package math.area;

import org.junit.Test;

import math.area.classes.Rectangle;

public class RectangleTest {
    
    @Test
    public void testCalcularArea() {
        Rectangle rectangle = new Rectangle();
        rectangle.setBase(10);
        rectangle.setHeight(10);
        double actualArea = rectangle.calcularArea();
        assert actualArea == 100;
    }
}
