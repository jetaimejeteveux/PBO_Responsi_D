package SalaryApp.View;

import SalaryApp.Controller.Move;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeDataView extends JFrame {
    JLabel lInfo = new JLabel("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");

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
    public JButton btnShow = new JButton("SHOW");

    public JTable jTable;
    JScrollPane scrollPane;
    DefaultTableModel defaultTableModel;
    JScrollPane sp;
    JTextArea jTextArea = new JTextArea();
    public String columns[] = {"ID", "Nama", "Posisi", "Gaji Pokok", "Jam Lembur", "Tunjangan", "Total Gaji"};

    public EmployeeDataView() {
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        scrollPane = new JScrollPane(jTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        defaultTableModel = new DefaultTableModel(columns, 0);
        jTable = new JTable(defaultTableModel);
        sp = new JScrollPane(jTable);
        sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(sp).setBounds(120,80,400,200);

        add(lInfo).setBounds(160,330,600,30);
        add(btnHomeMove).setBounds(10,20,100,60);
        add(btnSalaryMove).setBounds(10,90,100,60);
        add(btnDataMove).setBounds(10,160,100,60);
        add(btnInformasiMove).setBounds(10,230,100,60);
        add(btnAdminMove).setBounds(470,10,100,60);
        add(btnShow).setBounds(250, 290,100,40);
        ImageIcon backgroundmenu = new ImageIcon("icon/backgroundmenu.jpeg");
        Image getbackgroundmenu = backgroundmenu.getImage();
        Image modifiedbackgroundmenu = getbackgroundmenu.getScaledInstance(600, 400, Image.SCALE_REPLICATE);
        backgroundmenu = new ImageIcon(modifiedbackgroundmenu);
        JLabel lbackgroundmenu = new JLabel(backgroundmenu);
        add(lbackgroundmenu);
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
