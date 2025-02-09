package selection;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;

        System.out.printf("masukan nilai: ");
        nilai = input.nextInt();

        if (nilai >= 70) {
            System.out.printf("selamat anda lulus");
        } else {
            System.out.printf("maaf anda tidak lulus");
        }
        input.close();
    }
}
