package math.area.classes;

import java.util.List;

import math.area.interfaces.Calculable;
import math.area.interfaces.CalculableFactory;

public class CalculableCreator implements CalculableFactory{
    public Calculable createSquare(double side) { return new Square(side); }
    public Calculable createRectangle(double base, double height) { return new Rectangle(base, height); }
    public Calculable createCircle(double radius) { return new Circle(radius); }
    public Calculable createTriangle(List<Double> sides) { return new Triangle(sides); }
    public Calculable createParallelogram(double base, double height) { return new Parallelogram(base, height); }
    public Calculable createTrapeze(double height, double smaller_base, double larger_base) { return new Trapeze(height, smaller_base, larger_base); }
    public Calculable createHexagon(double side) { return new Hexagon(side); }
    public Calculable createRhombus(double larger_diagonal, double smaller_diagonal) { return new Rhombus(larger_diagonal, smaller_diagonal); }
    public Calculable createCube(double side) { return new Cube(side); }
}
