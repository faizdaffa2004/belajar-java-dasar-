package basic;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, diferenca;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        diferenca = (a * b - c * d);
        System.out.printf("DIFERENCA = %d\n", diferenca);

        input.close();

    }
}
