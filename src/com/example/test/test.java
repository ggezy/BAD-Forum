package com.example.test;

import java.util.Arrays;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        //mendeklarasi scanner class ke dalam variable input
        Scanner input = new Scanner (System.in);

        System.out.println("masukkan jumlah data yang akan Anda input : ");

        int jumlahData=input.nextInt();
        //mendefinisikan array sesuai dengan jumlah data user
        int arr[]=new int[jumlahData];

        System.out.println("masukkan angka : ");

        for(int i=0;i<jumlahData;i++){ //memasukkan angka ke dalam array
            arr[i]=input.nextInt();
        }

        //memanggil method untuk mencari value terkecil
        int min = angkaTerkecil(arr);
        System.out.println("Nilai minimum = " + min);

        //memanggil method untuk mencari value terbesar
        int max = angkaTerbesar(arr);
        System.out.println("Nilai maksimum = " + max);

        //memanggil method untuk mencari nilai median
        int median = nilaiMedian(arr);
        System.out.println("Nilai median = " + median);
    }

    //method untuk mencari value terbesar
    public static int angkaTerbesar(int[] inputArray) {

        //mendefinisikan value terbesar mulai dari index 0
        int max = inputArray[0];
        //melakukan komparasi setiap value yang ada di array
        for (int i = 1; i < inputArray.length; i++)
            if (inputArray[i] > max)
                max = inputArray[i];
        return max;
    }

    //method untuk mencari value terkecil
    public static int angkaTerkecil(int[] inputArray) {

        //mendefinisikan value terkecil mulai dari index 0
        int min = inputArray[0];
        //melakukan komparasi setiap value yang ada di array
        for (int i = 1; i < inputArray.length; i++)
            if (inputArray[i] < min)
                min = inputArray[i];
        return min;
    }

    //method untuk mencari nilai median
    public static int nilaiMedian(int[] inputArray){
        //sortir array untuk melakukan perhitungan median
        Arrays.sort(inputArray);

        int median;
        int totalElements = inputArray.length;

        //melakukan pengecekan bila jumlah array adalah genap atau ganjil
        if (totalElements % 2 == 0) { //bila genap maka melakukan kalkulasi value yang berada di index tengah array
            median = (inputArray[inputArray.length/2] + inputArray[inputArray.length/2 - 1])/2;
        } else { //bila ganjil maka mengambil value yang berada di index tengah array
            median = inputArray[inputArray.length/2];
        }
        return median;
    }
}
