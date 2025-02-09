package selection;

public class If {
    public static void main(String[] args) {

        String password;
        password = "RAHASIA";

        if (password == "RAHASIA") {
            System.out.printf("Yeeahh!\n");
            System.out.printf("Password anda benar\n");

        }

        System.out.printf("baris ini selalu diesekusi\n");

        int x = 15;
        if (x > 10) {
            System.out.printf("x = %d lebih dari 10\n", x);

        }

        System.out.printf("baris ini selalu diekseluksi\n");

        String username = "andromeda951i";
        if (password == "RAHASIA" && username == "andromeda951i") {
            System.out.printf("Login Success!\n");
        }
    }
}

// Operator Perbandingan
// > 8 > 8
// >= 4 >= 8
// <
// <=
// == 7 == 1
// != 5 != 8

// Operator Boolean
// !
// &&
// ||

// NOT (!)
// !false = true
// !true = false

// !(5 > 3) = false
// !(4 == 7) = true

// AND
// true && true = true
// true && false = false
// false && true = false
// false && false = false

// ((5 > 7) && (3 < 2)) = false

// OR
// true || true = true
// true || false = true
// false || true = true
// false || false = false

// ((5 > 7) || (3 >= 3)) = false || true = true
