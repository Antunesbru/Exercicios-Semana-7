public class Disciplina{
   //atributos
   private String nomeDisciplina;
   private boolean pratica;
   
   //metodo construtor
   public Disciplina(String n, boolean p){
      nomeDisciplina = n;
      pratica = p;
       }
              
      //metodo de acesso
      public String getNomeDisciplina(){
         return nomeDisciplina;
      }
      public boolean getPratica(){
         return pratica;
      }
      
      //metodo modificadores
      public void setNomeDisciplina(String n){
         nomeDisciplina = n;
      }
      public void setPratica(boolean p){
         pratica = p;
      }
      
      //metodo getdados
      public String getDados(){
         return "\nNome da Disciplina: " +nomeDisciplina+ "\nPratica: " +pratica+ "";
      }
   
  

}