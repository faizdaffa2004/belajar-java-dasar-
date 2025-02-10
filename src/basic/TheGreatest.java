package basic;

import java.util.Scanner;

public class TheGreatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, greatest, MaiorAB;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        MaiorAB = (a + b + Math.abs(a - b)) / 2;
        greatest = (MaiorAB + c + Math.abs(MaiorAB - c)) / 2;
        System.out.printf("%d eh o maior\n", greatest);

        input.close();
    }
}
