import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, lembaran100, lembaran50, lembaran20, lembaran10;
        int lembaran5, lembaran2, lembaran1;
        int sisaUang;
        n = input.nextInt();
        lembaran100 = n / 100;
        sisaUang = n % 100;
        lembaran50 = sisaUang / 50;
        sisaUang = sisaUang % 50;
        lembaran20 = sisaUang / 20;
        sisaUang = sisaUang % 20;
        lembaran10 = sisaUang / 10;
        sisaUang = sisaUang % 10;
        lembaran5 = sisaUang / 5;
        sisaUang = sisaUang % 5;
        lembaran2 = sisaUang / 2;
        sisaUang = sisaUang % 2;
        lembaran1 = sisaUang;
        System.out.printf("%d\n", n);
        System.out.printf("%d nota(s) de R$ 100,00\n", lembaran100);
        System.out.printf("%d nota(s) de R$ 50,00\n", lembaran50);
        System.out.printf("%d nota(s) de R$ 20,00\n", lembaran20);
        System.out.printf("%d nota(s) de R$ 10,00\n", lembaran10);
        System.out.printf("%d nota(s) de R$ 5,00\n", lembaran5);
        System.out.printf("%d nota(s) de R$ 2,00\n", lembaran2);
        System.out.printf("%d nota(s) de R$ 1,00\n", lembaran1);

        input.close
    }
}
