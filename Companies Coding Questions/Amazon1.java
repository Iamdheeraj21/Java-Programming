import java.util.*;
class Amazon1
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] itemStrings={"MouseKey","Mous","Moniter","Mouses"};
        String searchString=scanner.nextLine();
    
        for(int i=0; i<itemStrings.length; i++){
            if(searchString.equals(itemStrings[i])){
                System.out.println("String found at index "+i);
                break;
            }
        }
    }
}