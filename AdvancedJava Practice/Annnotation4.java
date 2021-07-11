import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface myAnnotation
{
    int value();
}

class Hello
{
    @myAnnotation(value = 10)
    public void sayHello()
    {
        System.out.println("hello annotation");
    }
}


public class Annnotation4 {
    public static void main(String[] args) throws Exception {
        Hello hello=new Hello();
        Method method=hello.getClass().getMethod("sayHello");

        myAnnotation myAnnotation=method.getAnnotation(myAnnotation.class);
        System.out.println("value is:"+myAnnotation.value());
    }
}
