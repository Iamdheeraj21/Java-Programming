class A
{
    void ab()
    {
        System.out.println("Hii Dheeraj");
    }

    @Deprecated
    void bc()
    {
        System.out.println("Hello");
    }
}

public class Annotation3 {
    public static void main(String[] args) {
        A ab=new A();
        ab.bc();
    }
}
