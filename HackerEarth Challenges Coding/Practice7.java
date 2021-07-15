class A{
    public A(){}
    public A(int i){System.out.println(i);}
}

public class Practice7 {
    static A s1=new A(1);
    A a=new A(2);
    public static void main(String[] args) {
        Practice7 practice7=new Practice7();
        A a=new A(4);
    }
    static A s2=new A(4);
}

/* 
    output

    :- 1,4,2,4
    */