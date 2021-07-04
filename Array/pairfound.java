import java.io.*;
import java.util.*;

class pairfound
{
    public static void main(String[] args)
    {
        int n=4;
        int arr[]=new int[n];
        int sum=0;
        //ArrayList<Integer> pair=new ArrayList<Integer>();

        Scanner scanner=new Scanner(System.in);
        for(int a=0;a<n;a++)
        {
            arr[a]=scanner.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            sum=arr[i];
            for(int j=0;j<n;j++)
            {
                if(sum!=arr[j])
                {
                    sum+=arr[j];
                }
            }
        }
    }
}