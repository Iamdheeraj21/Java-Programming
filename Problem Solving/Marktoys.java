import java.util.Arrays;
import java.util.Scanner;

public class Marktoys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int budget = scanner.nextInt();
        int arr[] = new int[n];
        int counter=0;

        //Input the element from user side
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

       /* //Sorting the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }*/
        Arrays.sort(arr);
        //Calculate the budget
        for(int i=0;i<arr.length;i++)
        {
            if(budget-arr[i]>0){
                budget-=arr[i];
                counter++;
            }else{
                break;
            }
        }

        System.out.println(counter);
    }
}
