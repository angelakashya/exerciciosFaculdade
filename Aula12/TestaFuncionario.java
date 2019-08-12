public class TestaFuncionarios {
    public static void main(String args[]) {
       Teclado t = new Teclado();
       
       System.out.println("Digite um nome: ");
       String nome = t.leString();
       System.out.println("Digite o número da matricula:");
       int matricula = t.leInt();
       System.out.println("Digite uma especialidade:");
       String especialidade = t.leString();
       
       Funcionario f = new Funcionario(nome);
       Assistente a = new Assistente(nome,matricula);
       AssistenteTecnico e = new AssistenteTecnico(nome, matricula, especialidade);
       System.out.println(e.toString());
    }
}