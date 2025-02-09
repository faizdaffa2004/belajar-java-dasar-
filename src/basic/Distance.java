import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distanceY, mint;
        distanceY = input.nextInt();
        mint = distanceY * 2;
        System.out.printf("%d minutos\n", mint);

        input.close();

    }
}