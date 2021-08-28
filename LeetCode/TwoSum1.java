import java.util.*;

class TwoSum1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How much element :-   ");
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter target:- ");
        int target=scanner.nextInt();
        int num1, num2;
        for (int i = 0; i < arr.length; i ++) {
            num1 = arr[i];
            for (int j = i + 1; j < arr.length; j ++) {
                num2 = arr[j];
                if (num1 + num2 == target)
                    System.out.println("Your answer :- "+i+" , "+j);
            }
        }
        scanner.close();
    }
}