package basic;

import java.util.Scanner;

public class Fuelspent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time, speed, distance;
        double fuel;
        time = input.nextInt();
        speed = input.nextInt();

        distance = time * speed;
        fuel = distance / 12.0;
        System.out.printf("%.3f\n", fuel);

        input.close();
    }
}
