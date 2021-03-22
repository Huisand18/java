package Terstruktur;

import java.util.Scanner;

public class Terstruktur {
    public static void main(String[] args) {
        int pilihan;
        double p = 3.14, hasil, r;
        String keputusan;

        Scanner pilih = new Scanner(System.in);
        Scanner lagi = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        for (keputusan = "y"; keputusan.equals("y") || keputusan.equals("Y"); ) {
            System.out.println("\n================= Hallo ================");
            System.out.print("\n| Masukkan Jari - Jari : ");
            r = input.nextDouble();

            System.out.println("\n============== Pilihan ============== ");
            System.out.println("| 1 = Menampilkan Hasil Keliling");
            System.out.println("| 2 = Menampilkan Hasil luas");
            System.out.print("\nIngin Menampilkan Hasil : ( keliling / luas ) ");
            pilihan = pilih.nextInt();

            if (pilihan == 1) {
                hasil = 2 * p * r;
                System.out.println("\nKeliling lingkaran : " +hasil);
                System.out.print("\nApakah Anda Ingin Menghitung Kembali ? (y/t) : ");
                keputusan = lagi.next();
            }else if (pilihan == 2){
                hasil = p * r * r;
                System.out.println("\nKeliling lingkaran : " +hasil);
                System.out.print("\nApakah Anda Ingin Menghitung Kembali ? (y/t) : ");
                keputusan = lagi.next();
            }else{
                System.out.println("\nTidak Ada Pilihan Tersebut !!!");
                break;
            }
        }
        System.out.println("Terima Kasih :)");
    }
}
