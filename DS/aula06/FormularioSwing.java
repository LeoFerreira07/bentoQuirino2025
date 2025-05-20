package DS.aula06;
import javax.swing.*;
 
public class FormularioSwing extends JFrame {
    // Declaração dos componentes
    private JLabel nomeLabel, senhaLabel, sexoLabel, paisLabel;
    private JTextField nomeField;
    private JPasswordField senhaField;
    private JRadioButton mascRadio, femRadio;
    private ButtonGroup sexoGroup;
    private JComboBox<String> paisCombo;
    private JCheckBox termosCheck;
    private JButton enviarButton;
    private JPanel painel;
 
    public FormularioSwing() {
        super("Formulário de Cadastro");
        initialization();
    }
    private void initialization() {
        painel = new JPanel();
        painel.setLayout(null); // Usando layout absoluto
   
        // Nome
        nomeLabel = new JLabel("Nome:");
        nomeLabel.setBounds(20, 20, 100, 25);
        nomeField = new JTextField();
        nomeField.setBounds(120, 20, 200, 25);
   
        // Senha
        senhaLabel = new JLabel("Senha:");
        senhaLabel.setBounds(20, 60, 100, 25);
        senhaField = new JPasswordField();
        senhaField.setBounds(120, 60, 200, 25);
   
        // Sexo
        sexoLabel = new JLabel("Sexo:");
        sexoLabel.setBounds(20, 100, 100, 25);
        mascRadio = new JRadioButton("Masculino");
        mascRadio.setBounds(120, 100, 100, 25);
        femRadio = new JRadioButton("Feminino");
        femRadio.setBounds(220, 100, 100, 25);
        sexoGroup = new ButtonGroup();
        sexoGroup.add(mascRadio);
        sexoGroup.add(femRadio);
   
        // País
        paisLabel = new JLabel("País:");
        paisLabel.setBounds(20, 140, 100, 25);
        String[] paises = {"Brasil", "Portugal", "Outros"};
        paisCombo = new JComboBox<>(paises);
        paisCombo.setBounds(120, 140, 200, 25);
   
        // Termos
        termosCheck = new JCheckBox("Aceito os termos de uso");
        termosCheck.setBounds(120, 180, 200, 25);
   
        // Botão
        enviarButton = new JButton("Enviar");
        enviarButton.setBounds(150, 220, 100, 30);
   
        // Adiciona componentes ao painel
        painel.add(nomeLabel);
        painel.add(nomeField);
        painel.add(senhaLabel);
        painel.add(senhaField);
        painel.add(sexoLabel);
        painel.add(mascRadio);
        painel.add(femRadio);
        painel.add(paisLabel);
        painel.add(paisCombo);
        painel.add(termosCheck);
        painel.add(enviarButton);
   
        // Configurações do frame
        this.setContentPane(painel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 320);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
   
    public static void main(String[] args) {
        new FormularioSwing();
    }
   
}