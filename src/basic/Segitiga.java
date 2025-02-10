package basic;

import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, t;
        double luasSegitiga;

        System.out.printf("Program Hitung Luas Segitiga: \n");
        System.out.printf("masukan alas: ");
        a = input.nextInt();
        System.out.printf("masukan tinggi: ");
        t = input.nextInt();
        luasSegitiga = 1.0 / 2.0 * a * t;
        System.out.printf("luasSegitiga = %f", luasSegitiga);

        input.close();
    }
}
