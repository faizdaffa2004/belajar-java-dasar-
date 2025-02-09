import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, hours;
        double amount, salary;
        number = input.nextInt();
        hours = input.nextInt();
        amount = input.nextDouble();
        salary = amount * hours;
        System.out.printf("NUMBER = %d\n", number);
        System.out.printf("SALARY = U$ %.2f\n", salary);

        input.close();
    }
}
