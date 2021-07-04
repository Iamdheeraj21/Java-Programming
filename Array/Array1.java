import java.io.*;
import java.util.*;

class Array1
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        int sum=0,max=0,min=10;

        //Take the element for input by user
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }    

        // Print the all array elements
        for(int j=0;j<n;j++)
        {
            System.out.println("\nElement "+array[j]+"at position "+j);
        }

        //Sum of the digits 
        for(int k=0;k<n;k++)
        {
            sum+=array[k];
        }
        System.out.println("Sum of all digits:- "+sum);

        //Find the max into array
        for(int i=0;i<n;i++)
        {
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("\nMaximum number into array :-"+max);
        System.out.println("\nMinimum number into array :-"+min);
    }
}