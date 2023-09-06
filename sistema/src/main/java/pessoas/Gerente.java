package pessoas;

import java.util.Date;

public class Gerente extends Funcionarios {

    private String totalFuncionarios;
    private String senhaEspecial;
   
 

    public Gerente(String nome, String cpf, String tel, int id, String cargo, Date datadeAdmissao, String user,
            String Key, String totalFuncionarios, String senhaEspecial) {
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
    
    
}
