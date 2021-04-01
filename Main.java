package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 // deklarasi variabel
        String nama, kelas, nim,fakultas, jurusan;

     // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        System.out.println("DATA MAHASISWA");
        System.out.print("Nama Siswa: ");

     // menggunakan scanner dan menyimapan apa yang diketik di variabel nama
        nama = keyboard.nextLine();

     // saya akan menampilkan ouput lagi
         System.out.print("Kelas: ");
     // menggunakan scaaner lagi
        kelas = keyboard.nextLine();

        System.out.print("Jurusan: ");
        jurusan = keyboard.nextLine();

        System.out.print("Fakultas: ");
        fakultas = keyboard.nextLine();

        System.out.print("NIM: ");
        nim = keyboard.nextLine();

     // menampilkan apa yang sudah di simpan di variabel
        System.out.println("===============================");
        System.out.println("Nama Siswa: "+ nama);
        System.out.println("Kelas: "+ kelas);
        System.out.println("Fakultas: "+ fakultas);
        System.out.println("Jurusan: "+ jurusan);
        System.out.println("NIM: "+ nim);
    }

}