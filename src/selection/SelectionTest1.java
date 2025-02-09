package selection;

import java.util.Scanner;

public class SelectionTest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C, D;

        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) {
            System.out.printf("Valores aceitos\n");
        } else {
            System.out.printf("Valores nao aceitos\n");

        }
        input.close();
    }
}

// if
// if else
// if else if
// operator boolean && || !
// operator perbandingan > >= < <= != ==

// C > D
// 4 > -7

// C > 0

// ..., -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, ...