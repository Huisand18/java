import java.util.Scanner;
class Main{
  public static void main(String[]args){
    Scanner key = new Scanner(System.in);
    double konv, liter;
    int galon;

    System.out.println(" Jumlah galon");
    galon = key.nextInt();
    
    konv = galon*3.785;
    liter = konv;

    System.out.println(" Konversi galon ke liter " + liter);
  }
}