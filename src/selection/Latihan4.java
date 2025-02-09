package selection;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.printf("masukan angka: ");
        angka = input.nextInt();

        if (angka > 0) {
            System.out.printf("positif");
        } else if (angka < 0) {
            System.out.printf("negatif");
        } else {
            System.out.printf("nol");
        }
        input.close();
    }
}
