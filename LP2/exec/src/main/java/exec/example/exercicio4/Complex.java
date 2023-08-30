package exec.example.exercicio4;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Complex {

    private double parteReal;
    private double parteImaine;

    public Complex() {
        this.parteReal = 0.0;
        this.parteImaine = 0.0;
    }

    public Complex(double parteReal) {
        this.parteReal = parteReal;
        this.parteImaine = 0.0;
    }

    public Complex(double parteReal, double parteImaine) {
        this.parteReal = parteReal;
        this.parteImaine = parteImaine;
    }

    public double getModulo() {
        return Math.sqrt(parteReal * parteReal + parteImaine * parteImaine);
    }

    public double getAngulo() {
        return Math.atan2(parteImaine, parteReal);
    }

    public Complex getInversoAditivado() {
        return new Complex(-parteReal, -parteImaine);
    }

    public Complex somar(Complex num) {
        return new Complex(this.parteReal + num.parteReal, this.parteImaine + num.parteImaine);
    }

    public Complex subtrair(Complex num) {
        return new Complex(this.parteReal - num.parteReal, this.parteImaine - num.parteImaine);
    }

    public Complex multiplicar(Complex num) {
        return new Complex((this.parteReal * this.parteImaine) * (num.parteImaine * num.parteImaine));
    }

    // essa parte foi braba hein
    
    // a + bi / c + di = (a * c - b * d) / (c² + d²) + (b * c + a * d) / (c² + d²) i
    // onde a e b são as partes reais de a + bi, c e d são as partes reais de c + di, e i é a unidade imaginária.

    public Complex dividir(Complex num) {
        return new Complex( ((this.parteReal + this.parteImaine) / (num.parteReal + num.parteImaine)) * ((num.parteImaine / num.parteImaine) / (num.parteImaine * num.parteImaine )));
    }
}
