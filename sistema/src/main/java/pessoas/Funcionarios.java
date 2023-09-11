package pessoas;
import java.util.Date;
import java.util.Scanner;

public abstract class Funcionarios extends Pessoas {

    private int id;
    private String cargo;
    private Date datadeAdmissao;
    private String user;
    private String key;
 
    
       Scanner sc = new Scanner(System.in);
   
    public Funcionarios(String nome, String cpf, String tel, int id, String cargo, String user, String Key) {
        super(nome, cpf, tel);
        this.id = id;
        this.cargo = cargo;
       // this.datadeAdmissao = string;
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
    

    
}
