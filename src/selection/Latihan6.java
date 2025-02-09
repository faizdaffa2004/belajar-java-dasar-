package selection;

import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usia;

        System.out.printf("Masukan umur anda: ");
        usia = input.nextInt();

        if (usia <= 18) {
            System.out.printf("Remaja");
        } else if (usia >= 18 && usia <= 25) {
            System.out.printf("Dewasa Muda");
        } else if (usia >= 26 && usia <= 60) {
            System.out.printf("Dewasa");
        } else if (usia > 60) {
            System.out.printf("Lanjut Usia");
        }
        input.close();
    }
}
