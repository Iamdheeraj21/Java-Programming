import java.io.*;
import java.util.*;

public class Findoccurence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (arr[i] != 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == num) {
                        count += 1;
                        arr[j] = 0;
                        break;
                    }
                }
            }
        }

        System.out.print(count);
    }
}
