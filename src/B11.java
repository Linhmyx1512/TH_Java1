// phân số


import java.util.Scanner;

class Fraction {
    long numerator;
    long denominator;
    static Scanner sc = new Scanner(System.in);

    void Input() {
        numerator = sc.nextLong();
        denominator = sc.nextLong();
    }

    void Output() {
        System.out.printf("%d/%d", numerator, denominator);
    }

    void Compact() {
        long a = numerator;
        long b = denominator;
        while (a != 0) {
            long x = a;
            a = b % a;
            b = x;
        }
        numerator /= b;
        denominator /= b;
    }
}

public class B11 {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        a.Input();
        a.Compact();
        a.Output();
    }
}
