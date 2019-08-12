public class Socio {
    protected int numero;
    protected int idade;
    protected String nome;

    public Socio() {
        this.numero = 0;
        this.idade = 0;
        this.nome = "";
    }

    public Socio(int numero, int idade, String nome) {
        this.numero = numero;
        this.idade = idade;
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String toString() {
        return numero + ", " + idade + ", " + nome;
    }
}