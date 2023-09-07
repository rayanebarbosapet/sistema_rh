package pessoas;

import java.util.Date;
import enums.*;
import interfaces.Calculo;

public class Atendente extends Funcionarios implements Calculo{

    private String codigo;
    private Salario Salario;
    private Tributos Valor;

    public Atendente(String nome, String cpf, String tel, int id, String cargo, Date datadeAdmissao, String user,
            String Key, String codigo, Salario salario, Tributos getvalor, int mesesTrabalhados) {
        super(nome, cpf, tel, id, cargo, datadeAdmissao, user, Key, mesesTrabalhados);
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

        System.out.println("Total do FGTS do Atendente: " + totalINSS);
    }  
   
}

