package SalaryApp.Controller;

import SalaryApp.Model.AdminModel;
import SalaryApp.Model.EmployeeModel;
import SalaryApp.View.*;

public class Move {
    public void homeMove() {
        HomeView homeView = new HomeView();
        EmployeeModel employeeModel = new EmployeeModel();
    }

    public void dataEmployeeMove() {
        EmployeeDataView employeeDataView = new EmployeeDataView();
        EmployeeModel employeeModel = new EmployeeModel();
        EmployeeDataController dataEmployeeController = new EmployeeDataController(employeeDataView, employeeModel);
    }

    public void employeeSalaryMove() {
        EmployeeSalaryView employeeSalaryView = new EmployeeSalaryView();
        EmployeeModel employeeModel = new EmployeeModel();
        SalaryController employeeSalaryController = new SalaryController(employeeSalaryView, employeeModel);
    }

    public void employeeInfoMove() {
        EmployeeInfoView employeeInfoView = new EmployeeInfoView();
    }

    public void adminMove() {
        AdminHomeView adminHomeView = new AdminHomeView();
    }

    public void adminDataEmployeeMove() {
        AdminEmployeeView adminEmployeeView = new AdminEmployeeView();
        EmployeeModel employeeModel = new EmployeeModel();
        AdminEmployeeController adminEmployeeController = new AdminEmployeeController(adminEmployeeView, employeeModel);
    }

    public void loginAdminMove() {
        AdminLoginView adminLoginView = new AdminLoginView();
        AdminModel adminModel = new AdminModel();
        AdminLoginController adminLoginController = new AdminLoginController(adminLoginView, adminModel);
    }
}