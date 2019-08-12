public class AssistenteTecnico extends Assistente {
   protected String especialidade;
   
   public AssistenteTecnico() {
       this.especialidade = "";
   }
   
   public AssistenteTecnico(String n, int m, String especialidade) {
       super(n,m);
       this.especialidade = especialidade;
   }
   
   public void setEspecialidade(String especialidade) {
       this.especialidade = especialidade;
   }
   
   public String getEspecialidade() {
       return especialidade;
   }
   
   public String toString() {
       return "Nome: " + nome + "\n" + "Matricula: " + matricula + "\n" + "Especialidade: " + especialidade;
   }
}