public class TestaPonto {

    public static void main(String args[]) {
        Teclado t = new Teclado();
        System.out.println("Digite um Ponto X");
        int x = t.leInt();
        System.out.println("Digite um Ponto Y");
        int y = t.leInt();
        
        Ponto p1 = new Ponto(x,y);
        p1.exibe();
        
        System.out.println("Digite um novo Ponto X");
        x = t.leInt();
        System.out.println("Digite um novo Ponto Y");
        y = t.leInt();
        
        Ponto p2 = new Ponto(x,y);
        p2.exibe();
    } 
}