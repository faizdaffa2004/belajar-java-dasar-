import java.util.Scanner;

public class AktivitasPagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aktivitas1, aktivitas2, aktivitas3;
        System.out.printf("Masukkan aktivitas pertama: ");
        aktivitas1 = input.nextLine();
        System.out.printf("Masukkan aktivitas kedua: ");
        aktivitas2 = input.nextLine();
        System.out.printf("Masukkan aktivitas ketiga: ");
        aktivitas3 = input.nextLine();

        System.out.printf("\n");
        // System.out.printf("Dafter aktivitas Anda:\n1. %s\n2. %s\n3. %s\n \n",
        // aktivitas1, aktivitas2, aktivitas3);
        System.out.printf("Dafter aktivitas Anda:\n");
        System.out.printf("1. %s\n", aktivitas1);
        System.out.printf("2. %s\n", aktivitas2);
        System.out.printf("3. %s\n", aktivitas3);

    }
}
