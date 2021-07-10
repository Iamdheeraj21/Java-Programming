import java.io.*;
import java.util.*;

public class BubbleSort
{
    public static void CalculateBubbleSort(int a[])
{
       int n = a.length;
       int counter = 0;

       for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n - 1; j++) 
             {
                if (a[j] > a[j + 1]) 
                  {

                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    counter++;
                  }
            }
        }

        System.out.println("Array is sorted in " + counter + " swaps.");

        System.out.println("First Element: " + a[0]);
    
        System.out.println("Last Element: " + a[n - 1]);

        return;
}
    
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        
        CalculateBubbleSort(a);
    }
}