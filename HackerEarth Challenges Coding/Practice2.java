class Message{
    public void printMessage(){
        System.out.println("Hii");
    }
}


public class Practice2 {
    public static void main(String[] args) {
        Message msg=new Message()
        {
            public void printMessage(){
                System.out.println("Hii2");
            }
        };
        msg.printMessage();
    }  
}

//Second printMessage function is calling by the compiler