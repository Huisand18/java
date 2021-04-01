package OOP;

import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        login.login2();
    }
}

class login {
    public static void login2() {
        String nohp;
        boolean cek;
        Scanner input = new Scanner(System.in);
        do{
            cek = false;
            System.out.print("Masukkan No HP: ");
            nohp = input.nextLine();
            if(nohp.length()<12){
                System.out.println("Nomor yang anda masukkan tidak sesuai ketentuan !");
                cek = true;
            }
            else if(nohp.length()>12){
                System.out.println("Nomor yang anda masukkan tidak sesuai ketentuan !");
                cek = true;
            }
        }while(cek);
        ceknomorhp ceknomorhpp = new ceknomorhp();
        ceknomorhpp.ceknomorhp2(nohp);
    }
}

class ceknomorhp {
    public void ceknomorhp2(String nohp) {
        char[] ch = nohp.toCharArray();
        int j=0;
        for(int i=0;i<12;i++){
            if(!(ch[i]>=48 && ch[i]<=57)){
                j++;
            }
        }
        if(j>0){
            System.out.println("Nomor HP yang dimasukkan salah!");
            login.login2();
        }
        else{
            daftarpulsa daftarpulsaa = new daftarpulsa();
            daftarpulsaa.daftarpulsa2();
        }
    }
}

class daftarpulsa {
    public void daftarpulsa2() {
        String[] pulsa = {"5000","10000","20000","15000","50000"};
        Scanner input = new Scanner(System.in);
        String pulsainput;
        System.out.println("\nDaftar Pulsa: ");
        for(int i=0;i<pulsa.length ;i++ ){
            System.out.printf("%d. %s \n",i+1,pulsa[i]);
        }
        System.out.print("Masukkan pulsa: ");
        pulsainput = input.nextLine();
        cekpulsa cekpulsaa = new cekpulsa();
        cekpulsaa.cekpulsa2(pulsainput);
    }
}

class cekpulsa{
    public void cekpulsa2(String pulsainput){
        int j=0;
        String[] pulsa = {"5000","10000","20000","15000","50000"};
        for(int i=0;i<5;i++){
            if(pulsainput.equals(pulsa[i])  ){
                j++;
            }
        }
        if(j>0){
            berhasil berhasill = new berhasil();
            berhasill.berhasil2();
        } else{
            System.out.println("Pulsa yang dipilih tidak ada!");
            login.login2();
        }
    }
}

class berhasil {
    public void berhasil2(){
        System.out.println("Selamat, transaksi berhasil!");
    }
}
