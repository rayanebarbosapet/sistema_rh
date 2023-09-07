package enums;
import enums.Salario;

public enum Tributos {

    DECIMO_TERCEIRO(0.08), FGTS(0.08), FERIAS(0.08), INSS(0.08);
    
    private Double valor;

    private Tributos(Double valor) {
        this.valor=valor;
    }


public Double getValor() {
    return valor;
}
    
}
