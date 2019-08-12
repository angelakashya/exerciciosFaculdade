public class Assistente extends Funcionario {
    protected int matricula;
    
    public Assistente() {
        this.matricula = 0;
    }
    
    public Assistente(String n, int matricula) {
        super(n);
        this.matricula = matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public String toString() {
        return "Nome: " + nome + "\n" + "Matricula: " + matricula; 
    }
}
