package repetition;

public class Latihan1a {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.printf("hello world\n");
        }
        // i=0 0<10 true print hello world
        // i=1 1<10 true print hello world
        // i=2 2<10 true print hello world
        // i=3 3<10 true print hello world
        // ...
        // i=9 9<10 true print hello world
        // i=10 10<10 false

        // Versi 2

        for (int i = 1; i <= 10; i++) {
            System.out.printf("hello world\n");
        }
        // i=1 1<10 true print hello world
        // i=2 2<10 true print hello world
        // i=3 3<10 true print hello world
        // ...
        // i=9 9<10 true print hello world
        // i=10 10<10 true print hello world
        // i=11 11<10 false
    }
}
