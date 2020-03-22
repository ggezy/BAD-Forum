package com.example.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class datetimeproblem1 {
    public static void main(String[] args) throws ParseException {
        Locale waktuIndonesia = new Locale("id", "ID");
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd MMMM yyyy", waktuIndonesia);
        SimpleDateFormat formatHari = new SimpleDateFormat("EEEE", waktuIndonesia);
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Masukkan tanggal : ");
            String tanggalInput = in.nextLine();

            Date dt1 = formatTanggal.parse(tanggalInput);
            String displayHari = formatHari.format(dt1);

            System.out.println("Hari " + displayHari);
        } catch (Exception e) {
            System.out.println("Maaf tanggal input Anda salah!");
        }

    }
}
