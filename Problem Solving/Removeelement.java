import java.util.Scanner;

public class Removeelement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        int element=0;
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }   

        int index=scanner.nextInt();
        if(index<0 || arr==null){
            System.out.println("No removed");
        }
      
        for(int i=0,k=0;i<arr.length;i++){
            if(i==index){
                element=arr[i];
                continue;
            }else{
                arr1[k++]=arr[i];
            }
        }
        int insertIndex=0;
        int arr3[]=new int[arr1.length];
        int j=0;

        for(int a=0;a<arr3.length;a++){
            if(a==insertIndex){
                arr3[a]=element;
            }else{
                arr3[a]=arr1[j];
                j++;
            }
        }
        for(int a=0;a<arr3.length;a++){
            System.out.print(arr3[a]+" ");
        }
    }
}
