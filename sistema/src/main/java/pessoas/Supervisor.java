package pessoas;

import java.util.Date;
import interfaces.Calculo;
import enums.*;

public class Supervisor extends Funcionarios implements Calculo {

    private String codigo;
    private Salario salario;
    private Tributos Valor;

    public Supervisor(String nome, String cpf, String tel, int id, String cargo, Date datadeAdmissao, String user,
            String Key, String codigo, Salario salario, Tributos Valor, int mesesTrabalhados) {
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

        double salarioAtendente = Salario.SUPERVISOR.getSalario();
        double valorFGTS = Valor.FGTS.getValor();
    
        double totalFgts = salarioAtendente * valorFGTS;

        System.out.println("Total do FGTS do Atendente: " + totalFgts);
    }
    @Override
    public void calculoinss() {

        double salarioAtendente = Salario.SUPERVISOR.getSalario();
        double valorINSS = Valor.INSS.getValor();
    
        double totalINSS = salarioAtendente * valorINSS;

        System.out.println("Total do FGTS do Atendente: " + totalINSS);
    
}
}
