import java.util.Scanner;

public class TukarNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.println("Program Tukar A dan B ");
        System.out.print("Masukan nilai A ");
        a = input.nextInt();
        System.out.print("masukan nilai B ");
        b = input.nextInt();
        System.out.println("Nilai setelah ditukar adalah ");
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        input.close();
    }
}
