package selection;

import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char nilai;

        System.out.printf("Masukkan karakter: ");
        nilai = input.nextLine().charAt(0);

        if (nilai == 'A') {
            System.out.printf("Anda sangat bagus!");
        } else if (nilai == 'B') {
            System.out.printf("Anda bagus!");
        } else if (nilai == 'C') {
            System.out.printf("Anda cukup baik");
        } else if (nilai == 'D') {
            System.out.printf("Anda perlu lebih banyak belajar");
        } else if (nilai == 'E') {
            System.out.printf("Anda perlu banyak belajar dan memperbaiki diri");
        }

        input.close();
    }
}
