import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();

        int first = -1, last = -1;
        

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            if (m != arr[i])
                continue;
            if (first == -1)
                first = i;
            last = i;
        }
        System.out.println(last+1);
    }
}