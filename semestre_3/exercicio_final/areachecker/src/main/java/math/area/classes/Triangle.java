package math.area.classes;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import math.area.interfaces.Calculable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Triangle implements Calculable{
    List<Double> side;

    public double calcularArea() {
        // no caso do triângulo, as medidas do lado listados da seguinte forma:
        // "/" = lista[0]
        // "\" = lista[1]
        // "_" = lista[2]

        // formula para o triângulo escaleno
        if (side.get(0) != side.get(1) && side.get(0) != side.get(2)
                && side.get(1) != side.get(2)) {
            // semi-perimetro = (a + b + c) / 2
            // area = raiz do semi-perimetro * (seme-perimetro - a) (semi-perimetro - B) * (semi-perimetro - C)
    
            double semi_perimetro = (side.get(0) + side.get(1) + side.get(2)) / 2;
            double area = Math.sqrt(semi_perimetro * (semi_perimetro - side.get(0))
                    * (semi_perimetro - side.get(1)) * (semi_perimetro - side.get(2)));
            return area;
        } else
        // formula para o triângulo equilatero
        if (side.get(0) == side.get(1) && side.get(0) == side.get(2)
                && side.get(1) == side.get(2)) {
            // area = (lado * lado * raiz de 3) / 4
            double area = (side.get(0) * side.get(0) * Math.sqrt(3)) / 4;
            return area;
        } else
        // formula para o triângulo isósceles
        if (side.get(0) == side.get(1) && side.get(0) != side.get(2)
                || side.get(0) == side.get(2) && side.get(0) != side.get(1)
                || side.get(1) == side.get(2) && side.get(1) != side.get(0)) {
            // area = (base * altura) / 2
            // altura = raiz de (lado * lado) - (base * base) / 4
            // base = lado diferente
            Double base = 0.0;
            int altura = 0;
            if (side.get(0) == side.get(1)) {
                base = side.get(2);
                altura = (int) Math.sqrt((side.get(0) * side.get(0)) - (base * base) / 4);
            } else if (side.get(0) == side.get(2)) {
                base = side.get(1);
                altura = (int) Math.sqrt((side.get(0) * side.get(0)) - (base * base) / 4);
            } else if (side.get(1) == side.get(2)) {
                base = side.get(0);
                altura = (int) Math.sqrt((side.get(1) * side.get(1)) - (base * base) / 4);
            }
            double area = (base * altura) / 2;
            return area;
        }
        // formula para o triângulo retângulo
        else {
            // area = (cateto * cateto) / 2
            // cateto = lado diferente
            // item 0 é a altura e 2 é a base
            double area = (side.get(0) * side.get(2)) / 2;
            return area;
        }
    }
}
