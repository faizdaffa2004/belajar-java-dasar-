import java.util.Scanner;

public class balikKarakter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char a, b, c, d;

        System.out.println("Program balik karakter ");
        System.out.println("Inputlkan 4 karakter ");
        a = input.next().charAt(0);
        b = input.next().charAt(0);
        c = input.next().charAt(0);
        d = input.next().charAt(0);
        System.out.print("Output : ");
        System.out.print(d + " ");
        System.out.print(c + " ");
        System.out.print(b + " ");
        System.out.print(a);

    }
}
