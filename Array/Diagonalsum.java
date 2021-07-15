import java.util.Scanner;
public class Diagonalsum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int r=scanner.nextInt();
        int c=scanner.nextInt();
        int diagonalSum=0;

        int arr[][]=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scanner.nextInt();
            }
        }

        System.out.println("\n"+"Print the array"+"\n");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }

        System.out.println("\n"+"----------------------- "+"\n");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    diagonalSum+=arr[i][j];
                }
            }
        }
        System.out.println("Diagonal Sum :-"+diagonalSum);
    }
}