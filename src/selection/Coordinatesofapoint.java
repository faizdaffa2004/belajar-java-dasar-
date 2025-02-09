package selection;

import java.util.Scanner;

public class Coordinatesofapoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double X, Y;

        X = input.nextDouble();
        Y = input.nextDouble();

        if (X > 0 && Y > 0) {
            System.out.printf("Q1\n");
        } else if (X < 0 && Y > 0) {
            System.out.printf("Q2\n");
        } else if (X < 0 && Y < 0) {
            System.out.printf("Q3\n");
        } else if (X > 0 && Y < 0) {
            System.out.printf("Q4\n");
        } else if (X == 0 && Y == 0) {
            System.out.printf("Origem\n");
        } else if (X == 0) {
            System.out.printf("Eixo Y\n");
        } else if (Y == 0) {
            System.out.printf("Eixo X\n");
        }
        input.close();
    }

}
