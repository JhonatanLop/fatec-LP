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

public class Triangle implements Calculable{
    Double[] side;

    public double calcularArea() {
        // no caso do triângulo, as medidas do lado listados da seguinte forma:
        // "/" = lista[0]
        // "\" = lista[1]
        // "_" = lista[2]

        // formula para o triângulo escaleno
        if (side[0] != side[1] && side[0] != side[2]
                && side[1] != side[2]) {
            // semi-perimetro = (a + b + c) / 2
            // area = raiz do semi-perimetro * (seme-perimetro - a) (semi-perimetro - B) * (semi-perimetro - C)
    
            double semi_perimetro = (side[0] + side[1] + side[2]) / 2;
            double area = Math.sqrt(semi_perimetro * (semi_perimetro - side[0])
                    * (semi_perimetro - side[1]) * (semi_perimetro - side[2]));
            return area;
        } else
        // formula para o triângulo equilatero
        if (side[0] == side[1] && side[0] == side[2]
                && side[1] == side[2]) {
            // area = (lado * lado * raiz de 3) / 4
            double area = (side[0] * side[0] * Math.sqrt(3)) / 4;
            return area;
        } else
        // formula para o triângulo isósceles
        if (side[0] == side[1] && side[0] != side[2]
                || side[0] == side[2] && side[0] != side[1]
                || side[1] == side[2] && side[1] != side[0]) {
            // area = (base * altura) / 2
            // altura = raiz de (lado * lado) - (base * base) / 4
            // base = lado diferente
            Double base = 0.0;
            int altura = 0;
            if (side[0] == side[1]) {
                base = side[2];
                altura = (int) Math.sqrt((side[0] * side[0]) - (base * base) / 4);
            } else if (side[0] == side[2]) {
                base = side[1];
                altura = (int) Math.sqrt((side[0] * side[0]) - (base * base) / 4);
            } else if (side[1] == side[2]) {
                base = side[0];
                altura = (int) Math.sqrt((side[1] * side[1]) - (base * base) / 4);
            }
            double area = (base * altura) / 2;
            return area;
        }
        // formula para o triângulo retângulo
        else {
            // area = (cateto * cateto) / 2
            // cateto = lado diferente
            // item 0 é a altura e 2 é a base
            double area = (side[0] * side[2]) / 2;
            return area;
        }
    }
}
