package math.area;

import java.util.Arrays;

import math.area.classes.CalculableCreator;
import math.area.interfaces.Calculable;
import math.area.interfaces.CalculableFactory;

public class App
{
    public static void main( String[] args )
    {
        CalculableFactory factory = new CalculableCreator();
        
        // dados de exemplo
        Calculable quadrado = factory.createSquare(5);
        Calculable retângulo = factory.createRectangle(8,3);
        Calculable círculo = factory.createCircle(5);
        Calculable triângulo = factory.createTriangle(Arrays.asList(3.0,4.0,5.0));
        Calculable paralelograma = factory.createParallelogram(5, 3);
        Calculable trapézio = factory.createTrapeze(5, 3, 4);
        Calculable hexágono = factory.createHexagon(5);
        Calculable losango = factory.createRhombus(5, 3);
        Calculable cubo = factory.createCube(5);

        // saída de dados
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área do retângulo: " + retângulo.calcularArea());
        System.out.println("Área do círculo: " + círculo.calcularArea());
        System.out.println("Área do triângulo: " + triângulo.calcularArea());
        System.out.println("Área do paralelograma: " + paralelograma.calcularArea());
        System.out.println("Área do trapézio: " + trapézio.calcularArea());
        System.out.println("Área do hexágono: " + hexágono.calcularArea());
        System.out.println("Área do losango: " + losango.calcularArea());
        System.out.println("Área do cubo: " + cubo.calcularArea());

    }

}
