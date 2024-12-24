/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawanku.DB;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author muhammadarya
 */
public class Karyawan {

    public static void register(String username, String password) {
        try {
            Connection conn = Koneksi.getKoneksi();

            // Query untuk memeriksa apakah username sudah ada
            String checkSql = "SELECT COUNT(*) FROM user WHERE username = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setString(1, username);

            ResultSet rs = checkStmt.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                // Username sudah terdaftar
                JOptionPane.showMessageDialog(null, "Username sudah terdaftar", "Gagal", JOptionPane.WARNING_MESSAGE);
                rs.close();
                checkStmt.close();
                conn = null;
                return;
            }

            // Query untuk INSERT jika username belum terdaftar
            String sql = "INSERT INTO user (username, password) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);

            stmt.execute();

//            JOptionPane.showMessageDialog(null, "Berhasil membuat akun", "Berhasil", JOptionPane.INFORMATION_MESSAGE);

            stmt.close();
            conn = null;

        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    public static boolean login(String username, String password) {
        try {
            Connection conn = Koneksi.getKoneksi();
            String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            // Memeriksa apakah query menghasilkan baris (user ditemukan)
            if (rs.next()) {
                // Jika username dan password ditemukan, login berhasil
                stmt.close();
                conn = null;
                return true;
            } else {
                // Jika tidak ada baris yang ditemukan, login gagal
                stmt.close();
                conn = null;
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void insert(String nama, String jenisKelamin, String divisi, Double gaji) {
        try {
            Connection conn = Koneksi.getKoneksi();
            String sql = "INSERT INTO karyawan (nama, jenis_kelamin, divisi, gaji) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, nama);
            stmt.setString(2, jenisKelamin);
            stmt.setString(3, divisi);
            stmt.setDouble(4, gaji);

            stmt.execute();

            stmt.close();
            conn = null;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean update(int id, String nama, String jenisKelamin, String divisi, Double gaji) {
        try {
            Connection conn = Koneksi.getKoneksi();
            String sql = "UPDATE karyawan SET nama = ?, jenis_kelamin = ?, divisi = ?, gaji = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, nama);
            stmt.setString(2, jenisKelamin);
            stmt.setString(3, divisi);
            stmt.setDouble(4, gaji);
            stmt.setInt(5, id);

            stmt.execute();
            stmt.close();
            conn = null;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean delete(int id) {
        try {
            Connection conn = Koneksi.getKoneksi();
            String sql = "DELETE from karyawan WHERE id = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setInt(1, id);

            stmt.execute();
            stmt.close();
            conn = null;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static ArrayList<Object[]> getAllData() {
        ArrayList<Object[]> data = new ArrayList<Object[]>();

        try {
            Connection conn = Koneksi.getKoneksi();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM karyawan";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Object[] row = new Object[5];
                row[0] = rs.getInt("id");
                row[1] = rs.getString("nama");
                row[2] = rs.getString("jenis_kelamin");
                row[3] = rs.getString("divisi");
                row[4] = rs.getDouble("gaji");
                data.add(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static ArrayList<Object[]> getAllData(String divisi) {
        ArrayList<Object[]> data = new ArrayList<>();

        if (divisi.isEmpty()) {
            return Karyawan.getAllData();
        }
        try {
            Connection conn = Koneksi.getKoneksi();
            String sql = "SELECT * FROM karyawan WHERE divisi = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, divisi); // Mengisi parameter divisi

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[5];
                row[0] = rs.getInt("id");
                row[1] = rs.getString("nama");
                row[2] = rs.getString("jenis_kelamin");
                row[3] = rs.getString("divisi");
                row[4] = rs.getDouble("gaji");
                data.add(row);
            }

            // Menutup ResultSet dan Statement
            rs.close();
            stmt.close();
            conn = null;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static ArrayList<Object[]> getDataByName(String nama) {
        ArrayList<Object[]> data = new ArrayList<>();

        try {
            Connection conn = Koneksi.getKoneksi();
            String sql = "SELECT * FROM karyawan WHERE nama LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + nama + "%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[5];
                row[0] = rs.getInt("id");
                row[1] = rs.getString("nama");
                row[2] = rs.getString("jenis_kelamin");
                row[3] = rs.getString("divisi");
                row[4] = rs.getDouble("gaji");
                data.add(row);
            }

            rs.close();
            stmt.close();
            conn = null;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static Object[] getData(int id) {
        Object[] data = null;
        try {
            Connection conn = Koneksi.getKoneksi();
            String sql = "SELECT * FROM karyawan WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                data = new Object[5];
                data[0] = rs.getInt("id");
                data[1] = rs.getString("nama");
                data[2] = rs.getString("jenis_kelamin");
                data[3] = rs.getString("divisi");
                data[4] = rs.getDouble("gaji");
            }

            // Tutup result set dan statement
            rs.close();
            stmt.close();
            conn = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public static HashMap<String, Integer> getTotalDivisi() {
        HashMap<String, Integer> data = new HashMap<String, Integer>();
        try {
            Connection conn = Koneksi.getKoneksi();
            Statement st = conn.createStatement();
            String sql = "SELECT divisi, COUNT(*) AS total_karyawan FROM karyawan GROUP BY divisi;";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                data.put(rs.getString("divisi"), rs.getInt("total_karyawan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static int getTotalKaryawan() {
        int result = 0;
        try {
            Connection conn = Koneksi.getKoneksi();
            Statement st = conn.createStatement();
            String sql = "SELECT COUNT(*) AS total_karyawan FROM karyawan";
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                result += rs.getInt("total_karyawan");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}
