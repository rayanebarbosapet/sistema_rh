package pessoas;

import java.util.Date;
import enums.Salario;
import interfaces.Calculo;

public class Atendente extends Funcionarios implements Calculo{

    private String codigo;
    private Salario salario;

    public Atendente(String nome, String cpf, String tel, int id, String cargo, Date datadeAdmissao, String user,
            String Key, String codigo) {
        super(nome, cpf, tel, id, cargo, datadeAdmissao, user, Key);
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
        
        Salario[] fgts = {Salario.ATENDENTE};
        double[]fgtsAtendente = fgts[0].getSalario();

         double totalFgts=(fgts*0.08);
    }
}
