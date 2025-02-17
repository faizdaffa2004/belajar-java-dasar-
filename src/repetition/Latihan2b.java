package repetition;

public class Latihan2b {
    public static void main(String[] args) {

        for (int i = 3; i <= 8; i++) {
            System.out.printf("%d\n", i);
        }
        // i=3 3<=8 true print 3
        // i=4 4<=8 true print 4
        // i=5 5<=8 true print 5
        // i=6 6<=8 true print 6
        // i=7 7<=8 true print 7
        // i=8 8<=8 true print 8
        // i=9 9<=8 false

        // versi 2
        for (int i = 3; i < 9; i++) {
            System.out.printf("%d\n", i);
        }
        // i=3 3<9 true print 3
        // i=4 4<9 true print 4
        // i=5 5<9 true print 5
        // i=6 6<9 true print 6
        // i=7 7<9 true print 7
        // i=8 8<9 true print 8
        // i=9 9<9 false
    }
}
