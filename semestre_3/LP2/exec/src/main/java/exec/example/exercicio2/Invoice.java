package exec.example.exercicio2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Invoice {
    private int numItem;
    private String descicaoItem;
    private int qtdCompraItem;
    private double precoUnit;

    public Invoice(int numItem, String descicaoItem, int qtdCompraItem, double precoUnit) {
        this.numItem = numItem;
        this.descicaoItem = descicaoItem;
        
        if(this.qtdCompraItem < 0){
            this.qtdCompraItem = 0;
        } else {
            this.qtdCompraItem = qtdCompraItem;
        }
        if(this.precoUnit < 0){
            this.precoUnit = 0;
        } else {
            this.precoUnit = precoUnit;
        }

    }

    public double getInvoiceAmout() {
        return (getQtdCompraItem() * getPrecoUnit());
    }
}