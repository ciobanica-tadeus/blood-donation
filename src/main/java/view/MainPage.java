package view;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainPage extends JFrame {
    private JPanel panel = new JPanel();
    private JLabel title = new JLabel("WELCOME!");
    private final JButton login = new JButton("Login");
    private final JButton register = new JButton("Register");

    public MainPage(){

        title.setFont(new Font("Georgian",Font.CENTER_BASELINE,20));
        title.setBounds(120,20,150,30);
        login.setBounds(100,60,150,30);
        register.setBounds(100,100,150,30);

        panel.add(title);
        panel.add(login);
        login.setFocusPainted(false);
        login.setContentAreaFilled(false);
        register.setFocusPainted(false);
        register.setContentAreaFilled(false);
        panel.add(register);
        panel.setLayout(null);
        panel.setBackground(new Color(204,255,255));

        this.setContentPane(panel);
        this.setTitle("Welcome");
        this.setSize(350,200);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public void addLoginListener(ActionListener actionListener){
        login.addActionListener(actionListener);
    }

    public void addSignUpListener(ActionListener actionListener){
        register.addActionListener(actionListener);
    }

    public static void main(String[] args) {
        MainPage mainPage = new MainPage();
        mainPage.setVisible(true);
    }
}
