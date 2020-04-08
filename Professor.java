public class Professor{
   //atributos
   private String nome;
   private int idade;
   
   //metodo construtor
   public Professor(String n, int i){
   nome = n;
   idade= i;
   }
   
   //metodo de acesso
   public String getNome(){
      return nome;  
   }
   public int getIdade(){
      return idade;
   }
   
   //metodo modificadores
   public void setNome(String n){
      nome = n;
   }
   public void setIdade(int i){
      idade = i;
   }
   //getdados
    public String getDados(){
    return "\nO Nome é: " +nome+ "\nA Idade é: " +idade+ "";
    }
   

}