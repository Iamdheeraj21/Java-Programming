import java.util.Scanner;

public class Replace
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String firstName=scanner.next();
        String secondName=scanner.next();
        String thirdName=scanner.next();
        char[] nameArray=firstName.toCharArray();
        char[] secondArray=secondName.toCharArray();
        int x=firstName.length();
        int y=secondName.length();

        // First Name
        for(int i=0;i<x;i++)
        {
           if((nameArray[i]=='a') || (nameArray[i]=='e') || (nameArray[i]=='i') || (nameArray[i]=='o') || (nameArray[i]=='u') ||
           (nameArray[i]=='A') || (nameArray[i]=='E') || (nameArray[i]=='I') || (nameArray[i]=='O') || (nameArray[i]=='U')){
               nameArray[i]='#';
           }
        }

        // Second Name
        for(int i=0;i<y;i++)
        {
            if((secondArray[i]=='a') || (secondArray[i]=='e') || (secondArray[i]=='i') || (secondArray[i]=='o') || (secondArray[i]=='u') ||
            (secondArray[i]=='A') || (secondArray[i]=='E') || (secondArray[i]=='I') || (secondArray[i]=='O') || (secondArray[i]=='U')){
               continue;
           }else{
            secondArray[i]='%';
           }
        }

        for (int i = 0; i < nameArray.length; i++) {
            System.out.print(nameArray[i]);
        }
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]);
        }
        System.out.println(thirdName.toUpperCase());
    }
}