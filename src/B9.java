import java.util.Scanner;
import java.util.Vector;

//đảo từ
public class B9 {
    public static void DevideString(String s, Vector<String> a) {
        StringBuilder x = new StringBuilder();
        s += " ";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!x.toString().equals("")) {
                    a.add(x.toString());
                    x = new StringBuilder();
                }
            } else {
                x.append(s.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            Vector<String> a = new Vector<>();
            DevideString(s, a);
            for (String value : a) {
                s = value;
                StringBuilder x = new StringBuilder(s);
                System.out.print(x.reverse() + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
