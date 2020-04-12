package com.example.test;

import java.util.Scanner;

public class exceptionhandling {
    public static void main (String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            System.out.println("Masukkan x : ");
            int x = in.nextInt();
            System.out.println("Masukkan y : ");
            int y = in.nextInt();

            System.out.println("Hasilnya : " + x / y);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
