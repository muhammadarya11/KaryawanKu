/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawanku.utils;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author muhammadarya
 */
public class Formatter {

    public static String formatRupiah(Double uang) {
        if (uang == null) {
            return "Rp 0";
        }
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatRupiah.format(uang);
    }
}
