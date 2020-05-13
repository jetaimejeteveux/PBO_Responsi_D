package SalaryApp.View;

import SalaryApp.Controller.Move;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateView extends JFrame {
    JLabel lId = new JLabel("ID Pegawai : ");
    JLabel lNama = new JLabel("Nama : ");
    JLabel lPosisi = new JLabel("Posisi : ");
    JLabel lAlamat = new JLabel("Alamat : ");
    JLabel lNoHp = new JLabel("No HP : ");
    JLabel lGaji = new JLabel("Gaji Pokok : ");
    JLabel lInfo = new JLabel("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");

    public JTextField tfId = new JTextField();
    public JTextField tfNama = new JTextField();
    public JTextField tfAlamat = new JTextField();
    public JTextField tfNoHp = new JTextField();
    public JTextField tfGaji = new JTextField();

    String[] posisi = {"", "Direktur", "Manager", "Programmer", "Marketing"};
    public JComboBox jabatan = new JComboBox(posisi);

    public JButton btnSave = new JButton("UBAH");
    public JButton btnHomeMove = new JButton("HOME");
    public JButton btnEmployeeMove = new JButton("GAJI");
    public JButton btnDataMove = new JButton("DATA");
    public JButton btnInformasiMove = new JButton("INFORMASI");
    public JButton btnAdminMove = new JButton("PEGAWAI");

    public UpdateView() {
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        add(lInfo).setBounds(160,330,600,30);
        add(btnHomeMove).setBounds(20,20,100,60);
        add(btnEmployeeMove).setBounds(20,90,100,60);
        add(btnDataMove).setBounds(20,160,100,60);
        add(btnInformasiMove).setBounds(20,230,100,60);
        add(btnAdminMove).setBounds(470,20,100,60);
        add(btnSave).setBounds(470,270,100,60);

        add(lId).setBounds(130,40,100,20);
        add(lNama).setBounds(130,70,100,20);
        add(lPosisi).setBounds(130,100,100,20);
        add(lAlamat).setBounds(130,130,100,20);
        add(lNoHp).setBounds(130,160,100,20);
        add(lGaji).setBounds(130,190,100,20);

        add(tfId).setBounds(230,40,200,20);
        add(tfNama).setBounds(230,70,200,20);
        add(jabatan).setBounds(230,100,100,20);
        add(tfAlamat).setBounds(230,130,300,20);
        add(tfNoHp).setBounds(230,160,150,20);
        add(tfGaji).setBounds(230,190,150,20);

        ImageIcon backgroundmenu = new ImageIcon("icon/backgroundmenu.jpeg");
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
    }
}

