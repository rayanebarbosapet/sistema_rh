package pessoas;

public abstract class Pessoas {
    private String nome;
    private String cpf;
    private String tel;
    
    public Pessoas(String nome, String cpf, String tel) {
        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTel() {
        return tel;
    }


    
    
}
