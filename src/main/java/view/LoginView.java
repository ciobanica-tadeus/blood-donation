package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginView extends JFrame {
    private JPanel panel = new JPanel();

    private JLabel title = new JLabel("Log In");
    private JLabel emailLabel = new JLabel("Email: ");
    private JTextField emailField = new JTextField();
    private JLabel passwordLabel = new JLabel("Password: ");
    private final JPasswordField passwordField = new JPasswordField();
    private final JButton logBtn = new JButton("Log in");
    private final JButton backBtn = new JButton("Back");

    public LoginView (){
        title.setFont(new Font("Georgian",Font.CENTER_BASELINE,20));
        title.setBounds(160,20,100,30);
        emailLabel.setBounds(10,70,100,30);
        emailField.setBounds(110,70,200,30);
        passwordLabel.setBounds(10,110,100,30);
        passwordField.setBounds(110,110,200,30);
        logBtn.setBounds(150,160,100,30);
        backBtn.setBounds(10,10,80,20);

        panel.add(title);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(backBtn);

        logBtn.setFocusPainted(false);
        logBtn.setContentAreaFilled(false);
        backBtn.setFocusPainted(false);
        backBtn.setContentAreaFilled(false);

        panel.add(logBtn);
        panel.setLayout(null);
        panel.setBackground(new Color(204,255,255));
        this.setContentPane(panel);
        this.setTitle("Log in");
        this.setSize(400,250);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    public String getEmail(){
        return emailField.getText().toString();
    }

    public String getPassword(){
        return passwordField.getText().toString();
    }

    public void setEmailField(String name){
        emailField.setText(name);
    }

    public void setPasswordField(String password){
        passwordField.setText(password);
    }

    public void showMessage(String message){
        JOptionPane.showMessageDialog(logBtn,message);
    }

    public void addLogInListener(ActionListener actionListener){logBtn.addActionListener(actionListener);}

    public void addBackListener(ActionListener actionListener){backBtn.addActionListener(actionListener);}

    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
    }
}

