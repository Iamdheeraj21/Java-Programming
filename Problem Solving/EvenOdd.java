import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int col=scanner.nextInt();
        int even=0,odd=0;
       
    

        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=scanner.nextInt();
                if(arr[i][j]%2==0)
                    even++;
                else
                    odd++;
            }
        }

        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }

        System.out.println("Frequency of even numbers :- "+even);
        System.out.println("Frequency of odd numbers :- "+odd);
    }
}
