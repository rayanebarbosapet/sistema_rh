package enums;

public enum Salario {
    
    ATENDENTE(new double []{1440.0}), SUPERVISOR(new double []{1600.0}), GERENTE(new double[]{2000.0});
    
    private double[] salario;
     
    private Salario(double[] salario) {
        this.salario = salario;
    }

    public double[] getSalario() {
        return salario;
    }
     
    
}
