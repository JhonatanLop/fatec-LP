package math.area.interfaces;

import java.util.List;

public interface CalculableFactory {
    Calculable createSquare(double side);
    Calculable createRectangle(double base, double height);
    Calculable createCircle(double radius);
    Calculable createTriangle(List<Double> sides);
    Calculable createParallelogram(double base, double height);
    Calculable createTrapeze(double height, double smaller_base, double larger_base);
    Calculable createHexagon(double side);
    Calculable createRhombus(double larger_diagonal, double smaller_diagonal);
    Calculable createCube(double side);
}