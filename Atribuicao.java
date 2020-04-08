public class Atribuicao{
   //atributos
   private Professor professor;
   private Disciplina disciplina;
   
   //metodo construtor
   public Atribuicao(Professor p, Disciplina d){
      professor = p;
      disciplina = d;
   }
   //metodo de acesso 
   public Professor getProfessor(){
      return professor;
   }
   public Disciplina getDisciplina(){
      return disciplina;
   }
   
   //metodo modificadores
   public void setProfessor(Professor p){
      professor = p;
   }
   
   public void setDisciplina(Disciplina d){
      disciplina = d;
   }
   
   //metodo getdados
   public String getDados(){
      return "Dados Professor: " +professor.getDados()+ "\n\nDados Disciplina: " +disciplina.getDados();
   }

}