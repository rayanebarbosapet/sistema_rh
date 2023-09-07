package pessoas;

import java.util.Date;
import interfaces.Calculo;
import enums.*;
import java.util.Scanner;

public class Gerente extends Funcionarios implements Calculo {

    private String totalFuncionarios;
    private String senhaEspecial;
    private Salario Salario;
    private Tributos Valor;
    private double mesesTrabalhados;
   
    Scanner sc = new Scanner(System.in);
   
 

    public Gerente(String nome, String cpf, String tel, int id, String cargo, Date datadeAdmissao, String user,
            String Key, String totalFuncionarios, String senhaEspecial, Salario salario, Tributos valor) {
        super(nome, cpf, tel, id, cargo, datadeAdmissao, user, Key);
        this.totalFuncionarios = totalFuncionarios;
        this.senhaEspecial = senhaEspecial;
    }

    public String getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public String getSenhaEspecial() {
        return senhaEspecial;
    }

    @Override
   public void calculofgts() {

        double salarioGerente = Salario.GERENTE.getSalario();
        double valorFGTS = Valor.FGTS.getValor();
    
        double totalFgts = salarioGerente * valorFGTS;

        System.out.println("Total do FGTS do gerente: " + totalFgts);
    }

    @Override
    public void calculoinss() {

        double salarioGerente = Salario.GERENTE.getSalario();
        double valorINSS = Valor.INSS.getValor();
    
        double totalINSS = salarioGerente * valorINSS;

        System.out.println("Total do INSS do gerente: " + totalINSS); 
    
}

    @Override
    public void calculoDecTer(){
       
        System.out.println("Quantos meses você trabalhou?");
        mesesTrabalhados=sc.nextDouble();
   
        double salarioGerente = Salario.GERENTE.getSalario();
        double valorDecTer = Valor.DECIMO_TERCEIRO.getValor();
        double totalDecTer = ((salarioGerente / valorDecTer)*mesesTrabalhados);
   
        System.out.println("Total do DECIMO TERCEIRO do gerente: " + totalDecTer);
    }

    
    @Override
    public void calculoFerias(){

          System.out.println("Quantos meses você trabalhou?");
        mesesTrabalhados=sc.nextDouble();
   
        double salarioGerente = Salario.GERENTE.getSalario();
        double valorDecTer = Valor.FERIAS.getValor();
        double totalDecTer1 = ((salarioGerente*mesesTrabalhados)/12);       
        double totalDecTer2=(totalDecTer1/valorDecTer);
        double totalDecTer = (totalDecTer1+totalDecTer2);

        System.out.println("Total das Ferias do gerente:"+ totalDecTer);

    }
}
