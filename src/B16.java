import java.util.Scanner;

//  SẮP XẾP ĐỔI CHỖ TRỰC TIẾP
public class B16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] > a[j])
                {
                    int k = a[j];
                    a[j] = a[i];
                    a[i] = k;
                }
            }
            System.out.printf("Buoc %d: ", i + 1);
            for (int j = 0; j < n; j++)
                System.out.printf("%d ", a[j]);
            System.out.println();
        }
    }
}
