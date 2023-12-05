package math.area.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import math.area.interfaces.Calculable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Rectangle implements Calculable{
    private double base;
    private double height;

    public double calcularArea() {
        // formula para retangulo
        // base * altura
        double area = getBase() * getHeight();
        return area;
    }
}
