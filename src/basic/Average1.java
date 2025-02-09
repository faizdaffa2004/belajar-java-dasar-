import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, MEDIA;
        a = input.nextDouble();
        b = input.nextDouble();
        MEDIA = (a * 3.5 + b * 7.5) / 11;
        System.out.printf("MEDIA = %.5f", MEDIA);

    }
}
