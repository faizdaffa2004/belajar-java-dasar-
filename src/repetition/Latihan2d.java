package repetition;

import java.util.Scanner;

public class Latihan2d {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Masukan start: ");

        int b;
        b = input.nextInt();

        System.out.printf("Masukan end: ");
        int c;
        c = input.nextInt();

        System.out.printf("output: ");

        for (int i = b; i <= c; i++) {
            System.out.printf("%d ", i);
        }
    }
}
