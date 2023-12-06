package math.area.poligons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import math.area.interfaces.Calculable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Circle implements Calculable{
    private double radius;

    public double calcularArea() {
        // formula para circulo
        // pi * raio²
        double area = Math.PI * Math.pow(getRadius(), 2);
        return area;
    }
}
