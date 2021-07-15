
class Second
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        int array[]=new int[n];
        int max=0,sMax=0;

        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("First Maximum Element :- "+max);
        for(int i=0;i<n;i++){
            if(array[i]>sMax && array[i]<max){
                sMax=array[i];
            }
        }
        System.out.println("Second Maximum Element :- "+sMax);
        
    }
}