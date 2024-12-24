/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawanku.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author muhammadarya
 */
public class Koneksi {
    private static Connection cn = null;

    public static Connection getKoneksi() {
        if (cn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/db_karyawan";
                cn = DriverManager.getConnection(url, "root", "");
            } catch (SQLException err) {
                System.out.println("Koneksi gagal..." + err.getMessage());
                System.exit(0);
            }
        }
        return Koneksi.cn;
    }
}
