import java.util.Scanner;
/**
 * Tcs1 Tcs company Coding round question 1
 */
public class Tcs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, b, c, d;
        n = sc.nextInt();
        if (n % 4 == 0) {
            a = n / 4;
            System.out.println(a + "\n" + a + "\n" + a + "\n" + a);
        } else if (n % 4 == 1) {
            a = n / 4;
            b = n - (a * 4);
            c = a + b;
            System.out.println(a + "\n" + a + "\n" + a + "\n" + c);
        } else if (n % 4 == 2) {
            a = n / 4;
            b = a;
            c = a + 1;
            d = a + 1;
            System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
        } else if (n % 4 == 3) {
            a = n / 4;
            b = a + 1;
            c = a + 1;
            d = a + 1;
            System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
        }
    }
}