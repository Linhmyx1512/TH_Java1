import java.util.Scanner;

//CHỮ SỐ 4 VÀ CHỮ SỐ 7
public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int d = 0;
        for (int i = 0; i < n; i++)
            if (s.charAt(i) == '4' || s.charAt(i) == '7')
                d++;
        if (d == 4 || d == 7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
