import java.util.Scanner;

public class Quiz
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        String Quesion="What is your name?";
        String ans1="Dheeru";
        String ans2="Dhiraj";
        String ans3="D";
        String correctAns="Dheeraj Prajapat";
        
        System.out.println(Quesion);
        System.out.println("Select your answer \n"+ans1+"\n"+ans2+"\n"+ans3+"\n"+correctAns);
        int optionNumber=scanner.nextInt();
        if(optionNumber==4){
            System.out.println("Congratulations");
        }else{
            System.out.println("Incorrect Answer");
        }
    }    
}
