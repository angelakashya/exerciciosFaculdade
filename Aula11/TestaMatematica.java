public class TestaMatematica {
    public static void main(String args[]) {
        Teclado t = new Teclado();
        
        System.out.println("Digite um número:");
        int numero = t.leInt();
        System.out.println("Digite um expoente:");
        int exp = t.leInt();
        
        Matematica m = new Matematica(numero);
        System.out.println(m.fatorial());
        System.out.println(m.pow(exp));
    }
}