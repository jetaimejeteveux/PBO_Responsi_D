package SalaryApp.View;

import SalaryApp.Controller.Move;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeInfoView extends JFrame {
    JLabel lInfo1 = new JLabel("klik tombol gaji untuk menghitung gaji anda");
    JLabel lInfo2 = new JLabel("klik tombol data untuk melihat data sudah masuk atau belum");
    JLabel lInfo3 = new JLabel("PETUNJUK KARYAWAN");

    public JButton btnBack = new JButton("BACK");

    public EmployeeInfoView() {
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        add(lInfo1).setBounds(120,70,400,40);
        add(lInfo2).setBounds(120,100,400,40);
        add(lInfo3).setBounds(170,20,600,30);
        add(btnBack).setBounds(200,200,100,40);

        ImageIcon backgroundmenu = new ImageIcon("icon/backgroundmenu.jpeg");
        Image getbackgroundmenu = backgroundmenu.getImage();
        Image modifiedbackgroundmenu = getbackgroundmenu.getScaledInstance(600, 400, Image.SCALE_REPLICATE);
        backgroundmenu = new ImageIcon(modifiedbackgroundmenu);
        JLabel lbackgroundmenu = new JLabel(backgroundmenu);
        add(lbackgroundmenu);
        lbackgroundmenu.setBounds(0, 0, 600, 400);

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Move move = new Move();
                move.homeMove();
                dispose();
            }
        });
    }
}

