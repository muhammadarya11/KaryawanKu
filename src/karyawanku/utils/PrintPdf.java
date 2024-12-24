/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawanku.utils;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import karyawanku.DB.Karyawan;

/**
 *
 * @author muhammadarya
 */
public class PrintPdf {

    public static boolean print() {
        String file = "document/file.pdf";
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(new File(file)));
            //open
            document.open();

            String header1 = "Laporan Data Karyawan";
            Font f = new Font();
            f.setStyle(Font.BOLD);
            f.setSize(16);
            document.add(new Paragraph(header1, f));

            String header2 = "PT. KaryawanKu";
            f.setStyle(Font.NORMAL);
            f.setSize(12);
            document.add(new Paragraph(header2, f));

            float[] colWidths = {1f, 1f, 4f, 2f, 4f, 4f};

            PdfPTable table = new PdfPTable(colWidths);
            table.setWidthPercentage(100f);

            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);

            table.addCell("No");
            table.addCell("ID");
            table.addCell("Nama");
            table.addCell("Jenis Kelamin");
            table.addCell("Divisi");
            table.addCell("Gaji");
            int no = 1;
            // get data
            ArrayList<Object[]> data = Karyawan.getAllData();
            for (Object[] item : data) {
                table.addCell("" + no);
                table.addCell("" + item[0]);
                table.addCell((String) item[1]);
                table.addCell(((String) item[2]).equals("L") ? "Laki-laki" : "Perempuan");
                table.addCell((String) item[3]);
                table.addCell(Formatter.formatRupiah((Double) item[4]));
                no++;
            }

            document.add(table);
            document.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
