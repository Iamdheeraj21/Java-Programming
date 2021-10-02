import java.util.*;
public class Tcs2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []itemCode={101,102,103,104};
        int []itemPrice={40,50,60,70};
        int []itemQuantity={15,20,13,16};

        int code=scanner.nextInt();
        int quantity=scanner.nextInt();

        int total_amount=0;
        
        for (int i = 0; i < itemCode.length; i++) {
            int index=0;
            //1int itemPrice=0
            if(code==itemCode[i]){
                index=i;
                total_amount=quantity*itemPrice[index];
                itemQuantity[index]=itemQuantity[index]-quantity;
                System.out.println("Total amount of item = "+total_amount);
                for(int j=0;j<itemQuantity.length;j++)
                {
                    System.out.print(itemQuantity[j]+" , ");
                }
                break;
            }
            if(code==itemCode[i]){
                System.out.println("Invalid item code");
            }
        }
        scanner.close();
    }
}
