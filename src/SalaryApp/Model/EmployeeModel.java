package SalaryApp.Model;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeModel {
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost/responsi";
    final static String USER = "root";
    final static String PASS = "";

    Connection connection;
    Statement statement;

    public EmployeeModel() {
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil!");
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
            System.out.println(err);
        }
    }

    public void insertEmployee(String idPegawai, String namaPegawai, String posisiPegawai, String alamatPegawai, String noHp, int gajiPokok, int jamLembur, int tunjangan, int pajak, int sumGaji) {
        try {
            String query = "INSERT INTO `data_pegawai` (`id_pegawai`, `nama_pegawai`, `posisi_pegawai`, `alamat_pegawai`, `no_hp`, `gaji_pokok`, `jam_lembur`, `tunjangan`, `pajak`, `sum_gaji`) " +
                    "VALUES ('" + idPegawai +"', '" + namaPegawai +"', '" + posisiPegawai +"', '" + alamatPegawai +"', '" + noHp +"', " + gajiPokok +", " + jamLembur +", " + tunjangan +", " + pajak +", " + sumGaji + ")";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menambahkan data pegawai, id sudah terpakai");
        }
    }
    private int getAllEmployee() {
        int jmlData = 0;
        try {
            statement = connection.createStatement();
            String query = "SELECT * FROM `data_pegawai`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                jmlData++;
            }
            return jmlData;
        } catch (Exception e) {
            return 0;
        }
    }
    public String[][] getEmployeeForTable() {
        try {
            int jmlData = 0;
            String dataEmployee[][] = new String[this.getAllEmployee()][7];
            String query = "SELECT * FROM `data_pegawai`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                dataEmployee[jmlData][0] = resultSet.getString("id_pegawai");
                dataEmployee[jmlData][1] = resultSet.getString("nama_pegawai");
                dataEmployee[jmlData][2] = resultSet.getString("posisi_pegawai");
                dataEmployee[jmlData][3] = Integer.toString(resultSet.getInt("gaji_pokok"));
                dataEmployee[jmlData][4] = Integer.toString(resultSet.getInt("jam_lembur"));
                dataEmployee[jmlData][5] = Integer.toString(resultSet.getInt("tunjangan"));
                dataEmployee[jmlData][6] = Integer.toString(resultSet.getInt("sum_gaji"));
                jmlData++;
            }
            return dataEmployee;
        } catch (Exception e) {
            return null;
        }
    }

    public void deleteEmployee(String idPegawai) {
        try {
            String query = "DELETE FROM `data_pegawai` WHERE `id_pegawai`='" + idPegawai + "'";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus");
        }
    }

    public void updatePegawai(String idPegawai, String nama, String alamat, String noHp, String posisi, int gaji) {
        try {
            String query = "UPDATE `data_pegawai` SET `nama_pegawai`='" + nama + "', `alamat_pegawai`='" + alamat + "', `no_hp`='" + noHp + "', `posisi`='" + posisi + "', `gaji`=" + gaji + " WHERE `id_pegawai`='" + idPegawai + "'";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data barang berhasil diupdate");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal di update");
        }
    }

    public String[] getEmployee(String idPegawai) {
        try {
            String[] data = new String[6];
            String query = "SELECT * FROM `data_admin` WHERE `id_pegawai`='" + idPegawai + "'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                data[0] = resultSet.getString("id_pegawai");
                data[1] = resultSet.getString("nama_pegawai");
                data[2] = resultSet.getString("alamat_pegawai");
                data[3] = resultSet.getString("no_hp");
                data[4] = resultSet.getString("posisi_pegawai");
                data[5] = Integer.toString(resultSet.getInt("gaji_pokok"));
            }
            return data;
        } catch (Exception e) {
            return null;
        }
    }
}
