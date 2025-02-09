package selection;

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String A, B, C;
        A = input.nextLine();
        B = input.nextLine();
        C = input.nextLine();

        if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("onivoro")) {
            System.out.printf("homem\n");
        } else if (A.equals("vertebrado") && B.equals("ave") && C.equals("carnivoro")) {
            System.out.printf("aguia\n");
        } else if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("onivoro")) {
            System.out.printf("minhoca\n");
        } else if (A.equals("vertebrado") && B.equals("ave") && C.equals("onivoro")) {
            System.out.printf("pomba\n");
        } else if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("hematofago")) {
            System.out.printf("sanguessuga\n");
        } else if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("herbivoro")) {
            System.out.printf("vaca\n");
        } else if (A.equals("invertebrado") && B.equals("inseto") && C.equals("hematofago")) {
            System.out.printf("pulga\n");
        } else if (A.equals("invertebrado") && B.equals("inseto") && C.equals("herbivoro")) {
            System.out.printf("lagarta\n");
        }
        input.close();
    }
}