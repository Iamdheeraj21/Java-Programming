import java.util.Stack;

public class Learnstack {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("Dheeraj");
        stack.push("Dheera");
        stack.push("Dheer");
        stack.push("Dhee");
        stack.push("Dhe");

        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }   
}
