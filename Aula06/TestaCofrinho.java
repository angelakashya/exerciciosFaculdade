
public class TestaCofrinho {

    public static void main(String args[]) {
        Teclado t = new Teclado ();

        System.out.println("Informe o nome do dono:");
        String nome = t.leString();
        System.out.println("Digite a quantidade de moedas de 10 centavos:");
        int qtd10 = t.leInt();
        System.out.println("Digite a quantidade de moedas de 25 centavos:");
        int qtd25 = t.leInt();
        System.out.println("Digite a quantidade de moedas de 50 centavos:");
        int qtd50 = t.leInt();

        Cofrinho c1 = new Cofrinho (nome, qtd10, qtd25, qtd50);
        c1.exibeDados();
        c1.depositaUmaMoedaDe10();
        c1.depositaUmaMoedaDe25();
        c1.depositaUmaMoedaDe50();
        c1.exibeDados();
    }    
}