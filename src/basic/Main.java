package basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int b, c, PROD;
        b = input.nextInt();
        c = input.nextInt();
        PROD = b * c;
        System.out.printf("PROD = %d\n", PROD);

        input.close();
    }
}
