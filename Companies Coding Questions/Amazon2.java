import java.util.*;
public class Amazon2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array1=new int[n];
        int[] array2=new int[n];

        for(int i=0;i<n;i++){
            array1[i]=scanner.nextInt();
            array2[i]=scanner.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Array 2:- "+array2[i]);
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Array 1:-"+array1[i]);
        }
    }
}
