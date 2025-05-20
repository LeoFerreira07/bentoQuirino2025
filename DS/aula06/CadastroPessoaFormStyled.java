package DS.aula06;
import javax.swing.*;
import java.awt.*;

public class CadastroPessoaFormStyled extends JFrame {

    public CadastroPessoaFormStyled() {
        setTitle("Cadastro de Pessoa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 500);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(245, 245, 245));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        int y = 0;

        // Title
        JLabel titleLabel = new JLabel("Cadastro de Pessoa");
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        titleLabel.setForeground(new Color(255, 102, 0));
        gbc.gridx = 0;
        gbc.gridy = y++;
        gbc.gridwidth = 6;
        panel.add(titleLabel, gbc);
        gbc.gridwidth = 1;

        // Row 1
        gbc.gridy = y;
        gbc.gridx = 0;
        panel.add(new JLabel("Tipo"), gbc);
        gbc.gridx = 1;
        JComboBox<String> tipoCombo = new JComboBox<>(new String[]{"Física", "Jurídica"});
        panel.add(tipoCombo, gbc);

        gbc.gridx = 2;
        panel.add(new JLabel("CPF / CNPJ"), gbc);
        gbc.gridx = 3;
        JTextField cpfField = new JTextField(15);
        panel.add(cpfField, gbc);

        gbc.gridx = 4;
        panel.add(new JLabel("Fornecedor"), gbc);
        gbc.gridx = 5;
        JCheckBox fornecedorCheck = new JCheckBox();
        panel.add(fornecedorCheck, gbc);
        y++;

        // Row 2
        gbc.gridy = y;
        gbc.gridx = 0;
        panel.add(new JLabel("Nome"), gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 5;
        JTextField nomeField = new JTextField(40);
        panel.add(nomeField, gbc);
        gbc.gridwidth = 1;
        y++;

        // Row 3
        gbc.gridy = y;
        gbc.gridx = 0;
        panel.add(new JLabel("RG / Inscrição Estadual"), gbc);
        gbc.gridx = 1;
        JTextField rgField = new JTextField(15);
        panel.add(rgField, gbc);

        gbc.gridx = 2;
        panel.add(new JLabel("Orgão Expedidor"), gbc);
        gbc.gridx = 3;
        JTextField orgaoField = new JTextField(15);
        panel.add(orgaoField, gbc);
        y++;

        // Row 4
        gbc.gridy = y;
        gbc.gridx = 0;
        panel.add(new JLabel("Email"), gbc);
        gbc.gridx = 1;
        JTextField emailField = new JTextField(20);
        panel.add(emailField, gbc);

        gbc.gridx = 2;
        panel.add(new JLabel("CEP"), gbc);
        gbc.gridx = 3;
        JTextField cepField = new JTextField(10);
        panel.add(cepField, gbc);

        gbc.gridx = 4;
        panel.add(new JLabel("UF"), gbc);
        gbc.gridx = 5;
        JTextField ufField = new JTextField(5);
        panel.add(ufField, gbc);
        y++;

        // Row 5
        gbc.gridy = y;
        gbc.gridx = 0;
        panel.add(new JLabel("País"), gbc);
        gbc.gridx = 1;
        JTextField paisField = new JTextField("BRASIL", 10);
        paisField.setEditable(false);
        panel.add(paisField, gbc);

        gbc.gridx = 2;
        panel.add(new JLabel("Município"), gbc);
        gbc.gridx = 3;
        JTextField municipioField = new JTextField(15);
        panel.add(municipioField, gbc);
        y++;

        // Row 6
        gbc.gridy = y;
        gbc.gridx = 0;
        panel.add(new JLabel("Logradouro"), gbc);
        gbc.gridx = 1;
        JTextField logradouroField = new JTextField(20);
        panel.add(logradouroField, gbc);

        gbc.gridx = 2;
        panel.add(new JLabel("Número"), gbc);
        gbc.gridx = 3;
        JTextField numeroField = new JTextField(5);
        panel.add(numeroField, gbc);

        gbc.gridx = 4;
        panel.add(new JLabel("Complemento"), gbc);
        gbc.gridx = 5;
        JTextField complementoField = new JTextField(10);
        panel.add(complementoField, gbc);
        y++;

        // Row 7
        gbc.gridy = y;
        gbc.gridx = 0;
        panel.add(new JLabel("Bairro"), gbc);
        gbc.gridx = 1;
        JTextField bairroField = new JTextField(15);
        panel.add(bairroField, gbc);

        gbc.gridx = 2;
        panel.add(new JLabel("Telefone"), gbc);
        gbc.gridx = 3;
        JTextField telefoneField = new JTextField(10);
        panel.add(telefoneField, gbc);

        gbc.gridx = 4;
        panel.add(new JLabel("Situação"), gbc);
        gbc.gridx = 5;
        JTextField situacaoField = new JTextField(10);
        panel.add(situacaoField, gbc);
        y++;

        // Row 8 - Status
        gbc.gridy = y;
        gbc.gridx = 0;
        panel.add(new JLabel("Status"), gbc);
        gbc.gridx = 1;
        JRadioButton ativo = new JRadioButton("Ativo");
        JRadioButton inativo = new JRadioButton("Inativo");
        ButtonGroup statusGroup = new ButtonGroup();
        statusGroup.add(ativo);
        statusGroup.add(inativo);
        panel.add(ativo, gbc);
        gbc.gridx = 2;
        panel.add(inativo, gbc);
        y++;

        // Row 9 - Buttons
        gbc.gridy = y;
        gbc.gridx = 0;
        JButton confirmarButton = new JButton("Confirmar");
        confirmarButton.setBackground(new Color(255, 102, 0));
        confirmarButton.setForeground(Color.WHITE);
        panel.add(confirmarButton, gbc);

        gbc.gridx = 1;
        JButton excluirButton = new JButton("Excluir");
        excluirButton.setBackground(Color.RED);
        excluirButton.setForeground(Color.WHITE);
        panel.add(excluirButton, gbc);

        gbc.gridx = 2;
        JButton limparButton = new JButton("Limpar");
        panel.add(limparButton, gbc);

        add(new JScrollPane(panel));
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CadastroPessoaFormStyled::new);
    }
}
