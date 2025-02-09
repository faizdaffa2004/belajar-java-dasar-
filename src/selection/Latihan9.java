package selection;

import java.util.Scanner;

public class Latihan9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Masukan nama: ");
        String nama;
        nama = input.nextLine();
        System.out.printf("Masukan nilai: ");
        int nilai;
        nilai = input.nextInt();

        if (nilai >= 50) {
            System.out.printf("Selamat %s, anda lulus ", nama);
        } else if (nilai >= 45 && nilai < 50) {
            System.out.printf("maaf %s, anda remedital", nama);
        } else {
            System.out.printf("maaf %s, anda tidak lulus", nama);
        }

        input.close();

    }
}
