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

public class Square implements Calculable{
    double side;

    public double calcularArea() {
        // formula para quadrado
        // lado * lado
        double area = side * side;
        return area;
    }
}
