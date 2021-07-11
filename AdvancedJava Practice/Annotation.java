
class Class1
{
    void eatSomething()
    {
        System.out.println("eating something");
    } 
}

class Class2 extends Class1
{
    //@Override
    void eatSomething()
    {
        System.out.println("eating something");
    } 
}





public class Annotation {
    public static void main(String[] args) {
        Class1 c=new Class2();

        c.eatSomething();
    }
}
