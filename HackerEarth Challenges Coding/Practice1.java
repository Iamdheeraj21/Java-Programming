class MyException extends RuntimeException{}
public class Practice1 {
    public static void main(String[] args) throws Exception {
        throw new MyException();
        System.out.println("Hii");
    }
}

//Compilation error in line no. 9

