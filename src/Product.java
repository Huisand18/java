import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Product {
    Scanner in = new Scanner(System.in);
    int alls;

    int[] numbers = new int[100];
    String[] names = new String[100];
    int[] prices = new int[100];
    int[] stocks = new int[100];
    int[] values = new int[100];

    public Product() {

    }

    private void inputData() {
        try {
            for (int i = 0; i < alls; i++) {
                System.out.println("Product number -" + (i + 1));
                System.out.print("product name, press 0 to cancel : ");

                in.nextLine();
                numbers[i] = i + 1;
                names[i] = in.nextLine();

                if (names[i].equals("0")) {
                    break;
                }

                System.out.print("product price : ");
                prices[i] = in.nextInt();
                System.out.print("product stock : ");
                stocks[i] = in.nextInt();
                values[i] = stocks[i] * prices[i];
            }
        } catch (InputMismatchException e) {
            System.out.println("Input anda harus angka");
            in.nextLine();
            menu();
        }
    }

    public void menu() {
        do {
            System.out.print("input product number : ");
            alls = in.nextInt();

            if (alls <= 0) {
                System.out.println("Input lebih dari 0");
            } else {
                inputData();
            }
        } while (alls <= 0);
    }

    public void getDataValue() {
        for (int i = 0; i < alls; i++) {
            System.out.println("item number : " + numbers[i]);
            System.out.println("product names : " + names[i]);
            System.out.println("product price : " + prices[i]);
            System.out.println("product stock : " + stocks[i]);
            System.out.println("product value : " + values[i]);
        }
    }


}
