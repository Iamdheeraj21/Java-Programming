import java.util.Scanner;

public class Nonrepeating {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        for(int i=0;i<n;i++){
            int a;
            for (a = 0; a < n; a++) {
               if(i!=a && arr[i]==arr[a]){
                   break;
               }
            }
            if(a==n){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
