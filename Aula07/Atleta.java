public class Atleta {
    private int idade;
    private double peso;

    public Atleta() {
        this.idade = 0;
        this.peso = 0.0;
    }

    public Atleta(int idade, double peso) {
        this.idade = idade;
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public String determinaCategoria() {
        if (idade <= 12)
            return "Infantil";
        else if (idade <= 16 && peso <= 40)
            return "Juvenil Leve";
        else if (idade <= 16 && peso > 40)
            return "Juvenil pesado";
        else if(idade <= 24 && peso <= 45)
            return "Senior leve";
        else if (idade <= 24 && peso <= 60)
            return "Senior medio";
        else if (idade <= 24 && peso > 60)
            return "Senior pesado";
        else
            return "Veterano";
    }
}