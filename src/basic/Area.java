package basic;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c;
        double luasSegita, luasLingkaran, luasTrapezium, luasPersegi, luasPersegiPanjang;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        luasSegita = 1.0 / 2 * a * c;
        System.out.printf("TRIANGULO: %.3f\n", luasSegita);
        luasLingkaran = 3.14159 * c * c;
        System.out.printf("CIRCULO: %.3f\n", luasLingkaran);
        luasTrapezium = (a + b) / 2 * c;
        System.out.printf("TRAPEZIO: %.3f\n", luasTrapezium);
        luasPersegi = b * b;
        System.out.printf("QUADRADO: %.3f\n", luasPersegi);
        luasPersegiPanjang = a * b;
        System.out.printf("RETANGULO: %.3f\n", luasPersegiPanjang);

        input.close();
    }
}
