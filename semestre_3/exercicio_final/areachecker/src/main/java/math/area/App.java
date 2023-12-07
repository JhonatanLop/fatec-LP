package math.area;

import math.area.interfaces.Calculable;
import math.area.shapes.ShapeFactory;
import math.area.shapes.ShapeType;

public class App
{
    public static void main( String[] args )
    {
        
        // dados de exemplo
        Calculable quadrado = ShapeFactory.getShape(ShapeType.SQUARE, new Double[]{5.0});
        Calculable retangulo = ShapeFactory.getShape(ShapeType.RECTANGLE, new Double[]{8.0, 3.0});
        Calculable circulo = ShapeFactory.getShape(ShapeType.CIRCLE, new Double[]{5.0});
        Double[] sides = new Double[]{3.0, 4.0, 5.0};
        Calculable triangulo = ShapeFactory.getShape(ShapeType.TRIANGLE, sides);
        Calculable paralelograma = ShapeFactory.getShape(ShapeType.PARALLELOGRAM, new Double[]{5.0, 3.0});
        Calculable trapezio = ShapeFactory.getShape(ShapeType.TRAPEZE, new Double[]{5.0, 3.0, 4.0});
        Calculable hexagono = ShapeFactory.getShape(ShapeType.HEXAGON, new Double[]{5.0});
        Calculable losango = ShapeFactory.getShape(ShapeType.RHOMBUS, new Double[]{5.0, 3.0});
        Calculable cubo = ShapeFactory.getShape(ShapeType.CUBE, new Double[]{5.0});


        // saída de dados
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Área do circulo: " + circulo.calcularArea());
        System.out.println("Área do triangulo: " + triangulo.calcularArea());
        System.out.println("Área do paralelograma: " + paralelograma.calcularArea());
        System.out.println("Área do trapézio: " + trapezio.calcularArea());
        System.out.println("Área do hexágono: " + hexagono.calcularArea());
        System.out.println("Área do losango: " + losango.calcularArea());
        System.out.println("Área do cubo: " + cubo.calcularArea());

    }

}
