import java.io.*;
import java.util.*;
class grades 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n;
        ArrayList<Integer> arrayList=new ArrayList<>();

        n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("After calculating grades"+arr);
        System.out.print(arr);

        for(int marks:arr){
            if(marks < 38 || marks % 5 <= 2){
                arrayList.add(marks);
            }else if(marks % 5 > 2){
                int add = 5 -(marks % 5);
                arrayList.add(marks + add);
            }
        }
    
        System.out.println("After calculating grades"+arrayList);
    }    
}
