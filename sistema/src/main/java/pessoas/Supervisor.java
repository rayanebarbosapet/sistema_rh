package pessoas;

import java.util.Date;

public class Supervisor extends Funcionarios {

    private String codigo;

    public Supervisor(String nome, String cpf, String tel, int id, String cargo, Date datadeAdmissao, String user,
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
    
    
}
