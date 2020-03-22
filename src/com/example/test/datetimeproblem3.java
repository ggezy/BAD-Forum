package com.example.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class datetimeproblem3 {
    public static void main(String[] args) throws ParseException {
        Locale waktuIndonesia = new Locale("id", "ID");
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd MMMM yyyy HH:mm", waktuIndonesia);
        SimpleDateFormat formatHari = new SimpleDateFormat("dd/MM/yyyy hh:mm aa", waktuIndonesia);
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Masukkan tanggal dan waktu (24hrs time format) : ");
            String tanggalInput = in.nextLine();

            Date dt1 = formatTanggal.parse(tanggalInput);
            String displayTanggal = formatHari.format(dt1);

            System.out.println("Hasilnya adalah : \n" + displayTanggal);
        } catch (Exception e) {
            System.out.println("Maaf input Anda salah!");
        }

    }
}
