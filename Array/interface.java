package Array;
import java.io.*;
import java.util.*;

interface Arithmetic{
    int divisor_sum(int n);
}

class MyCalculation implements Arithmetic
{
    int sum=0;
    @Override
    public int divisor_sum(int n) {
        // TODO
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}

class Solution extends MyCalculation
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        MyCalculation obj=new MyCalculation();
        System.out.println("I implemented : Arithmetic \n");
        System.out.print("\n"+obj.divisor_sum(n));    
    }
}