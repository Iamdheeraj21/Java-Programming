import java.io.*;
import java.util.*;

public class string1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int lengthA=A.length();
        int lengthB=B.length();
        
        int sum=lengthA+lengthB;
        System.out.println(sum);
        
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1)+" "+B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}

