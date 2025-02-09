import java.util.Scanner;

public class Distancebetweentwopoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, y1, distance;
        double x2, y2;

        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.printf("%.4f\n", distance);

        input.close();
    }
}
