import java.util.Scanner;

public class PetternMatch 
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String textString=scanner.nextLine();
        String patternString=scanner.nextLine();

        boolean result=textString.contains(patternString);

        if(result)
            System.out.println("Match");
        else
            System.out.println("Not Match");

       /* Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(textString);
        boolean matchFound = matcher.find();
        if(matchFound) {
          System.out.println("Match found");
        } else {
          System.out.println("Match not found");
        }*/
    /*Scanner cScanner=new Scanner(System.in);
    String text="dheeraj";
    String pattern="ee";
    
    int count=0;

    int tLength=text.length();
    int pLength=pattern.length();

    char c,p;

    for(int i=0;i<=tLength-pLength;i++)
    {
        c=text.charAt(i);
        p=pattern.charAt(0);

        if(c == p)
        {
            for(int j=i,k=0;j<i+pLength;j++,k++)
            {
                c=text.charAt(j);
                p=pattern.charAt(k);

                if(c == p)
                    count++;
                
            }
        }
    }
    if(count==pLength){
        System.out.println("Pattern Found");
    }else{
        System.out.println("Not Found");
    }

    cScanner.close();*/
    }
}

