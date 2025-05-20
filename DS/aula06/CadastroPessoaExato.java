package DS.aula06;
import javax.swing.*;
import java.awt.*;

public class CadastroPessoaExato extends JFrame {

    public CadastroPessoaExato() {
        setTitle("Cadastro de Pessoa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.WHITE);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;

        int y = 0;

        // Título
        JLabel titulo = new JLabel("Cadastro de Pessoa");
        titulo.setFont(new Font("SansSerif", Font.BOLD, 32));
        titulo.setForeground(new Color(255, 102, 0));
        gbc.gridx = 0;
        gbc.gridy = y++;
        gbc.gridwidth = 6;
        panel.add(titulo, gbc);
        gbc.gridwidth = 1;

        // Linha 1 - Tipo | CPF/CNPJ | Fornecedor
        adicionarCampo(panel, gbc, 0, y, "Tipo", new JComboBox<>(new String[]{"Física", "Jurídica"}));
        adicionarCampo(panel, gbc, 1, y, "CPF / CNPJ", new JTextField());
        adicionarCampo(panel, gbc, 2, y++, "Fornecedor", new JCheckBox());

        // Linha 2 - Nome
        adicionarCampo(panel, gbc, 0, y, "Nome", new JTextField(), 3);
        y++;

        // Linha 3 (nova) - RG / Inscrição Estadual | Orgão Expedidor
        adicionarCampo(panel, gbc, 0, y, "RG / Inscrição Estadual", new JTextField());
        adicionarCampo(panel, gbc, 1, y++, "Orgão Expedidor", new JTextField());

        // Linha 4 - Email | CEP
        adicionarCampo(panel, gbc, 0, y, "Email", new JTextField());
        adicionarCampo(panel, gbc, 1, y++, "CEP", new JTextField());

        // Linha 5 - País | UF
        JTextField pais = new JTextField("BRASIL");
        pais.setEditable(false);
        adicionarCampo(panel, gbc, 0, y, "País", pais);
        adicionarCampo(panel, gbc, 1, y++, "UF", new JTextField());

        // Linha 6 - Município
        adicionarCampo(panel, gbc, 0, y, "Município", new JTextField(), 3);
        y++;

        // Linha 7 - Logradouro
        adicionarCampo(panel, gbc, 0, y, "Logradouro", new JTextField(), 3);
        y++;

        // Linha 8 - Número | Complemento
        adicionarCampo(panel, gbc, 0, y, "Número", new JTextField());
        adicionarCampo(panel, gbc, 1, y++, "Complemento", new JTextField());

        // Linha 9 - Bairro | Telefone
        adicionarCampo(panel, gbc, 0, y, "Bairro", new JTextField());
        adicionarCampo(panel, gbc, 1, y++, "Telefone", new JTextField());

        // Linha 10 - Situação (Ativo / Inativo)
        JLabel situacaoLabel = new JLabel("Situação:");
        gbc.gridx = 0;
        gbc.gridy = y;
        gbc.gridwidth = 1;
        panel.add(situacaoLabel, gbc);

        JRadioButton ativo = new JRadioButton("Ativo");
        JRadioButton inativo = new JRadioButton("Inativo");
        ButtonGroup group = new ButtonGroup();
        group.add(ativo);
        group.add(inativo);
        ativo.setBackground(Color.WHITE);
        inativo.setBackground(Color.WHITE);

        JPanel situacaoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        situacaoPanel.setBackground(Color.WHITE);
        situacaoPanel.add(ativo);
        situacaoPanel.add(inativo);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        panel.add(situacaoPanel, gbc);
        y++;

        // Botões
        JPanel botoes = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 10));
        botoes.setBackground(Color.WHITE);
        botoes.add(criarBotao("Confirmar", new Color(255, 102, 0), Color.WHITE));
        botoes.add(criarBotao("Excluir", new Color(255, 51, 51), Color.WHITE));
        botoes.add(criarBotao("Limpar", Color.LIGHT_GRAY, Color.BLACK));

        gbc.gridx = 0;
        gbc.gridy = y;
        gbc.gridwidth = 3;
        panel.add(botoes, gbc);

        add(panel);
        setVisible(true);
    }

    private void adicionarCampo(JPanel panel, GridBagConstraints gbc, int x, int y, String label, JComponent input) {
        adicionarCampo(panel, gbc, x, y, label, input, 1);
    }

    private void adicionarCampo(JPanel panel, GridBagConstraints gbc, int x, int y, String label, JComponent input, int gridWidth) {
        gbc.gridx = x * 2;
        gbc.gridy = y;
        gbc.gridwidth = 1;
        panel.add(new JLabel(label + ":"), gbc);

        gbc.gridx = x * 2 + 1;
        gbc.gridwidth = gridWidth * 2 - 1;

        input.setBackground(Color.WHITE);
        input.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        input.setPreferredSize(new Dimension(200, 25));
        panel.add(input, gbc);

        gbc.gridwidth = 1;
    }

    private JButton criarBotao(String texto, Color bg, Color fg) {
        JButton b = new JButton(texto);
        b.setBackground(bg);
        b.setForeground(fg);
        b.setFocusPainted(false);
        b.setPreferredSize(new Dimension(100, 30));
        return b;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CadastroPessoaExato::new);
    }
}
