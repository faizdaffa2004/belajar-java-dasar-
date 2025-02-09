package selection;

import java.util.Scanner;

public class Latihan8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email;
        String password;

        System.out.printf("inputkan email: ");
        email = input.nextLine();
        System.out.printf("inputkan password: ");
        password = input.nextLine();

        if (email.equals("andromeda@gmail.com") && password.equals("rahasia")) {
            System.out.printf("login sukses");
        } else {
            System.out.printf("login gagal");
        }

        // budi@gmail.com

        input.close();
    }
}
