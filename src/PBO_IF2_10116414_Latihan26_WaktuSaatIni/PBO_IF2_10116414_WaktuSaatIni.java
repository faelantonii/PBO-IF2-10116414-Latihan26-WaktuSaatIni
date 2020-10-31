/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan26_WaktuSaatIni;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author sweenutt
 * NAMA         : FAEL ANTONI WIJAYA
 * KELAS        : PBO-2
 * NIM          : 10116414
 * DESKRIPSI    : Program Waktu Saat Ini
 */
public class PBO_IF2_10116414_WaktuSaatIni {
    public static void main(String[] args) {
        Locale id = new Locale("in", "ID");
        String pattern = "EEEE, dd MMM yyyy "+"hh:mm:ss";
        Date hariii = new Date();

        SimpleDateFormat waktu = new SimpleDateFormat(pattern, id);
        String sekarang = waktu.format(hariii);
        System.out.println("Hari ini adalah hari : " + sekarang);   
    }
    
}
