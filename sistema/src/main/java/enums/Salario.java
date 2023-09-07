package enums;

public enum Salario {
    
    ATENDENTE(1440.0), SUPERVISOR(1600.0), GERENTE(2000.0);
    
    private double salario;
     
    private Salario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
     
    
}
