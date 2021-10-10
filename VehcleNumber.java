import java.util.Scanner;

public class VehcleNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String number=scanner.nextLine();

        if(number.matches("^[A-Z]{2}[-]|\\s?[0-9]{2}[-]|\\s?[A-Z]{2}[-]|\\s?[0-9]{4}$")){
            System.out.println("Number is valid!");
        }else{
            System.out.println("Number is invalid!");
        }
    }
}
