import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int p, l, luas;

        System.out.println("Program Hitun Luas");
        System.out.print("masukan panjang: ");
        p = input.nextInt();
        System.out.print("masukan lebar: ");
        l = input.nextInt();
        luas = p * l;
        System.out.println("luas = " + luas);

    }
}
