package basic;

import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int code1, product1;
        int code2, product2;
        double price1, price2, Total;
        code1 = input.nextInt();
        product1 = input.nextInt();
        price1 = input.nextDouble();
        code2 = input.nextInt();
        product2 = input.nextInt();
        price2 = input.nextDouble();
        Total = product1 * price1 + product2 * price2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", Total);

        input.close();
    }
}
