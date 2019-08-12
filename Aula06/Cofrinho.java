
public class Cofrinho {
    private String nome;
    private int qtd50;
    private int qtd25;
    private int qtd10;
    
    public Cofrinho() {
        this.nome = "";
        this.qtd50 = 0;
        this.qtd25 = 0;
        this.qtd10 = 0;
    }
    
    public Cofrinho(String nome, int qtd50, int qtd25,int qtd10) {
        this.nome = nome;
        this.qtd50 = qtd50;
        this.qtd25 = qtd25;
        this.qtd10 = qtd10;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public void setQtd50 (int qtd50) {
        this.qtd50 = qtd50;
    }
    
    public void setQtd25(int qtd25) {
        this.qtd25 = qtd25;
    }
    
    public void setQtd10 (int qtd10) {
        this.qtd10 = qtd10;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getQtd50() {
        return qtd50;
    }
    
    public int getQtd25() {
        return qtd25;
    }
    
    public int getQtd10() {
        return qtd10;
    }
    
    public int depositaUmaMoedaDe10() {
       return qtd10 ++;
    }
    
    public int depositaUmaMoedaDe25() {
        return qtd25 ++;
    }
    
    public int depositaUmaMoedaDe50() {
        return qtd50 ++;
    }
    
    public double calculaTotal() {   
     double total10 = qtd10*10;
     double total25 = qtd25*25;
     double total50 = qtd50*50;

      return (total10 + total25 + total50) / 100;
    }
    
    public void exibeDados() {
        System.out.println ("Nome:" + nome);
        System.out.println (calculaTotal());
        System.out.println (qtd10);
        System.out.println (qtd25);
        System.out.println (qtd50);
    }
    
}