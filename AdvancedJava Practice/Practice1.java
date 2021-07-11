class Enum 
{
    public static void main(String[] args) {
        Color color=Color.RED;

        System.out.println("Red Enum Name :-"+color.name());
        System.out.println("Red Enum Value :-"+color.getString());

        for (Color color2:Color.values()) 
        {
            System.out.println("Enum Value :-"+color2.getString());    
        }
    }
}

enum Color
{
    RED("red"),GREEN("green"),BLUE("blue");
    
    private String value;

    Color(String valString){
        this.value=valString;
    }

    public String getString()
    {
        return value;
    }
}