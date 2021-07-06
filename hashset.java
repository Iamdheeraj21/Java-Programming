import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class hashset 
{
    public static void main(String[] args) {
       /* Scanner scanner=new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        String name;
        HashSet<String> hashSet=new HashSet<String>();

        for(int i=0;i<=n;i++)
        {
            name=scanner.nextLine();
            hashSet.add(name);
        }
        
        Iterator<String> i = hashSet.iterator();
        while(i.hasNext())
            System.out.print("\n"+i.next()+"\n");*/


            HashSet<String> easy = new HashSet<String>(); // hashset
        final Scanner sc = new Scanner(System.in); // scanner
        int n = sc.nextInt();
        sc.nextLine(); //Flush
        while(n-->0){
            easy.add(sc.nextLine());
            System.out.println(easy.size());
    }    
}}
