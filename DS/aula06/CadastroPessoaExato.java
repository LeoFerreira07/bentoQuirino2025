package DS.aula06;
import javax.swing.*;
import java.awt.*;

public class CadastroPessoaExato extends JFrame {

    public CadastroPessoaExato() {
        setTitle("Cadastro de Pessoa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.WHITE);

        // Panel principal com margens
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));

        // Título
        JLabel titulo = new JLabel("Cadastro de Pessoa");
        titulo.setFont(new Font("Arial", Font.PLAIN, 24));
        titulo.setForeground(new Color(255, 102, 51));
        titulo.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainPanel.add(titulo);
        mainPanel.add(Box.createVerticalStrut(25));

        // Container para os campos
        JPanel fieldsPanel = new JPanel();
        fieldsPanel.setLayout(new BoxLayout(fieldsPanel, BoxLayout.Y_AXIS));
        fieldsPanel.setBackground(Color.WHITE);
        fieldsPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Linha 1: Tipo | CPF/CNPJ | Fornecedor
        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        linha1.setBackground(Color.WHITE);
        linha1.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JPanel tipoPanel = criarCampoPanel("Tipo", new JComboBox<>(new String[]{"Física", "Jurídica"}), 120);
        JPanel cpfPanel = criarCampoPanel("CPF / CNPJ", new JTextField(), 200);
        JPanel fornecedorPanel = criarCheckboxPanel("Fornecedor", new JCheckBox());
        
        linha1.add(tipoPanel);
        linha1.add(Box.createHorizontalStrut(40));
        linha1.add(cpfPanel);
        linha1.add(Box.createHorizontalStrut(40));
        linha1.add(fornecedorPanel);
        
        fieldsPanel.add(linha1);
        fieldsPanel.add(Box.createVerticalStrut(15));

        // Linha 2: Nome (campo largo)
        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        linha2.setBackground(Color.WHITE);
        linha2.setAlignmentX(Component.LEFT_ALIGNMENT);
        JPanel nomePanel = criarCampoPanel("Nome", new JTextField(), 600);
        linha2.add(nomePanel);
        fieldsPanel.add(linha2);
        fieldsPanel.add(Box.createVerticalStrut(15));

        // Linha 3: RG/Inscrição Estadual | Órgão Expedidor
        JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        linha3.setBackground(Color.WHITE);
        linha3.setAlignmentX(Component.LEFT_ALIGNMENT);
        JPanel rgPanel = criarCampoPanel("RG / Inscrição Estadual", new JTextField(), 250);
        JPanel orgaoPanel = criarCampoPanel("Órgão Expedidor", new JTextField(), 250);
        linha3.add(rgPanel);
        linha3.add(Box.createHorizontalStrut(40));
        linha3.add(orgaoPanel);
        fieldsPanel.add(linha3);
        fieldsPanel.add(Box.createVerticalStrut(15));

        // Linha 4: Email | CEP
        JPanel linha4 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        linha4.setBackground(Color.WHITE);
        linha4.setAlignmentX(Component.LEFT_ALIGNMENT);
        JPanel emailPanel = criarCampoPanel("Email", new JTextField(), 300);
        JPanel cepPanel = criarCampoPanel("CEP", new JTextField(), 150);
        linha4.add(emailPanel);
        linha4.add(Box.createHorizontalStrut(40));
        linha4.add(cepPanel);
        fieldsPanel.add(linha4);
        fieldsPanel.add(Box.createVerticalStrut(15));

        // Linha 5: País | UF
        JPanel linha5 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        linha5.setBackground(Color.WHITE);
        linha5.setAlignmentX(Component.LEFT_ALIGNMENT);
        JTextField paisField = new JTextField("BRASIL");
        paisField.setEditable(false);
        paisField.setBackground(new Color(240, 240, 240));
        JPanel paisPanel = criarCampoPanel("País", paisField, 200);
        JPanel ufPanel = criarCampoPanel("UF", new JTextField(), 100);
        linha5.add(paisPanel);
        linha5.add(Box.createHorizontalStrut(40));
        linha5.add(ufPanel);
        fieldsPanel.add(linha5);
        fieldsPanel.add(Box.createVerticalStrut(15));

        // Linha 6: Município
        JPanel linha6 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        linha6.setBackground(Color.WHITE);
        linha6.setAlignmentX(Component.LEFT_ALIGNMENT);
        JPanel municipioPanel = criarCampoPanel("Município", new JTextField(), 600);
        linha6.add(municipioPanel);
        fieldsPanel.add(linha6);
        fieldsPanel.add(Box.createVerticalStrut(15));

        // Linha 7: Logradouro
        JPanel linha7 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        linha7.setBackground(Color.WHITE);
        linha7.setAlignmentX(Component.LEFT_ALIGNMENT);
        JPanel logradouroPanel = criarCampoPanel("Logradouro", new JTextField(), 600);
        linha7.add(logradouroPanel);
        fieldsPanel.add(linha7);
        fieldsPanel.add(Box.createVerticalStrut(15));

        // Linha 8: Número | Complemento
        JPanel linha8 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        linha8.setBackground(Color.WHITE);
        linha8.setAlignmentX(Component.LEFT_ALIGNMENT);
        JPanel numeroPanel = criarCampoPanel("Número", new JTextField(), 150);
        JPanel complementoPanel = criarCampoPanel("Complemento", new JTextField(), 250);
        linha8.add(numeroPanel);
        linha8.add(Box.createHorizontalStrut(40));
        linha8.add(complementoPanel);
        fieldsPanel.add(linha8);
        fieldsPanel.add(Box.createVerticalStrut(15));

        // Linha 9: Bairro | Telefone
        JPanel linha9 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        linha9.setBackground(Color.WHITE);
        linha9.setAlignmentX(Component.LEFT_ALIGNMENT);
        JPanel bairroPanel = criarCampoPanel("Bairro", new JTextField(), 250);
        JPanel telefonePanel = criarCampoPanel("Telefone", new JTextField(), 200);
        linha9.add(bairroPanel);
        linha9.add(Box.createHorizontalStrut(40));
        linha9.add(telefonePanel);
        fieldsPanel.add(linha9);
        fieldsPanel.add(Box.createVerticalStrut(15));

        // Linha 10: Situação
        JPanel linha10 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        linha10.setBackground(Color.WHITE);
        linha10.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JPanel situacaoPanel = new JPanel();
        situacaoPanel.setLayout(new BoxLayout(situacaoPanel, BoxLayout.Y_AXIS));
        situacaoPanel.setBackground(Color.WHITE);
        
        JLabel situacaoLabel = new JLabel("Situação");
        situacaoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        situacaoLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        situacaoPanel.add(situacaoLabel);
        situacaoPanel.add(Box.createVerticalStrut(5));
        
        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        radioPanel.setBackground(Color.WHITE);
        radioPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JRadioButton ativo = new JRadioButton("Ativo");
        JRadioButton inativo = new JRadioButton("Inativo");
        ativo.setSelected(true);
        ativo.setBackground(Color.WHITE);
        inativo.setBackground(Color.WHITE);
        ativo.setFont(new Font("Arial", Font.PLAIN, 12));
        inativo.setFont(new Font("Arial", Font.PLAIN, 12));
        
        ButtonGroup group = new ButtonGroup();
        group.add(ativo);
        group.add(inativo);
        
        radioPanel.add(ativo);
        radioPanel.add(Box.createHorizontalStrut(15));
        radioPanel.add(inativo);
        
        situacaoPanel.add(radioPanel);
        linha10.add(situacaoPanel);
        fieldsPanel.add(linha10);
        fieldsPanel.add(Box.createVerticalStrut(25));

        // Botões
        JPanel botoesPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        botoesPanel.setBackground(Color.WHITE);
        botoesPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JButton confirmar = criarBotao("Confirmar", new Color(255, 102, 51));
        JButton excluir = criarBotao("Excluir", new Color(255, 102, 51));
        JButton limpar = criarBotao("Limpar", new Color(200, 200, 200));
        
        botoesPanel.add(confirmar);
        botoesPanel.add(Box.createHorizontalStrut(15));
        botoesPanel.add(excluir);
        botoesPanel.add(Box.createHorizontalStrut(15));
        botoesPanel.add(limpar);
        
        fieldsPanel.add(botoesPanel);

        mainPanel.add(fieldsPanel);
        add(mainPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private JPanel criarCampoPanel(String labelText, JComponent campo, int largura) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.WHITE);
        
        JLabel label = new JLabel(labelText);
        label.setFont(new Font("Arial", Font.PLAIN, 12));
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        campo.setPreferredSize(new Dimension(largura, 25));
        campo.setMaximumSize(new Dimension(largura, 25));
        campo.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        if (campo instanceof JTextField) {
            campo.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(180, 180, 180), 1),
                BorderFactory.createEmptyBorder(3, 6, 3, 6)
            ));
        } else if (campo instanceof JComboBox) {
            campo.setBackground(Color.WHITE);
            ((JComboBox<?>) campo).setSelectedIndex(0);
        }
        
        panel.add(label);
        panel.add(Box.createVerticalStrut(3));
        panel.add(campo);
        
        return panel;
    }

    private JPanel criarCheckboxPanel(String labelText, JCheckBox checkbox) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.WHITE);
        
        JLabel label = new JLabel(labelText);
        label.setFont(new Font("Arial", Font.PLAIN, 12));
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        checkbox.setBackground(Color.WHITE);
        checkbox.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        panel.add(label);
        panel.add(Box.createVerticalStrut(3));
        panel.add(checkbox);
        
        return panel;
    }

    private JButton criarBotao(String texto, Color cor) {
        JButton botao = new JButton(texto);
        botao.setBackground(cor);
        botao.setForeground(Color.WHITE);
        botao.setFont(new Font("Arial", Font.PLAIN, 12));
        botao.setPreferredSize(new Dimension(80, 30));
        botao.setFocusPainted(false);
        botao.setBorderPainted(false);
        botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        if (texto.equals("Limpar")) {
            botao.setForeground(Color.BLACK);
        }
        
        return botao;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CadastroPessoaExato::new);
    }
}