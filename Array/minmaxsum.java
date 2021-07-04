import java.io.*;
import java.util.*;

class minmaxsum
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        n=scan.nextInt();
        int arr[]=new int[n];
        long min=0,max=0,sum=0;
        min=arr[0];
        max=min;
        sum=min;

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }

        for(int j=1;j<arr.length;j++)
        {
            sum+=arr[j];
            if(arr[j]<min)
            {
                min=arr[j];
            }
            if(arr[j]>max)
            {
                max=arr[j];
            }
        }
        System.out.println((sum-max)+" "+(sum-min));
    }
}