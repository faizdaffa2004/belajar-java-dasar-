package selection;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Y;
        Y = input.nextInt();

        if (Y == 1) {
            System.out.printf("Januray\n");
        } else if (Y == 2) {
            System.out.printf("February\n");
        } else if (Y == 3) {
            System.out.printf("March\n");
        } else if (Y == 4) {
            System.out.printf("April\n");
        } else if (Y == 5) {
            System.out.printf("May\n");
        } else if (Y == 6) {
            System.out.printf("June\n");
        } else if (Y == 7) {
            System.out.printf("July\n");
        } else if (Y == 8) {
            System.out.printf("August\n");
        } else if (Y == 9) {
            System.out.printf("September\n");
        } else if (Y == 10) {
            System.out.printf("October\n");
        } else if (Y == 11) {
            System.out.printf("November\n");
        } else if (Y == 12) {
            System.out.printf("December\n");
        }
        input.close();
    }
}
