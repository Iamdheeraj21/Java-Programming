import java.util.Scanner;

public class Largestword {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String name[]=new String[n];
        String giveString=scanner.next();
        char[] giveStringArray=giveString.toCharArray();

        for(int a=0;a<n;a++){
            name[a]=scanner.next();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(name[i]+" , ");
        }

        for(int i=0;name.length<n;i++)
        {
            int size=name[i].length();
            int count=0;
            char[] nameString=name[i].toCharArray();
            for(int j=0;j<giveStringArray.length;j++)
            {
                for(int k=0;k<nameString.length;k++)
                {
                    if(giveStringArray[j]==nameString[k])
                    {
                        count=count+1;
                    }
                }
            }
            if(size==count)
            {
                System.out.println("\n"+name[i]+" is present in given string");
            }else{
                continue;
            }
        }
    }
}
