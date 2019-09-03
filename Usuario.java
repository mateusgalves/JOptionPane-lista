import javax.swing.JOptionPane;

public class Usuario {
    public static void main (String [] args){
        String x = JOptionPane.showInputDialog(null,"Qual a sua Idade?", JOptionPane.QUESTION_MESSAGE);
    int idade = Integer.parseInt(x);
    
    String n = JOptionPane.showInputDialog(null, "Qual o seu nome?", JOptionPane.QUESTION_MESSAGE);
    
    if (idade >= 18){
        JOptionPane.showMessageDialog(null, n + " Você já pode tirar CNH!");
    } else{
        JOptionPane.showMessageDialog(null, n + " Você ainda não pode tirar CNH, você tem apenas" + idade + "anos");
    }
    
      
    }
    
}
