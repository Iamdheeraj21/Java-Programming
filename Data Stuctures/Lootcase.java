import java.util.Scanner;

/**
 * Lootcase
 */
public class Lootcase {

	public static int maxMoneyLooted(int[] houses) {
		//Your code goes here
        int first=0;
        int second=0;
        
        for(int i=0;i<houses.length;i++){
            if(houses[i]>=first){
                first=houses[i];
               for(int j=i+1;j<houses.length;j++){
                    if(houses[j]>second && houses[j]<first){
                    second=houses[i];
                }
                j++;
               }
               i++;
            }
        }
        System.out.println(first+","+second);
        int result=first+second;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] houses=new int[n];
        for (int i = 0; i <houses.length; i++) {
            houses[i]=scanner.nextInt();
        }
        System.out.println("Output :-"+maxMoneyLooted(houses));
    }
}