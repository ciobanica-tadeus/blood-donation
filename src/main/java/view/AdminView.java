package view;

import javax.swing.*;
import java.awt.*;

public class AdminView extends JFrame {
    private JPanel panel = new JPanel();
    private JLabel title = new JLabel("Hello Admin!!");

    public AdminView(){
        title.setFont(new Font("Georgian", Font.CENTER_BASELINE, 20));
        title.setBounds(50, 20, 200, 30);

        panel.add(title);
        panel.setLayout(null);
        panel.setBackground(new Color(204,255,255));
        this.setContentPane(panel);
        this.setTitle("Admin Page");
        this.setSize(400,350);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
