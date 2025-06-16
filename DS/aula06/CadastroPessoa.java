import javax.swing.*;
import java.awt.*;

public class CadastroPessoa extends JFrame {

    private JTextField txtCpf, txtNome, txtRg, txtOrgao, txtEmail, txtCep, txtUf, txtComp, txtMunicipio, txtLogradouro,
            txtNumero, txtComplemento, txtBairro, txtTelefone;
    private JComboBox<String> comboTipo;
    private JCheckBox fornecedorCheck;
    private JRadioButton radioAtivo, radioInativo;
    private ButtonGroup grupoSituacao;

    public CadastroPessoa() {
        setTitle("Cadastro de Pessoa");
        setSize(1050, 500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new Color(250, 250, 250));

        Font fontePadrao = new Font("Arial", Font.PLAIN, 14);

        JLabel lblTitulo = new JLabel("Cadastro de Pessoa");
        lblTitulo.setBounds(40, 20, 400, 32);
        lblTitulo.setFont(new Font("Arial", Font.PLAIN, 30));
        lblTitulo.setForeground(new Color(255, 102, 0));
        add(lblTitulo);

        JLabel lblTipo = new JLabel("Tipo");
        lblTipo.setBounds(40, 70, 140, 30);
        lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTipo.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        lblTipo.setFont(new Font("Arial", Font.BOLD, 14));
        lblTipo.setOpaque(true);
        lblTipo.setBackground(Color.WHITE);
        add(lblTipo);

        comboTipo = new JComboBox<>(new String[] { "Pessoa:", "Física", "Jurídica" });
        comboTipo.setBounds(190, 70, 140, 30);
        comboTipo.setFont(fontePadrao);
        add(comboTipo);

        JLabel lblCpf = new JLabel("CPF / CNPJ");
        lblCpf.setBounds(340, 70, 140, 30);
        lblCpf.setHorizontalAlignment(SwingConstants.CENTER);
        lblCpf.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        lblCpf.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblCpf);

        txtCpf = new JTextField();
        txtCpf.setBounds(495, 70, 250, 30);
        txtCpf.setFont(fontePadrao);
        add(txtCpf);

        JLabel lblFornecedor = new JLabel("Fornecedor");
        lblFornecedor.setBounds(765, 70, 140, 30);
        lblFornecedor.setHorizontalAlignment(SwingConstants.CENTER);
        lblFornecedor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblFornecedor.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblFornecedor);

        fornecedorCheck = new JCheckBox();
        fornecedorCheck.setBounds(915, 75, 20, 20);
        fornecedorCheck.setBackground(new Color(252, 252, 252));
        add(fornecedorCheck);

        JLabel lblNome = new JLabel("Nome");
        lblNome.setBounds(40, 105, 140, 30);
        lblNome.setHorizontalAlignment(SwingConstants.CENTER);
        lblNome.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        lblNome.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(190, 105, 780, 30);
        txtNome.setFont(fontePadrao);
        add(txtNome);

        JLabel lblRg = new JLabel("RG / Inscrição Estadual");
        lblRg.setBounds(40, 140, 140, 30);
        lblRg.setHorizontalAlignment(SwingConstants.CENTER);
        lblRg.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        lblRg.setFont(new Font("Arial", Font.BOLD, 12));
        add(lblRg);

        txtRg = new JTextField();
        txtRg.setBounds(190, 140, 140, 30);
        txtRg.setFont(fontePadrao);
        add(txtRg);

        JLabel lblOrgao = new JLabel("Orgão Expedidor");
        lblOrgao.setBounds(340, 140, 140, 30);
        lblOrgao.setHorizontalAlignment(SwingConstants.CENTER);
        lblOrgao.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblOrgao.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblOrgao);

        txtOrgao = new JTextField();
        txtOrgao.setBounds(490, 140, 140, 30);
        txtOrgao.setFont(fontePadrao);
        add(txtOrgao);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(40, 175, 140, 30);
        lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
        lblEmail.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        lblEmail.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(190, 175, 290, 30);
        txtEmail.setFont(fontePadrao);
        add(txtEmail);

        JLabel lblCep = new JLabel("CEP");
        lblCep.setBounds(490, 175, 140, 30);
        lblCep.setHorizontalAlignment(SwingConstants.CENTER);
        lblCep.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblCep.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblCep);

        txtCep = new JTextField();
        txtCep.setBounds(640, 175, 330, 30);
        txtCep.setFont(fontePadrao);
        add(txtCep);

        JLabel lblPais = new JLabel("País");
        lblPais.setBounds(40, 210, 140, 30);
        lblPais.setHorizontalAlignment(SwingConstants.CENTER);
        lblPais.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        lblPais.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblPais);

        JLabel lblValorPais = new JLabel("BRASIL");
        lblValorPais.setBounds(190, 210, 290, 30);
        lblValorPais.setOpaque(true);
        lblValorPais.setBackground(new Color(201, 201, 201));
        lblValorPais.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        lblValorPais.setHorizontalAlignment(SwingConstants.LEFT);
        lblValorPais.setFont(fontePadrao);
        add(lblValorPais);

        JLabel lblUf = new JLabel("UF");
        lblUf.setBounds(490, 210, 140, 30);
        lblUf.setHorizontalAlignment(SwingConstants.CENTER);
        lblUf.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblUf.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblUf);

        txtUf = new JTextField();
        txtUf.setBounds(640, 210, 70, 30);
        txtUf.setFont(fontePadrao);
        add(txtUf);

        txtComp = new JTextField();
        txtComp.setBounds(720, 210, 250, 30);
        txtComp.setFont(fontePadrao);
        txtComp.setBackground(new Color(201, 201, 201));
        add(txtComp);

        JLabel lblMunicipio = new JLabel("Município");
        lblMunicipio.setBounds(40, 245, 140, 30);
        lblMunicipio.setHorizontalAlignment(SwingConstants.CENTER);
        lblMunicipio.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        lblMunicipio.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblMunicipio);

        txtMunicipio = new JTextField();
        txtMunicipio.setBounds(190, 245, 780, 30);
        txtMunicipio.setFont(fontePadrao);
        txtMunicipio.setBackground(new Color(201, 201, 201));
        add(txtMunicipio);

        JLabel lblLogradouro = new JLabel("Logradouro");
        lblLogradouro.setBounds(40, 280, 140, 30);
        lblLogradouro.setHorizontalAlignment(SwingConstants.CENTER);
        lblLogradouro.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        lblLogradouro.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblLogradouro);

        txtLogradouro = new JTextField();
        txtLogradouro.setBounds(190, 280, 780, 30);
        txtLogradouro.setFont(fontePadrao);
        add(txtLogradouro);

        JLabel lblNumero = new JLabel("Número");
        lblNumero.setBounds(40, 315, 140, 30);
        lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
        lblNumero.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        lblNumero.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(190, 315, 140, 30);
        txtNumero.setFont(fontePadrao);
        add(txtNumero);

        JLabel lblComplemento = new JLabel("Complemento");
        lblComplemento.setBounds(340, 315, 140, 30);
        lblComplemento.setHorizontalAlignment(SwingConstants.CENTER);
        lblComplemento.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblComplemento.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblComplemento);

        txtComplemento = new JTextField();
        txtComplemento.setBounds(490, 315, 480, 30);
        txtComplemento.setFont(fontePadrao);
        add(txtComplemento);

        JLabel lblBairro = new JLabel("Bairro");
        lblBairro.setBounds(40, 350, 140, 30);
        lblBairro.setHorizontalAlignment(SwingConstants.CENTER);
        lblBairro.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        lblBairro.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblBairro);

        txtBairro = new JTextField();
        txtBairro.setBounds(190, 350, 140, 30);
        txtBairro.setFont(fontePadrao);
        add(txtBairro);

        JLabel lblTelefone = new JLabel("Telefone");
        lblTelefone.setBounds(340, 350, 140, 30);
        lblTelefone.setHorizontalAlignment(SwingConstants.CENTER);
        lblTelefone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblTelefone.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblTelefone);

        txtTelefone = new JTextField();
        txtTelefone.setBounds(490, 350, 140, 30);
        txtTelefone.setFont(fontePadrao);
        add(txtTelefone);

        JLabel lblSituacao = new JLabel("Situação");
        lblSituacao.setBounds(640, 350, 140, 30);
        lblSituacao.setHorizontalAlignment(SwingConstants.CENTER);
        lblSituacao.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblSituacao.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblSituacao);

        radioAtivo = new JRadioButton("Ativo");
        radioAtivo.setBounds(790, 350, 70, 30);
        radioAtivo.setFont(fontePadrao);
        radioAtivo.setBackground(Color.WHITE);
        add(radioAtivo);

        radioInativo = new JRadioButton("Inativo");
        radioInativo.setBounds(860, 350, 80, 30);
        radioInativo.setFont(fontePadrao);
        radioInativo.setBackground(Color.WHITE);
        add(radioInativo);

        grupoSituacao = new ButtonGroup();
        grupoSituacao.add(radioAtivo);
        grupoSituacao.add(radioInativo);

        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBounds(40, 400, 120, 30);
        btnConfirmar.setBackground(new Color(255, 102, 0));
        btnConfirmar.setForeground(Color.WHITE);
        btnConfirmar.setFont(fontePadrao);
        btnConfirmar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
            txtCpf.setText("");
            txtNome.setText("");
            txtRg.setText("");
            txtOrgao.setText("");
            txtEmail.setText("");
            txtCep.setText("");
            txtUf.setText("");
            txtComp.setText("");
            txtMunicipio.setText("");
            txtLogradouro.setText("");
            txtNumero.setText("");
            txtComplemento.setText("");
            txtBairro.setText("");
            txtTelefone.setText("");
            comboTipo.setSelectedIndex(0);
            fornecedorCheck.setSelected(false);
            grupoSituacao.clearSelection();
        });
        add(btnConfirmar);

        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(170, 400, 120, 30);
        btnExcluir.setBackground(new Color(255, 102, 0));
        btnExcluir.setForeground(Color.WHITE);
        btnExcluir.setFont(fontePadrao);
        btnExcluir.addActionListener(e -> {
            txtCpf.setText("");
            txtNome.setText("");
            txtRg.setText("");
            txtOrgao.setText("");
            txtEmail.setText("");
            txtCep.setText("");
            txtUf.setText("");
            txtComp.setText("");
            txtMunicipio.setText("");
            txtLogradouro.setText("");
            txtNumero.setText("");
            txtComplemento.setText("");
            txtBairro.setText("");
            txtTelefone.setText("");
            comboTipo.setSelectedIndex(0);
            fornecedorCheck.setSelected(false);
            grupoSituacao.clearSelection();
        });
        add(btnExcluir);

        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(300, 400, 120, 30);
        btnLimpar.setBackground(new Color(201, 201, 201));
        btnLimpar.setForeground(Color.BLACK);
        btnLimpar.setFont(fontePadrao);
        btnLimpar.addActionListener(e -> {
            txtCpf.setText("");
            txtNome.setText("");
            txtRg.setText("");
            txtOrgao.setText("");
            txtEmail.setText("");
            txtCep.setText("");
            txtUf.setText("");
            txtComp.setText("");
            txtMunicipio.setText("");
            txtLogradouro.setText("");
            txtNumero.setText("");
            txtComplemento.setText("");
            txtBairro.setText("");
            txtTelefone.setText("");
            comboTipo.setSelectedIndex(0);
            fornecedorCheck.setSelected(false);
            grupoSituacao.clearSelection();
        });
        add(btnLimpar);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CadastroPessoa();
    }
}