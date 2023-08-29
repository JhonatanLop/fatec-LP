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

    public double getMódulo() {
        return Math.sqrt(parteReal * parteReal + parteImaine * parteImaine);
    }

    public double getÂngulo() {
        return Math.atan2(parteImaine, parteReal);
    }

    public Complex getInversoAditivado() {
        return new Complex(-parteReal, -parteImaine);
    }

    public Complex somar(Complex num) {
        return new Complex(parteReal + num.parteReal, parteImaine + num.parteImaine);
    }

    public Complex subtrair(Complex num) {
        return new Complex(parteReal - num.parteReal, parteImaine - num.parteImaine);
    }

    public Complex multiplicar(Complex num) {
        return new Complex((parteReal * num.parteReal) - (parteImaine * num.parteImaine),
                (parteReal * num.parteImaine) + (parteImaine * num.parteReal));
    }

    // essa parte foi braba hein
    
    // a + bi / c + di = (a * c - b * d) / (c² + d²) + (b * c + a * d) / (c² + d²) i
    // onde a e b são as partes reais de a + bi, c e d são as partes reais de c + di, e i é a unidade imaginária.

    public Complex dividir(Complex outroNumero) {
        return new Complex( (parteReal * outroNumero.parteReal - parteImaine * outroNumero.parteImaine) / (outroNumero.parteReal * outroNumero.parteReal + outroNumero.parteImaine * outroNumero.parteImaine),
                            (parteImaine * outroNumero.parteReal + parteReal * outroNumero.parteImaine) / (outroNumero.parteReal * outroNumero.parteReal + outroNumero.parteImaine * outroNumero.parteImaine));
    }

    @Override
    public String toString() {
        return String.format("(%.2f,%.2f)", parteReal, parteImaine);
    }
}
