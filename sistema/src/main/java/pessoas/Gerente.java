package pessoas;

import java.util.Date;
import interfaces.Calculo;
import enums.*;

public class Gerente extends Funcionarios implements Calculo {

    private String totalFuncionarios;
    private String senhaEspecial;
    private Salario Salario;
    private Tributos Valor;
   
 

    public Gerente(String nome, String cpf, String tel, int id, String cargo, Date datadeAdmissao, String user,
            String Key, String totalFuncionarios, String senhaEspecial, Salario salario, Tributos valor, int mesesTrabalhados) {
        super(nome, cpf, tel, id, cargo, datadeAdmissao, user, Key, mesesTrabalhados);
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

        double salarioAtendente = Salario.GERENTE.getSalario();
        double valorFGTS = Valor.FGTS.getValor();
    
        double totalFgts = salarioAtendente * valorFGTS;

        System.out.println("Total do FGTS do Atendente: " + totalFgts);
    }

    @Override
    public void calculoinss() {

        double salarioAtendente = Salario.GERENTE.getSalario();
        double valorINSS = Valor.INSS.getValor();
    
        double totalINSS = salarioAtendente * valorINSS;

        System.out.println("Total do FGTS do Atendente: " + totalINSS); 
    
}
}
