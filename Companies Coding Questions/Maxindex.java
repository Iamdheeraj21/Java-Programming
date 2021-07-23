import java.util.Scanner;

public class Maxindex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        int max=0,position=0;

        for(int i=0;i<n;i++){
           arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
           {
               max=arr[i];
               position=i;
           }
        }
        System.out.println(position);
    }
}
