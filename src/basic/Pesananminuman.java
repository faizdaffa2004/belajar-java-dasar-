import java.util.Scanner;

public class Pesananminuman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, minuman;
        System.out.printf("Pilihan minuman: Kopi, Teh, Jus\n");
        System.out.printf("Masukan pilihan Anda: ");
        minuman = input.nextLine();
        System.out.printf("Masukaan nama Anda: ");
        nama = input.nextLine();
        System.out.printf("\n");

        System.out.printf("Pesanan berhasil dibuat!\n");
        System.out.printf("%s memesan %s", nama, minuman);

        input.close();
    }
}
