package SalaryApp.Controller;

import SalaryApp.Model.EmployeeModel;
import SalaryApp.View.EmployeeSalaryView;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SalaryController {
    EmployeeSalaryView employeeSalaryView;
    EmployeeModel employeeModel;

    String idPegawai;
    String namaPegawai;
    String posisiPegawai;
    String alamatPegawai;
    String noHp;
    int tunjangan;
    int pajak;
    int sumGaji;
    int gajiPokok;
    int jamLembur;

    public SalaryController(EmployeeSalaryView employeeSalaryView, EmployeeModel employeeModel) {
        this.employeeSalaryView = employeeSalaryView;
        this.employeeModel = employeeModel;

        employeeSalaryView.btnHitung.addActionListener((ActionEvent e) -> {
            try {
                this.gajiPokok = Integer.parseInt(employeeSalaryView.tfGaji.getText());
                this.jamLembur = Integer.parseInt(employeeSalaryView.tfJamLembur.getText());
            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, "Masukkan angka yang benar");
            }
            if (this.gajiPokok == 0 || this.jamLembur == 0) {
                JOptionPane.showMessageDialog(null, "Field tidak boleh kosong");
            } else {
                this.tunjangan = jamLembur * 15000;
                this.pajak = (gajiPokok / 100) * 1;
                this.sumGaji = gajiPokok - pajak + tunjangan;
                this.setField(Integer.toString(tunjangan), Integer.toString(pajak), Integer.toString(sumGaji));
            }

        });

        employeeSalaryView.btnSave.addActionListener((ActionEvent e) -> {
            this.idPegawai = employeeSalaryView.tfId.getText();
            this.namaPegawai = employeeSalaryView.tfNama.getText();
            this.posisiPegawai = employeeSalaryView.jabatan.getSelectedItem().toString();
            this.alamatPegawai = employeeSalaryView.tfAlamat.getText();
            this.noHp = employeeSalaryView.tfNoHp.getText();


            if (this.idPegawai.equals("")||this.namaPegawai.equals("")||this.posisiPegawai.equals("")||this.alamatPegawai.equals("")||this.noHp.equals("")||this.gajiPokok==0||this.jamLembur==0||this.tunjangan==0||this.pajak==0||this.sumGaji==0) {
                JOptionPane.showMessageDialog(null, "Field tidak boleh kosong");
            } else {
                employeeModel.insertEmployee(this.idPegawai, this.namaPegawai, this.posisiPegawai, this.alamatPegawai, this.noHp, this.gajiPokok, this.jamLembur, this.tunjangan, this.pajak, this.sumGaji);
                this.setEmptyField();
            }
        });
    }

    private void setField(String tunjangan, String pajak, String sumGaji) {
        this.employeeSalaryView.tfTunjangan.setText(tunjangan);
        this.employeeSalaryView.tfPajak.setText(pajak);
        this.employeeSalaryView.tfSumGaji.setText(sumGaji);
    }

    private void setEmptyField() {
        this.employeeSalaryView.tfId.setText("");
        this.employeeSalaryView.tfNama.setText("");
        this.employeeSalaryView.jabatan.setSelectedIndex(0);
        this.employeeSalaryView.tfAlamat.setText("");
        this.employeeSalaryView.tfNoHp.setText("");
        this.employeeSalaryView.tfGaji.setText("");
        this.employeeSalaryView.tfJamLembur.setText("");
        this.employeeSalaryView.tfTunjangan.setText("");
        this.employeeSalaryView.tfPajak.setText("");
        this.employeeSalaryView.tfSumGaji.setText("");
    }
}
