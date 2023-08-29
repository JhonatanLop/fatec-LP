package exec.example.exercicio3;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Empregado {
    private String fistName;
    private String lastName;
    private double salarioMensal;

    public Empregado(String fistName, String lastName, double salarioMensal){
        this.fistName = fistName;
        this.lastName = lastName;
        if (salarioMensal < 0){this.salarioMensal = 0;} else {this.salarioMensal = salarioMensal;}
    }
    
}
