package repetition;

import java.util.Scanner;

public class Latihan2c {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Masukan n:");

        int a;
        a = input.nextInt();

        System.out.printf("Output: ");

        for (int i = 0; i < a; i++) {
            System.out.printf("%d ", i);

        }

        // i=0 0<7 true print 0
        // i=1 1<7 true print 1
        // i=2 2<7 true print 2
        // i=3 3<7 true print 3
        // i=4 4<7 true print 4
        // i=5 5<7 true print 5
        // i=6 6<7 true print 6
        // i=7 7<7 false
    }
}
