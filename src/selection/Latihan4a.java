package selection;

import java.util.Scanner;

public class Latihan4a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.printf("masukan angka: ");
        angka = input.nextInt();

        if (angka % 2 == 1 && angka > 0) {
            System.out.printf("ganji positif");
        } else if (angka % 2 == 0 && angka > 0) {
            System.out.printf("genap positif");
        } else if (angka % 2 == -1 && angka < 0) {
            System.out.printf("ganjil negatif");
        } else if (angka % 2 == 0 && angka < 0) {
            System.out.printf("genap negatif");
        }

        input.close();
    }
}
