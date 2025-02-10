package repetition;

import java.util.Scanner;

public class Materi1 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.printf("hello\n");
            System.out.printf("hello world\n");
        }
        System.out.printf("Faiz\n\n");
        // i=0 0<5 true print hello print hello world
        // i=1 1<5 true print hello print hello world
        // i=2 2<5 true print hello print hello world
        // i=3 3<5 true print hello print hello world
        // i=4 4<5 true print hello print hello world
        // i=5 5<5 false

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // i=0 0<5 true print 0
        // i=1 1<5 true print 1
        // i=2 2<5 true print 2
        // i=3 3<5 true print 3
        // i=4 4<5 true print 4
        // i=5 5<5 false
        System.out.println();

        int n = 7;
        for (int i = 2; i < n; i++) {
            System.out.println(i);
        }
        // i=2 2<7 true print 2
        // i=3 3<7 true print 3
        // i=4 4<7 true print 4
        // i=5 5<7 true print 5
        // i=6 6<7 true print 6
        // i=7 7<7 false
        System.out.println();

        for (int i = 0; i <= 5; i++) {
            System.out.println(10);
        }
        // i=0 0<=5 true print 10
        // i=1 1<=5 true print 10
        // i=2 2<=5 true print 10
        // i=3 3<=5 true print 10
        // i=4 4<=5 true print 10
        // i=5 5<=5 true print 10
        // i=6 6<=5 false
        System.out.println();

        // total = 0+1+2+3+4 = 10
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total = total + i;
        }
        System.out.println("total = " + total);
        // i=0 0<5 true total = 0 + 0 = 0
        // i=1 1<5 true total = 0 + 1 = 1
        // i=2 2<5 true total = 1 + 2 = 3
        // i=3 3<5 true total = 3 + 3 = 6
        // i=4 4<5 true total = 6 + 4 = 10
        // i=5 5<5 false

        Scanner input = new Scanner(System.in);
        int x;
        total = 0;
        n = 5;
        for (int i = 0; i < n; i++) {
            x = input.nextInt();
            total = total + x;
        }
        System.out.printf("total = %d\n", total);
        System.out.printf("rata-rata = %f\n\n", (double) total / n);
        // i=0 0<5 true x=2 total = 0 + 2 = 2
        // i=1 1<5 true x=5 total = 2 + 5 = 7
        // i=2 2<5 true x=4 total = 7 + 4 = 11
        // i=3 3<5 true x=6 total = 11 + 6 = 17
        // i=4 4<5 true x=1 total = 17 + 1 = 18
        // i=5 5<5 false

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        input.close();
    }
}
