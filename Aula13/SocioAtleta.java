public class SocioAtleta extends Socio {
    protected String categoria;

    public SocioAtleta() {
        categoria = "Mirim";
        numero = 0;
        idade = 0;
    }

    public SocioAtleta(int n, int i, String no ) {
        super(n, i, no);
        atualizarCategoria();
    }

    private void atualizarCategoria() {
        if(idade <= 10)
            categoria = "Mirim";
        else if(idade >= 11 && idade <= 15)
            categoria = "Infantil";
        else if(idade >= 16 && idade <= 20)
            categoria = "Juvenil";
        else if(idade >= 21 && idade <= 40)
            categoria = "Adulto";
        else if(idade > 40)
            categoria = "Master"; 
    }

    public void setIdade(int idade) {
        this.idade = idade;
        atualizarCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public String toString() {
        return numero + ", " + idade + ", " + nome + ", " + categoria;
    }
}