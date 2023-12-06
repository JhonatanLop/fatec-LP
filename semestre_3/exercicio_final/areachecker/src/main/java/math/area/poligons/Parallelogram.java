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

public class Parallelogram implements Calculable{
    private double height;
    private double base;

    public double calcularArea() {
        // formula para paralelogramo
        // base * altura
        double area = base * height;
        return area;
    }
}
