package Screens;

import javax.swing.*;
import java.awt.Color;
//import helper_classes.*;

public class MainScreen {
  public  MainScreen() {
    
     JFrame frame = new JFrame("Cadastro de Nome");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(680, 420);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#1e1e1e"));

     JLabel lblTitle = new JLabel("Digite seu nome");
     lblTitle.setBounds(250, 47, 190, 40);
     //lblTitle.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 27));
     lblTitle.setForeground(Color.decode("#D9D9D9"));
     panel.add(lblTitle);

     JTextField txtNome = new JTextField("");
     txtNome.setBounds(254, 170, 194, 21);
     //txtNome.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     txtNome.setBackground(Color.decode("#B2B2B2"));
     txtNome.setForeground(Color.decode("#656565"));
     //txtNome.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     //OnFocusEventHelper.setOnFocusText(txtNome, "Nome", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(txtNome);

     JButton btbObeterNome = new JButton("Salvar Nome");
     btbObeterNome.setBounds(254, 224, 194, 30);
     btbObeterNome.setBackground(Color.decode("#2e2e2e"));
     btbObeterNome.setForeground(Color.decode("#D9D9D9"));
     //btbObeterNome.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 16));
    /// btbObeterNome.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     btbObeterNome.setFocusPainted(false);
     //OnClickEventHelper.setOnClickColor(btbObeterNome, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(btbObeterNome);

     frame.add(panel);
     frame.setVisible(true);

  }
}