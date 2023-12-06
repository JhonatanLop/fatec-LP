package math.area.shapes;

import math.area.interfaces.Calculable;
import math.area.poligons.Circle;
import math.area.poligons.Cube;
import math.area.poligons.Hexagon;
import math.area.poligons.Parallelogram;
import math.area.poligons.Rectangle;
import math.area.poligons.Rhombus;
import math.area.poligons.Square;
import math.area.poligons.Trapeze;
import math.area.poligons.Triangle;

public class ShapeFactory {
    public static Calculable getShape(ShapeType type, Double[] values){
        switch(type){
            case SQUARE:
                return new Square(values[0]);
            case RECTANGLE:
                return new Rectangle(values[0], values[1]);
            case CIRCLE:
                return new Circle(values[0]);
            case TRIANGLE:
                return new Triangle(values);
            case PARALLELOGRAM:
                return new Parallelogram(values[0], values[1]);
            case TRAPEZE:
                return new Trapeze(values[0], values[1], values[2]);
            case HEXAGON:
                return new Hexagon(values[0]);
            case RHOMBUS:
                return new Rhombus(values[0], values[1]);
            case CUBE:
                return new Cube(values[0]);
            default:
                return null;
        }
    }
}
