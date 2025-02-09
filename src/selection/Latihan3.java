package selection;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;

        System.out.printf("masukan nilai: ");
        nilai = input.nextInt();

        if (nilai >= 70) {
            System.out.printf("selamat anda lulus\n");
        } else if (nilai >= 50) {
            System.out.printf("anda harus remedial");
        } else {
            System.out.printf("maaf anda belum lulus");
        }

        input.close();
    }
}