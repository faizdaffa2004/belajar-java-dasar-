package selection;

import java.util.Scanner;

public class Latihan7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2, angka3;

        System.out.printf("masukn angka pertama: ");
        angka1 = input.nextInt();
        System.out.printf("masukan angka kedua: ");
        angka2 = input.nextInt();
        System.out.printf("masukan angka ketiga: ");
        angka3 = input.nextInt();

        if (angka1 > angka2 && angka1 > angka3) {
            System.out.printf("angka terbesar adalah: %d\n", angka1);
        } else if (angka2 > angka1 && angka2 > angka3) {
            System.out.printf("angka terbesar adalah: %d\n", angka2);
        } else if (angka3 > angka2 && angka3 > angka1) {
            System.out.printf("angka terbesar adalah: %d\n", angka3);
        }

        // angka1, angka2, dan angka3
        // 70, 5, 2

        // angka1 lebih dari angka2 dan angka1 lebih dari angka3

        // angka1 lebih dari angka2 dan angka3

    }
}
