public class Funcionario {
    protected String nome;

    public Funcionario() {
        this.nome = "";
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String toString() {
        return "Nome: " + nome;
    }
}