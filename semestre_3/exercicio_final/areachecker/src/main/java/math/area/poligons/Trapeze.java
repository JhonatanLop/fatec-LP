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

public class Trapeze implements Calculable{
    private double height;
    private double smaller_base;
    private double larger_base;

    public double calcularArea() {
        // formula para trapezio
        // (base maior + base menor) * altura / 2
        double area = ((larger_base + smaller_base) * height) / 2;
        return area;
    }
}
