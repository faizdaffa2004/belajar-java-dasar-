import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valueX;
        double numberY, consumption;
        valueX = input.nextInt();
        numberY = input.nextDouble();

        consumption = valueX / numberY;
        System.out.printf("%.3f km/l\n", consumption);

        input.close();
    }
}
