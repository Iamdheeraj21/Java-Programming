import java.util.*;

class TwoSum2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] num=new int[n];

        for(int i=0;i<n;i++){
            num[i]=scan.nextInt();
        }
        int target=scan.nextInt();      
        
       System.out.println( twosum(num,target));
    }

    public static int[] twosum(int[] num, int target) {
        int a_pointer=0;
        int b_pointer=num.length-1;

        while(a_pointer<=b_pointer){
            int sum=num[a_pointer]+num[b_pointer];
        
            if(sum>target){
                b_pointer-=1;
            }else if(sum<target){
                a_pointer+=1;
            }else{
                return new int[] {a_pointer+1,b_pointer+1};
            }
        }
        return new int[]{a_pointer+1,b_pointer+1};
    }
}