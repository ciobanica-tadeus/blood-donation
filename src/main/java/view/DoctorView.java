package view;

import javax.swing.*;
import java.awt.*;

public class DoctorView extends JFrame {
    private JPanel panel = new JPanel();
    private JLabel title = new JLabel("Hello Doctor!!");

    public DoctorView(){
        title.setFont(new Font("Georgian", Font.CENTER_BASELINE, 20));
        title.setBounds(50, 20, 200, 30);

        panel.add(title);
        panel.setLayout(null);
        panel.setBackground(new Color(204,255,255));
        this.setContentPane(panel);
        this.setTitle("Doctor Page");
        this.setSize(400,350);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        DoctorView doctorView = new DoctorView();
        doctorView.setVisible(true);
    }
}
