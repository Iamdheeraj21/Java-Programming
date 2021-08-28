import java.util.Scanner;

public class Google1 
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        int givenBudget=scanner.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[i])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }   

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<n;i++)
        {
            int currSum=0;
            currSum=arr[i];
            for(int j=i+1;j<=n;j++)
            {
                if(currSum==givenBudget)
                {
                    int p=j-1;
                    System.out.println("\n Sum found between index "+i+" and "+p);
                }

                if(currSum>givenBudget || j== n){
                    break;
                }

                currSum=currSum+arr[j];
            }
        }
    }    
}
