package selection;

import java.util.Scanner;

public class Snack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X, Y;
        double price = 0;

        X = input.nextInt(); // 3
        Y = input.nextInt(); // 2

        if (X == 1) {
            price = 4;
        } else if (X == 2) {
            price = 4.50;
        } else if (X == 3) {
            price = 5;
        } else if (X == 4) {
            price = 2;
        } else if (X == 5) {
            price = 1.50;
        }

        double total = price * Y; // 5 * 2 = 10
        System.out.printf("Total: R$ %.2f\n", total);

        input.close();
    }

}

// 3 2 $ 10 price * y = 5 * 2 = 10
// 4 3 $ 6 price * y = 2 * 3 = 6
// 2 3 $ 13.50 price * y = 4.50 * 3 = 13.5

// 1. input x dan y
// 2. cari price
// 3. hitung price * y
// 4. print hasilnya

// jika x sama dengan 1 price $...
// jika x sama dengan 2 price $...$
