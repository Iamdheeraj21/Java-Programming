import java.util.Scanner;

public class example 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int flag=1;
        int n=scanner.nextInt();
        for(int i=0;i<=n;i++){
            if(flag==1){
                System.out.println("Yes");
                flag--;
            }else{
                System.out.println("No");
            }
        }
    }    
}
