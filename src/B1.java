import java.util.Scanner;

public class B1 {


    public static boolean checkFibonacci(long n) {
        long a = 0, b = 1, c = 0;
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (checkFibonacci(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}