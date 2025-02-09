import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, MEDIA;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        MEDIA = (a * 2 + b * 3 + c * 5) / 10;
        System.out.printf("MEDIA = %.1f\n", MEDIA);

    }
}
