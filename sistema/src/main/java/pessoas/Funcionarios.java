package pessoas;
import java.util.Date;

public abstract class Funcionarios extends Pessoas {

    private int id;
    private String cargo;
    private Date datadeAdmissao;
    private String user;
    private String key;
    private int mesesTrabalhados;
   
    public Funcionarios(String nome, String cpf, String tel, int id, String cargo, Date datadeAdmissao, String user, String Key,int mesesTrabalhados) {
        super(nome, cpf, tel);
        this.id = id;
        this.cargo = cargo;
        this.datadeAdmissao = datadeAdmissao;
        this.mesesTrabalhados = mesesTrabalhados;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public Date getDatadeAdmissao() {
        return datadeAdmissao;
    }

    public String getUser() {
        return user;
    }

    public String getKey() {
        return key;
    }

    public int getMesesTrabalhados() {
        return mesesTrabalhados;
    }

    public void setMesesTrabalhados(int mesesTrabalhados) {
        this.mesesTrabalhados = mesesTrabalhados;
    }
    

    
    
}
