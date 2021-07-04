import java.io.*;
import java.util.*;
class character
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner=new Scanner(System.in);
        String s;
        char searchString='a';
        int count=0;
        System.out.println("Enter the String :-");
        s=scanner.next();
        char arr[]=s.toCharArray();
        System.out.println("String in array:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }    

        for(int i=0;i<arr.length;i++)
        {
                if(arr[i]==searchString)
                {
                    count+=1;
                }
        }
        System.out.println("\n"+searchString+" is occurs in array "+count+" times");
    }
}
