package basic;

import java.util.Scanner;

public class ProgramBiodata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int umur;
        double tinggi;
        boolean menikah;
        String gender;
        char golonganDarah;

        System.out.printf("Program Biodata\n");
        System.out.printf("nama: ");
        nama = input.nextLine();
        System.out.printf("umur: ");
        umur = input.nextInt();
        System.out.printf("tinggi: ");
        tinggi = input.nextDouble();
        System.out.printf("menikah: ");
        menikah = input.nextBoolean();
        input.nextLine();
        System.out.printf("gender: ");
        gender = input.nextLine();
        System.out.printf("golongan darah: ");
        golonganDarah = input.nextLine().charAt(0);
        System.out.printf("\n");
        System.out.printf("Output\n");
        System.out.printf("nama saya %s, gender %s, umur saya %d, tinggi saya %.2f\n", nama, gender, umur, tinggi);
        System.out.printf("menikah: %b\n", menikah);
        System.out.printf("golongan Darah: %c", golonganDarah);

        input.close();
    }
}
