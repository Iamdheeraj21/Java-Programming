import java.util.*;
class Reverseorder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (var i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}