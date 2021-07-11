import java.util.LinkedList;
import java.util.Queue;

public class Learnqueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(1);
        queue.offer(32);
        queue.offer(789);

        System.out.println(queue);

        queue.poll();

        System.out.println(queue);
        System.out.println(queue.peek());
    } 
}
