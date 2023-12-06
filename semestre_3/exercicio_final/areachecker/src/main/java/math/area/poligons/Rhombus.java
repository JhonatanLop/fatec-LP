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

public class Rhombus implements Calculable{
    private double larger_diagonal;
    private double smaller_diagonal;

    public double calcularArea() {
        // formula para losango
        // (diagonal maior * diagonal menor) / 2
        double area = (larger_diagonal * smaller_diagonal) / 2;
        return area;
    }
}
