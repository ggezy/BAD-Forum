package com.example.test;

import java.util.ArrayList;
import java.util.Scanner;

public class session5 {

    public static int perhitungan(int i) {
        int temp = i, hasil = 0;

        //memasukkan hasil dari pangkat menjadi integer
        ArrayList<Integer> array = new ArrayList<>();
        do {
            array.add(temp % 10);
            temp /= 10;
        } while (temp > 0);

        //melakukan kalkulasi tiap digit dari hasil pangkat
        for (i = 0; i < array.size(); i++) {
            hasil += array.get(i);
        }
        return hasil;
    }

    public static void main (String[] args) {
        int nilai = 2;
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai x : ");
        int x = in.nextInt();

        //melakukan kalkulasi oangkat
        int sq = (int) Math.pow(nilai, x);

        System.out.println("Jawabannya: " + perhitungan(sq));
    }
}
