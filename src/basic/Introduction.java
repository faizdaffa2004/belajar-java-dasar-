package basic;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama;
        char kelas;
        int age;
        double weight;

        System.out.printf("Introduction Program\n");

        System.out.printf("what is your name: ");
        nama = input.nextLine();
        System.out.printf("what is your class: ");
        kelas = input.next().charAt(0);
        System.out.printf("your age: ");
        age = input.nextInt();
        System.out.printf("your weight: ");
        weight = input.nextDouble();
        System.out.printf("halo teman-teman, nama saya %s, kelas %c, umur saya %d tahun, berat saya %.2f kg", nama,
                kelas, age, weight);

        input.close();

    }
}
