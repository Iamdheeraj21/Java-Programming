import java.util.Scanner;

public class string3 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest =s.substring(0,k);
        String largest = s.substring(0,k);
        
         // Complete the function
        int i=0;
        int j;
        while(i+k<=s.length())
        {
            if(s.substring(i,i+k).compareTo(smallest) < 0 )
            smallest = s.substring(i,i+k);
            else if(s.substring(i,i+k).compareTo(largest) > 0)
            largest = s.substring(i,i+k);
            i++;
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
