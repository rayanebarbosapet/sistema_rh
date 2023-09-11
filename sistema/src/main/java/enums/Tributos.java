package enums;

public enum Tributos {

    DECIMO_TERCEIRO(12.0), FGTS(0.08), FERIAS(3.0), INSS(0.09);
    
    private Double valor;

 Tributos(Double valor) {
        this.valor=valor;
    }


public Double getValor() {
    return valor;
}

    
}


/* fgts ok, inss ok*/