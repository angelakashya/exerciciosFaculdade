public class TestaAtleta {
    public static void main (String args []) {
        Teclado t = new Teclado();

        System.out.println("Digite a Idade:");
        int idade = t.leInt();
        System.out.println("Digite o Peso");
        double peso = t.leDouble();

        Atleta a1 = new Atleta(idade,peso);
        System.out.println(a1.determinaCategoria());
    }
}