package SalaryApp.Controller;

import SalaryApp.Model.EmployeeModel;
import SalaryApp.View.UpdateView;

import java.awt.event.ActionEvent;

public class UpdateController {
        UpdateView updateView;
        EmployeeModel employeeModel;

        public UpdateController(UpdateView updateView, EmployeeModel employeeModel, String idPegawai) {
            this.updateView = updateView;
            this.employeeModel = employeeModel;
            String data[] = this.employeeModel.getEmployee(idPegawai);
            setText(data);

            this.updateView.btnSave.addActionListener((ActionEvent e) -> {
                String id = this.updateView.tfId.getText();
                String nama = this.updateView.tfNama.getText();
                String alamat = this.updateView.tfAlamat.getText();
                String noHp = this.updateView.tfNoHp.getText();
                String posisi = this.updateView.jabatan.getSelectedItem().toString();
                int gaji = Integer.parseInt(this.updateView.tfGaji.getText());

                this.employeeModel.updatePegawai(idPegawai, nama, alamat, noHp, posisi, gaji);
            });
        }

        private void setText(String[] data) {
            this.updateView.tfId.setText(data[0]);
            this.updateView.tfNama.setText(data[1]);
            this.updateView.tfAlamat.setText(data[2]);
            this.updateView.tfNoHp.setText(data[3]);
            this.updateView.jabatan.setSelectedItem(data[4]);
            this.updateView.tfGaji.setText(data[5]);
        }
}
