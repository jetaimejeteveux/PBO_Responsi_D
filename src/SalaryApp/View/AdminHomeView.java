package SalaryApp.View;

import SalaryApp.Controller.Move;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminHomeView extends JFrame {
    public JButton btnHomeMove = new JButton("Home");
    public JButton btnSalaryMove = new JButton("Tambah");
    public JButton btnDataMove = new JButton("Data");
    public JButton btnInformasiMove = new JButton("Petunjuk");
    public JButton btnAdminMove = new JButton("Karyawan");

    JLabel lWelcome = new JLabel("Selamat Datang Admin");
    JLabel lGuide = new JLabel("Masuk Menu Tambah untuk Menambah data");
    JLabel lHint = new JLabel("Menu Petunjuk Jika Kesulitan");
    JLabel lDefaultDefault = new JLabel("APP PERHITUNGAN GAJI");

    public AdminHomeView() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setLayout(null);
        setVisible(true);

        add(btnHomeMove).setBounds(10,20,100,60);
        add(btnSalaryMove).setBounds(10,90,100,60);
        add(btnDataMove).setBounds(10,160,100,60);
        add(btnInformasiMove).setBounds(10,230,100,60);
        add(btnAdminMove).setBounds(470,10,100,60);

        add(lWelcome);
        lGuide.setBounds(150, 100, 200, 20);
        add(lGuide);
        lGuide.setBounds(150, 120, 300, 20);
        add(lHint);
        lHint.setBounds(150, 140, 200, 20);
        add(lDefaultDefault);
        lDefaultDefault.setBounds(180, 320, 200, 20);
        ImageIcon backgroundmenu = new ImageIcon("icon/backgroundadmin.jpeg");
        Image getbackgroundmenu = backgroundmenu.getImage();
        Image modifiedbackgroundmenu = getbackgroundmenu.getScaledInstance(600, 400, Image.SCALE_REPLICATE);
        backgroundmenu = new ImageIcon(modifiedbackgroundmenu);
        JLabel lbackgroundmenu = new JLabel(backgroundmenu);
        add(lbackgroundmenu);
        lbackgroundmenu.setBounds(0, 0, 600, 400);

        btnAdminMove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Move move = new Move();
                move.homeMove();
                dispose();
            }
        });

        btnDataMove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Move move = new Move();
                move.adminDataEmployeeMove();
                dispose();
            }
        });
    }
}