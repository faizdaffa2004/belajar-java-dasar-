package selection;

import java.util.Scanner;

public class DDD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X;
        X = input.nextInt();

        if (X == 61) {
            System.out.printf("Brasilia\n");
        } else if (X == 71) {
            System.out.printf("Salvador\n");
        } else if (X == 11) {
            System.out.printf("Sao Paulo\n");
        } else if (X == 21) {
            System.out.printf("Rio de Janeiro\n");
        } else if (X == 32) {
            System.out.printf("Juiz de Fora\n");
        } else if (X == 19) {
            System.out.printf("Campinas\n");
        } else if (X == 27) {
            System.out.printf("Vitoria\n");
        } else if (X == 31) {
            System.out.printf("Belo Horizonte\n");
        } else {
            System.out.printf("DDD nao cadastrado\n");
        }

        input.close();
    }

}

//