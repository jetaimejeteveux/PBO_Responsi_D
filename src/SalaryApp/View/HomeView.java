package SalaryApp.View;

import SalaryApp.Controller.Move;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeView extends JFrame {
    JLabel lInfo1 = new JLabel("Selamat Datang");
    JLabel lInfo2 = new JLabel("Silahkan masuk ke menu gaji untuk melakukan perhitungan gaji");
    JLabel lInfo3 = new JLabel("Jika mengalami kesulitan, klik menu petunjuk");
    JLabel lInfo4 = new JLabel("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");

    ImageIcon home = new ImageIcon("icon/home.png");
    Image getHome = home.getImage();
    Image modifiedHome = getHome.getScaledInstance(20, 20, Image.SCALE_REPLICATE);
    Icon homeIcon = new ImageIcon(modifiedHome);

    ImageIcon gaji = new ImageIcon("icon/salary.png");
    Image getGaji = gaji.getImage();
    Image modifiedGaji = getGaji.getScaledInstance(20, 20, Image.SCALE_REPLICATE);
    Icon gajiIcon = new ImageIcon(modifiedGaji);

    ImageIcon data = new ImageIcon("icon/file.jpg");
    Image getData = data.getImage();
    Image modifiedData = getData.getScaledInstance(20, 20, Image.SCALE_REPLICATE);
    Icon dataIcon = new ImageIcon(modifiedData);

    ImageIcon admin = new ImageIcon("icon/admin.png");
    Image getAdmin = admin.getImage();
    Image modifiedAdmin = getAdmin.getScaledInstance(20, 20, Image.SCALE_REPLICATE);
    Icon adminIcon = new ImageIcon(modifiedAdmin);

    public JButton btnHomeMove = new JButton("HOME",homeIcon);
    public JButton btnSalaryMove = new JButton("GAJI",gajiIcon);
    public JButton btnDataMove = new JButton("DATA",dataIcon);
    public JButton btnInformasiMove = new JButton("INFORMASI");
    public JButton btnAdminMove = new JButton("ADMIN",adminIcon);

    public HomeView() {
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        ImageIcon backgroundmenu = new ImageIcon("icon/backgroundmenu.jpeg");
        Image getbackgroundmenu = backgroundmenu.getImage();
        Image modifiedbackgroundmenu = getbackgroundmenu.getScaledInstance(600, 400, Image.SCALE_REPLICATE);
        backgroundmenu = new ImageIcon(modifiedbackgroundmenu);
        JLabel lbackgroundmenu = new JLabel(backgroundmenu);

        add(lInfo1);
        add(lInfo2);
        add(lInfo3);
        add(lInfo4);
        add(btnHomeMove);
        add(btnSalaryMove);
        add(btnDataMove);
        add(btnInformasiMove);
        add(btnAdminMove);
        add(lbackgroundmenu);

        setVisible(true);

        lInfo1.setBounds(160,100,200,20);
        lInfo2.setBounds(160,130,600,20);
        lInfo3.setBounds(160,160,600,20);
        lInfo4.setBounds(160,300,600,30);
        btnHomeMove.setBounds(20,20,100,60);
        btnSalaryMove.setBounds(20,90,100,60);
        btnDataMove.setBounds(20,160,100,60);
        btnInformasiMove.setBounds(20,230,100,60);
        btnAdminMove.setBounds(470,20,100,60);
        lbackgroundmenu.setBounds(0, 0, 600, 400);

        btnHomeMove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Move move = new Move();
                move.homeMove();
                dispose();
            }
        });

        btnSalaryMove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Move move = new Move();
                move.employeeSalaryMove();
                dispose();
            }
        });

        btnDataMove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Move move = new Move();
                move.dataEmployeeMove();
                dispose();
            }
        });

        btnInformasiMove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Move move = new Move();
                move.employeeInfoMove();
                dispose();
            }
        });

        btnAdminMove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Move move = new Move();
                move.loginAdminMove();
                dispose();
            }
        });
    }
}

