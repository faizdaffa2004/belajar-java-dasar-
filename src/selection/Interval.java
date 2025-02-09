package selection;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double X;
        X = input.nextDouble();

        if (X < 0 || X > 100) {
            System.out.printf("Fora de intervalo");
        } else if (X >= 0 && X <= 25) {
            System.out.printf("Intervalo [0,25]");
        } else if (X > 25 && X <= 50) {
            System.out.printf("Intervalo (25,50]");
        } else if (X > 50 && X <= 75) {
            System.out.printf("Intervalo (50,75]");
        } else if (X > 75 && X <= 100) {
            System.out.printf("Intervalo (75,100]");
        }
        input.close();
    }
}

// x > 5
// x > 7
// x > 8
// x > 20
// x > 0

// X > 7
// X >= 7

// ! && ||
// > >= < <= == !=

// 5 != 6 true
// 5 != 5 false

// 7 > 2 true
// 2 > 7 false

// 4 > 4 false
// 4 == 4 true

// 2 < 8 true
// 8 < 2 false
// 8 == 2 false

// >, <, ==

// 8 >= 2 true (8 > 2 atau 8 == 2)
// 2 >= 2 true (2 > 2 atau 2 == 2)

// 2 > 5 false
// 5 >= 1 true
// 5 == 1 false
// 6 < 1 false
// 6 > 1 true
// 5 >= 5 true
// 5 >= 1 true
// 5 >= 7 false
// 5 <= 1 false
// 5 < 9 true
// -9 > 3 false
// -9 >= -2 false
// -1 == 1 false
// -5 < -1 true
// -7 <= -9 false
// [0,25], (25,50], (50,75], (75,100]