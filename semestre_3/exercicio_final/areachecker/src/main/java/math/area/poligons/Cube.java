package math.area.poligons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import math.area.interfaces.Calculable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Cube implements Calculable {
    private double side;

    public double calcularArea() {
        // formula para cubo
        // lado³
        double area = side * side * side;
        return area;
    }
}
