package com.example.test;

public class test {

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        String string1 = "KOPASUS";
        String string2 = "JAMAICA";

        //melakukan reverse untuk kata yang pertama
        string1 = reverse(string1);
        StringBuilder sb1 = new StringBuilder();

        //membuat string menjadi char dan menambahkan koma
        for (char c : string1.toCharArray()) {
            sb1.append(c).append(",");
        }
        //menghapus koma terakhir
        if( sb1.length() > 0 )
            sb1.deleteCharAt( sb1.length() - 1 );
        System.out.println(sb1);

        //melakukan reverse untuk kata yang kedua
        string2 = reverse(string2);
        StringBuilder sb2 = new StringBuilder();

        //membuat string menjadi char dan menambahkan koma
        for (char c2 : string2.toCharArray()) {
            sb2.append(c2).append(",");
        }
        //menghapus koma terakhir
        if( sb2.length() > 0 )
            sb2.deleteCharAt( sb2.length() - 1 );
        System.out.println(sb2);
    }
}
