package SalaryApp.Controller;

import SalaryApp.Model.EmployeeModel;
import SalaryApp.View.EmployeeDataView;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class EmployeeDataController {
    EmployeeDataView employeeDataView;
    EmployeeModel employeeModel;
    String[][] dataEmployee;
    public EmployeeDataController(EmployeeDataView employeeDataView, EmployeeModel employeeModel) {
        this.employeeDataView = employeeDataView;
        this.employeeModel = employeeModel;
        this.dataEmployee = employeeModel.getEmployeeForTable();
        employeeDataView.btnShow.addActionListener((ActionEvent e) -> {
            if (this.dataEmployee == null) {
                JOptionPane.showMessageDialog(null, "Data kosong");
            } else {
                this.employeeDataView.jTable.setModel((new JTable(dataEmployee, this.employeeDataView.columns)).getModel());
            }
        });
    }
}
