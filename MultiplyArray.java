import java.io.*;
import java.util.*;

/**
 * MultiplyArray
 */
public class MultiplyArray 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        int array[]=new int[n];
        int sum=0,totalSumOfElement=0;
        HashSet<Integer> hs= new HashSet<Integer>();  
          

        //Input the element in an array
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }

        //Display the array element
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("\n\n\n");
        //Calculation
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++)
            {
                sum=array[i]*(array[i]*array[j]);
                totalSumOfElement+=sum;   
            }
            hs.add(totalSumOfElement);
        }

        System.out.println("\n"+hs);
    }
}