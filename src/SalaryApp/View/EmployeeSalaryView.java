package SalaryApp.View;

import SalaryApp.Controller.Move;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeSalaryView extends JFrame {
    JLabel lId = new JLabel("ID Pegawai : ");
    JLabel lNama = new JLabel("Nama : ");
    JLabel lPosisi = new JLabel("Posisi : ");
    JLabel lAlamat = new JLabel("Alamat : ");
    JLabel lNoHp = new JLabel("No HP : ");
    JLabel lGaji = new JLabel("Gaji Pokok : ");
    JLabel lJamLembur = new JLabel("Jam Lembur : ");
    JLabel lTunjangan = new JLabel("Tunjangan : ");
    JLabel lPajak = new JLabel("Pajak : ");
    JLabel lSumGaji = new JLabel("Total Gaji : ");
    JLabel lInfo = new JLabel("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");

    public JTextField tfId = new JTextField();
    public JTextField tfNama = new JTextField();
    public JTextField tfAlamat = new JTextField();
    public JTextField tfNoHp = new JTextField();
    public JTextField tfGaji = new JTextField();
    public JTextField tfJamLembur = new JTextField();
    public JTextField tfTunjangan = new JTextField();
    public JTextField tfPajak = new JTextField();
    public JTextField tfSumGaji = new JTextField();

    String[] posisi = {"", "Direktur", "Manager", "Programmer", "Marketing"};
    public JComboBox jabatan = new JComboBox(posisi);

    public JButton btnHitung = new JButton("Hitung");
    public JButton btnSave = new JButton("Simpan");

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

    public EmployeeSalaryView() {
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        add(lInfo).setBounds(160,330,600,30);
        add(btnHomeMove).setBounds(20,20,100,60);
        add(btnSalaryMove).setBounds(20,90,100,60);
        add(btnDataMove).setBounds(20,160,100,60);
        add(btnInformasiMove).setBounds(20,230,100,60);
        add(btnAdminMove).setBounds(470,20,100,60);
        add(btnHitung).setBounds(470,200,100,60);
        add(btnSave).setBounds(470,270,100,60);

        add(lId).setBounds(130,40,100,20);
        add(lNama).setBounds(130,70,100,20);
        add(lPosisi).setBounds(130,100,100,20);
        add(lAlamat).setBounds(130,130,100,20);
        add(lNoHp).setBounds(130,160,100,20);
        add(lGaji).setBounds(130,190,100,20);
        add(lJamLembur).setBounds(130,220,100,20);
        add(lTunjangan).setBounds(130,250,100,20);
        add(lPajak).setBounds(130,280,100,20);
        add(lSumGaji).setBounds(130,310,100,20);

        add(tfId).setBounds(230,40,200,20);
        add(tfNama).setBounds(230,70,200,20);
        add(jabatan).setBounds(230,100,100,20);
        add(tfAlamat).setBounds(230,130,300,20);
        add(tfNoHp).setBounds(230,160,150,20);
        add(tfGaji).setBounds(230,190,150,20);
        add(tfJamLembur).setBounds(230,220,100,20);
        add(tfTunjangan).setBounds(230,250,150,20);
        add(tfPajak).setBounds(230,280,150,20);
        add(tfSumGaji).setBounds(230,310,150,20);

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

