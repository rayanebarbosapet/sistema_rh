package enums;

public enum Niveis {
ALTO("gerente"), MEDIO("supervidor"), BAIXO("atendente");

String niveisSeguranca;

    private Niveis(String niveisSeguranca) {
        this.niveisSeguranca=niveisSeguranca;
    
    }


    public String getNiveisSeguranca() {
        return niveisSeguranca;
    }
    
}
