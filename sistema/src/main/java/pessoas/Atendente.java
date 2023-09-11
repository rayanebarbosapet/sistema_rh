package pessoas;

import java.util.Date;
import enums.*;
import interfaces.Calculo;
import java.util.Scanner;
import pessoas.Funcionarios;

public class Atendente extends Funcionarios implements Calculo{

    private String codigo;
    private Salario Salario;
    private Tributos Valor;
    private double mesesTrabalhados;
   
    
    Scanner sc = new Scanner(System.in);

 

    public Atendente(String nome, String cpf, String tel, int id, String cargo, Date datadeAdmissao, String user,
            String Key, double mesesTrabalhados, String codigo, enums.Salario salario, Tributos valor) {
        super(nome, cpf, tel, id, cargo, user, Key );
        this.codigo = codigo;
        Salario = salario;
        Valor = valor;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public void calculofgts() {

        double salarioAtendente = Salario.ATENDENTE.getSalario();
        double valorFGTS = Valor.FGTS.getValor();
    
        double totalFgts = salarioAtendente * valorFGTS;

        System.out.println("Total do FGTS do Atendente: " + totalFgts);
    }

 @Override
    public void calculoinss() {

        double salarioAtendente = Salario.ATENDENTE.getSalario();
        double valorINSS = Valor.INSS.getValor();
    
        double totalINSS = salarioAtendente * valorINSS;

        System.out.println("Total do INSS do Atendente: " + totalINSS);
    } 
    @Override
    public void calculoDecTer(){
       
        System.out.println("Quantos meses você trabalhou?");
        mesesTrabalhados=sc.nextDouble();
   
        double salarioAtendente = Salario.ATENDENTE.getSalario();
        double valorDecTer = Valor.DECIMO_TERCEIRO.getValor();
        double totalDecTer = ((salarioAtendente / valorDecTer)*mesesTrabalhados);
   
        System.out.println("Total do DECIMO TERCEIRO do Atendente: " + totalDecTer);
    }

    @Override
    public void calculoFerias(){

          System.out.println("Quantos meses você trabalhou?");
        mesesTrabalhados=sc.nextDouble();
   
        double salarioAtendente = Salario.ATENDENTE.getSalario();
        double valorDecTer = Valor.FERIAS.getValor();
        double totalDecTer1 = ((salarioAtendente*mesesTrabalhados)/12);       
        double totalDecTer2=(totalDecTer1/valorDecTer);
        double totalDecTer = (totalDecTer1+totalDecTer2);

        System.out.println("Total das Ferias do atendente:"+ totalDecTer);

    }
 }
    


   

//17.280
