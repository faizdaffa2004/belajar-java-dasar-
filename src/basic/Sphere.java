package basic;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double volume, radius;
        radius = input.nextDouble();
        volume = (4.0 / 3) * 3.14159 * radius * radius * radius;
        System.out.printf("VOLUME = %.3f\n", volume);

        input.close();
    }
}
