package selection;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int a;

        System.out.printf("masukan angka pertama: ");
        x = input.nextInt();
        System.out.printf("masukan angka kedua: ");
        a = input.nextInt();

        if (x > 0) {
            System.out.printf("positif\n");
        }

        if (a < 0) {
            System.out.printf("negatif");
        }

        input.close();
    }
}
// masukan angka pertama: 5
// masukan angka kedua: -8
// positif

// cetak positif jika angka pertama positif
// cetak negatif jika angka kedua negatif
