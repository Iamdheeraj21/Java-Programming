import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        int sum=0,r,temp;

        for (int i = 0; i < n;i++) {
            arr[i]=scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        for (int i = 0; i < n; i++) {
            temp=arr[i];
            while(arr[i]>0)
            {
                r=arr[i]%10;
                sum=(sum*10)+r;
                arr[i]=arr[i]/10;
            }
            if(temp==sum){
                System.out.print("\n"+sum+"  is plaindrome"+"\n");
            }else{continue;}
        }
        scanner.close();
    }
}
