package com.example.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filemanagement1 {
    public static void main(String[] args) throws Exception {
        try {
            File tempFile = File.createTempFile("tulisan", ".tmp");
            tempFile.deleteOnExit();
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
            bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit");
            bw.close();
            System.out.println("Text file telah dibuat");
            System.out.println();

            Scanner sc = new Scanner(tempFile);
            System.out.println("Isi dari text file: ");
            sc.useDelimiter("\\Z");

            System.out.println(sc.next());
        } catch (IOException e) {
            System.out.println("maaf terjadi kesalahan, harap coba lagi");
        }
    }
}