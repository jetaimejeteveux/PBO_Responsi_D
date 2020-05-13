package SalaryApp.Controller;

import SalaryApp.Model.EmployeeModel;
import SalaryApp.View.AdminEmployeeView;
import SalaryApp.View.UpdateView;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AdminEmployeeController {
    AdminEmployeeView adminEmployeeView;
    EmployeeModel employeeModel;
    String[][] dataEmployee;

    public AdminEmployeeController(AdminEmployeeView adminEmployeeView, EmployeeModel employeeModel) {
        this.adminEmployeeView = adminEmployeeView;
        this.employeeModel = employeeModel;
        this.dataEmployee = employeeModel.getEmployeeForTable();

        this.adminEmployeeView.btnShow.addActionListener((ActionEvent e) -> {
            if (this.dataEmployee == null) {
                JOptionPane.showMessageDialog(null, "Data kosong");
            } else {
                this.setDataTabel(adminEmployeeView);
            }
        });

        this.adminEmployeeView.btnDelete.addActionListener((ActionEvent e) -> {
            int row = this.adminEmployeeView.jTable.getSelectedRow();
            String idPegawai = this.adminEmployeeView.jTable.getValueAt(row, 0).toString();
            this.employeeModel.deleteEmployee(idPegawai);
            this.setDataTabel(adminEmployeeView);
        });

        this.adminEmployeeView.btnUpdate.addActionListener((ActionEvent e) -> {
            int row = this.adminEmployeeView.jTable.getSelectedRow();
            String idPegawai = this.adminEmployeeView.jTable.getValueAt(row, 0).toString();
            UpdateView updateView = new UpdateView();
            UpdateController updateController = new UpdateController(updateView, employeeModel, idPegawai);
            this.adminEmployeeView.dispose();
        });
    }

    private void setDataTabel(AdminEmployeeView adminEmployeeView) {
        this.dataEmployee = employeeModel.getEmployeeForTable();
        this.adminEmployeeView.jTable.setModel((new JTable(dataEmployee, this.adminEmployeeView.columns)).getModel());
    }

}