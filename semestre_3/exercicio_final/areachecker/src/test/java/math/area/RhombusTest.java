package math.area;

import org.junit.Test;

import math.area.poligons.Rhombus;

public class RhombusTest {
    
    @Test
    public void testCalculateArea() {
        Rhombus rhombus = new Rhombus();
        rhombus.setLarger_diagonal(10);
        rhombus.setSmaller_diagonal(5);
        double actualArea = rhombus.calcularArea();
        assert(actualArea == 25);
    }
}
