import java.util.Scanner;

public class HitungPajak {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int harga, pajak, totalHarga;

        System.out.println("Program Hitung Harga ");
        System.out.print("masukan harga ");
        harga = input.nextInt();
        System.out.print("masukan pajak ");
        pajak = input.nextInt();
        totalHarga = harga + (harga * pajak / 100);
        System.out.println("totalHarga = " + totalHarga);

        input.close();

    }
}
