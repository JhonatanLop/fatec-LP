package exec.example.exercicio5;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataEx {
    private int dia;
    private int mes;
    private int ano;

    public DataEx(int dia, int mes, int ano) throws Exception {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    public String avancaDia() {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia == 31) {
                    dia = 1;
                    mes++;
                } else {
                    dia++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia == 30) {
                    dia = 1;
                    mes++;
                } else {
                    dia++;
                }
                break;
            case 2:
                if (ehBissexto(ano)) {
                    if (dia == 29) {
                        dia = 1;
                        mes++;
                    } else {
                        dia++;
                    }
                } else {
                    if (dia == 28) {
                        dia = 1;
                        mes++;
                    } else {
                        dia++;
                    }
                }
                break;
        }
        return Integer.toString(dia) + "/" + Integer.toString(mes) + "/" +Integer.toString(ano);
    }

    private static boolean ehBissexto(int ano) {
        return ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
    }
}
