import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class ArrayList
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner=new Scanner(System.in);
        int n;
        int d,q,x,y;
        n=scanner.nextInt();
        ArrayList[] set=new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            d=scanner.nextInt();
            set[i]=new ArrayList();
            for(int j=0;j<d;j++)
            {
                set[i].add(scanner.nextInt());
            }
        }
        q=scanner.nextInt();
        for(int i=0;i<q;i++)
        {
            x=scanner.nextInt();
            y=scanner.nextInt();
            try{
                System.out.print(set[x-1].get(y-1));
            }catch(Exception e){
                System.out.print("ERROR!");
            }
        }
    }
}
