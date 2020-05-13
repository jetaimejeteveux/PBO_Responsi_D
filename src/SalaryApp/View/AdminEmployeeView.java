package SalaryApp.View;

import SalaryApp.Controller.Move;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminEmployeeView extends JFrame {

    JLabel lInfo = new JLabel("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");

    public JButton btnHomeMove = new JButton("HOME");
    public JButton btnSalaryMove = new JButton("GAJI");
    public JButton btnDataMove = new JButton("DATA");
    public JButton btnInformasiMove = new JButton("INFORMASI");
    public JButton btnAdminMove = new JButton("PEGAWAI");
    public JButton btnShow = new JButton("SHOW");
    public JButton btnUpdate = new JButton("UPDATE");
    public JButton btnDelete = new JButton("DELETE");

    public JTable jTable;
    JScrollPane scrollPane;
    DefaultTableModel defaultTableModel;
    JScrollPane sp;
    JTextArea jTextArea = new JTextArea();
    public String columns[] = {"ID", "Nama", "Posisi", "Gaji Pokok", "Jam Lembur", "Tunjangan", "Total Gaji"};

    public AdminEmployeeView() {
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        ImageIcon backgroundmenu = new ImageIcon("icon/backgroundmenu.jpeg");
        Image getbackgroundmenu = backgroundmenu.getImage();
        Image modifiedbackgroundmenu = getbackgroundmenu.getScaledInstance(600, 400, Image.SCALE_REPLICATE);
        backgroundmenu = new ImageIcon(modifiedbackgroundmenu);
        JLabel lbackgroundmenu = new JLabel(backgroundmenu);

        scrollPane = new JScrollPane(jTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        defaultTableModel = new DefaultTableModel(columns, 0);
        jTable = new JTable(defaultTableModel);
        jTable.setFocusable(false);
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
        add(btnUpdate).setBounds(125, 290, 100, 40);
        add(btnDelete).setBounds(375, 290, 100, 40);
        add(lbackgroundmenu).setBounds(0, 0, 600, 400);

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