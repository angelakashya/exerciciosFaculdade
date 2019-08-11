
public class Livro {

    private String titulo;
    private int codigo;
    private String autor;
    private double preco;

    public Livro() {
        this.titulo = "";
        this.codigo = 0;
        this.autor = "";
        this.preco = 0;
    }

      public Livro(String titulo, int codigo, String autor, double preco) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.autor = autor;
        this.preco = preco;
    }

    public void setTitulo(String novoTitulo) {
        titulo = novoTitulo;
    }

    public void setCodigo(int novoCodigo) {
        codigo = novoCodigo;
    }

    public void setAutor(String novoAutor) {
        autor = novoAutor;
    }

    public void setPreco(double novoPreco) {
        preco = novoPreco;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public double calculaPrecoFinal(double desconto) {
        return preco - preco * desconto;
    }

    public void exibeDados() {
      System.out.println (titulo);
      System.out.println (codigo);
      System.out.println (autor);
      System.out.println (preco);
    }

    public static void main(String[] args) {
        Livro l = new Livro("The Kiss Of Deception", 1, "Mary E. Pearson", 39.90);
        l.exibeDados();
    }
}