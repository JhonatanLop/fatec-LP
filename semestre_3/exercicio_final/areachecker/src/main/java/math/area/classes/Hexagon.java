package math.area.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import math.area.interfaces.Calculable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Hexagon implements Calculable{
    private double side;

    public double calcularArea() {
        // formula para o hexágono
        // (3 * raiz(3) * lado²) / 2
        double area = (6 * Math.pow(side, 2) * Math.sqrt(3)) / 4;
        return area;
    }
}
