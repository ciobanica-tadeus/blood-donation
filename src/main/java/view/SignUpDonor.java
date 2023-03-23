package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SignUpDonor extends JFrame {

    private JPanel panel = new JPanel();
    private JLabel title = new JLabel("Register");
    private JLabel emailLabel = new JLabel("Email: ");
    private JTextField emailField = new JTextField();
    private JLabel passwordLabel = new JLabel("Password: ");
    private final JPasswordField passwordField = new JPasswordField();
    private JLabel fullName = new JLabel("Full Name: ");
    private JTextField fullNameField = new JTextField();
    private JLabel location = new JLabel("Location: ");
    private JTextField locationField = new JTextField();
    private final JButton registerBtn = new JButton("Register");
    private final JButton backBtn = new JButton("Back");

    public SignUpDonor() {
        title.setFont(new Font("Georgian", Font.CENTER_BASELINE, 20));
        title.setBounds(160, 20, 100, 30);
        emailLabel.setBounds(10, 70, 100, 30);
        emailField.setBounds(110, 70, 200, 30);
        passwordLabel.setBounds(10, 110, 100, 30);
        passwordField.setBounds(110, 110, 200, 30);
        fullName.setBounds(10,150,100,30);
        fullNameField.setBounds(110,150,200,30);
        location.setBounds(10,190,100,30);
        locationField.setBounds(110,190,200,30);
        registerBtn.setBounds(160,240,100,30);
        backBtn.setBounds(10,10,80,20);

        panel.add(title);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(fullName);
        panel.add(fullNameField);
        panel.add(location);
        panel.add(locationField);

        registerBtn.setFocusPainted(false);
        registerBtn.setContentAreaFilled(false);
        backBtn.setFocusPainted(false);
        backBtn.setContentAreaFilled(false);

        panel.add(backBtn);
        panel.add(registerBtn);

        panel.setLayout(null);
        panel.setBackground(new Color(204,255,255));
        this.setContentPane(panel);
        this.setTitle("Register");
        this.setSize(400,350);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    public String getEmailField() {
        return emailField.getText().toString();
    }

    public String getPasswordField() {
        return passwordField.getText().toString();
    }

    public String getFullNameField() {
        return fullNameField.getText().toString();
    }

    public String getLocationField() {
        return locationField.getText().toString();
    }

    public void showMessage(String message){
        JOptionPane.showMessageDialog(registerBtn,message);
    }

    public void addRegisterListener(ActionListener actionListener){registerBtn.addActionListener(actionListener);}

    public void addBackListener(ActionListener actionListener){backBtn.addActionListener(actionListener);}

    public void clearAllComponents(){
        emailField.setText("");
        passwordField.setText("");
        fullNameField.setText("");
        locationField.setText("");
    }

    public static void main(String[] args) {
        SignUpDonor signUpDonor = new SignUpDonor();
        signUpDonor.setVisible(true);
    }

}
