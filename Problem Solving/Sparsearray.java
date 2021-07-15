import java.util.Scanner;

public class Sparsearray 
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int strings=scanner.nextInt();
        String mString[]=new String[strings];
        for(int i=0;i<strings;i++)
        {
            mString[i]=scanner.next();
        }

        int queries=scanner.nextInt();
        int x=0;
        int result[]=new int[queries];

        for (int i = 0; i < queries; i++) {
            String qString=scanner.next();
            int count=0;
            for (int j = 0; j < strings; j++) {
                if(mString[j].equals(qString)){
                    count++;
                }
            }
            result[x++]=count;
        }

        for (int i = 0; i < queries; i++) {
           System.out.println(result[i]);
        }
        
    }    
}
