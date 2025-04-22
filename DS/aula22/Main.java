package DS.aula22;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args){
        
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        // retornar o nome 
        JOptionPane.showMessageDialog(null, "O nome é: " + nome);
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja finalizar?"
                , "Finalizar", JOptionPane.YES_NO_OPTION);
        if(resposta == JOptionPane.YES_OPTION){
            
        }

    }
}
