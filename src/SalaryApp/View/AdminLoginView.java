package SalaryApp.View;

import javax.swing.*;
import java.awt.*;

public class AdminLoginView extends JFrame {
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    public JTextField user = new JTextField(20);
    public JPasswordField pass = new JPasswordField(20);
    public JButton login = new JButton("Login");
    public JButton cancel = new JButton("Cancel");

    public AdminLoginView() {
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        add(username).setBounds(60,100,100,30);
        add(user).setBounds(160,100,150,30);
        add(password).setBounds(60,140,100,30);
        add(pass).setBounds(160,140,150,30);
        add(login).setBounds(80,200,100,30);
        add(cancel).setBounds(200,200,100,30);
        ImageIcon backgroundmenu = new ImageIcon("icon/backgroundmenu.jpeg");
        Image getbackgroundmenu = backgroundmenu.getImage();
        Image modifiedbackgroundmenu = getbackgroundmenu.getScaledInstance(400, 300, Image.SCALE_REPLICATE);
        backgroundmenu = new ImageIcon(modifiedbackgroundmenu);
        JLabel lbackgroundmenu = new JLabel(backgroundmenu);
        add(lbackgroundmenu);
        lbackgroundmenu.setBounds(0, 0, 400, 300);
    }
}
