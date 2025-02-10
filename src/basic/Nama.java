package basic;

import java.util.Scanner;

public class Nama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama;

        // System.out.println("Nama kamu siapa? ");
        // nama = input.nextLine();
        // System.out.println("Halo " + nama + ", nama saya faiz");

        System.out.printf("nama kamu siapa?\n");
        nama = input.nextLine();
        System.out.printf("Halo %s, nama saya faiz", nama);

        input.close();
    }
}
