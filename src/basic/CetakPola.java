import java.util.Scanner;

public class CetakPola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a;
        System.out.printf("Masukkan sebuah karakter: ");
        a = input.next();
        System.out.printf("\n");
        System.out.printf("Output\n");
        System.out.printf("%s\n", a);
        System.out.printf("%s %s\n", a, a);
        System.out.printf("%s %s %s", a, a, a);

        input.close();
    }
}
