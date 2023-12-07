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

public class Triangle implements Calculable {
    double base;
    double height;

    // calcula apenas triângulo retângulo
    public double calcularArea() {
        double area = (base * height) / 2;
        return area;
    }
}
