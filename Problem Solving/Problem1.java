import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];

        for(int i=0;i<n;i++){
            arr1[i]=scanner.nextInt();
            arr2[i]=arr1[i];
        }
        
        System.out.print("Array 1:---------------");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.print("\n"+"\nArray 2:---------------");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
