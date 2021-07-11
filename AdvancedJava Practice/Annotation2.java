import java.util.ArrayList;

public class Annotation2 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<String> abs=new ArrayList<>();

        abs.add("Six Pack");
        abs.add("Eight Pack");
        abs.add("Ten Pack");

        for(Object object:abs){
            System.out.println(object);
        }
    }
}
