import javax.swing.JOptionPane;

public class TesteAtribuicao{
   //coletando os dados
   public static void main(String[] args){
   String nome = JOptionPane.showInputDialog("Digite o nome do Professor:");
   int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Professor: "));
   String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da Disciplina: ");
   boolean pratica = Boolean.parseBoolean(JOptionPane.showInputDialog("A Disciplina é práticada? true/false"));
   
   //Objeto
   Professor professor = new Professor (nome, idade);
   Disciplina disciplina = new Disciplina (nomeDisciplina, pratica);
   Atribuicao a = new Atribuicao (professor, disciplina);
   
   //saida
   JOptionPane.showMessageDialog(null,a.getDados());
   
   
   
   }

}