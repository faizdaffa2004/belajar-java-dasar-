import java.util.Scanner;

public class SalaryBouns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        double salary, totalValue, finalSalary;
        nama = input.nextLine();
        salary = input.nextDouble();
        totalValue = input.nextDouble();
        finalSalary = salary + totalValue * 0.15;
        System.out.printf("TOTAL = R$ %.2f\n", finalSalary);

        input.close();
    }
}
