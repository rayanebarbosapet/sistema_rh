package pessoas;

import java.util.Date;
import java.util.Scanner;
import interfaces.Calculo;
import enums.*;
import pessoas.Funcionarios;

public class Supervisor extends Funcionarios implements Calculo {

    private String codigo;
    private Salario salario;
    private Tributos Valor;
    private double mesesTrabalhados;
   
    Scanner sc = new Scanner(System.in);

    public Supervisor(String nome, String cpf, String tel, int id, String cargo, Date datadeAdmissao, String user,
            String Key, String codigo, Salario salario, Tributos Valor, double mesesTrabalhados) {
        super(nome, cpf, tel, id, cargo, user, Key);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
     
    @Override
    public void calculofgts() {

        double salarioSupervisor = Salario.SUPERVISOR.getSalario();
        double valorFGTS = Valor.FGTS.getValor();
    
        double totalFgts = salarioSupervisor * valorFGTS;

        System.out.println("Total do FGTS do Supervisor: " + totalFgts);
    }
    @Override
    public void calculoinss() {

        double salarioSupervisor = Salario.SUPERVISOR.getSalario();
        double valorINSS = Valor.INSS.getValor();
    
        double totalINSS = salarioSupervisor * valorINSS;

        System.out.println("Total do FGTS do Supervisor: " + totalINSS);
    
}

@Override
    public void calculoDecTer(){

  
        System.out.println("Quantos meses você trabalhou?");
         mesesTrabalhados= sc.nextInt();

        double salarioSupervisor = Salario.SUPERVISOR.getSalario();
        double valorDecTer = Valor.DECIMO_TERCEIRO.getValor();
    
        double totalDecTer = ((salarioSupervisor / valorDecTer)*mesesTrabalhados);

        System.out.println("Total do FGTS do Supervisor: " + totalDecTer);
    }

    
    @Override
    public void calculoFerias(){

          System.out.println("Quantos meses você trabalhou?");
        mesesTrabalhados=sc.nextDouble();
   
        double salarioSupervisor = Salario.SUPERVISOR.getSalario();
        double valorDecTer = Valor.FERIAS.getValor();
        double totalDecTer1 = ((salarioSupervisor*mesesTrabalhados)/12);       
        double totalDecTer2=(totalDecTer1/valorDecTer);
        double totalDecTer = (totalDecTer1+totalDecTer2);

        System.out.println("Total das Ferias do supervisor:"+ totalDecTer);

    }
}
