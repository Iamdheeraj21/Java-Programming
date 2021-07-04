import java.util.Random;
import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the your amount");
        int amount=scanner.nextInt();

        System.out.println("Enter the your lucky number");
        int your_lucky_number=scanner.nextInt();

        Random random=new Random();
        int lucky_number=random.nextInt(100);

        System.out.println("Your bet amount:-");
        int bet_amount=scanner.nextInt();

        amount=amount-bet_amount;
        PlayGame(amount,lucky_number,bet_amount,your_lucky_number);
        System.out.println(your_lucky_number);
        
    }

    static void PlayGame(int amount,int lucky_number,int bet_amount,int your_lucky_number)
    {
        if(lucky_number==your_lucky_number){
            bet_amount=bet_amount*2;
            amount=amount+bet_amount;
            System.out.println("You are won");
            System.out.println("Now your amount is the: "+amount);
        }else{
            System.out.println("The lucky number is :"+ lucky_number);
            System.out.println("Your remaining balance:-"+amount);
            System.out.println("Try to next time!");
        }
    }
}
