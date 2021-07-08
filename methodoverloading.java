import java.io.*;
import java.util.*;

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    
    void getNumberOfTeamMembers() 
    { 
        System.out.println("Each team has 11 players in " + this.getName());
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Sports c1 = new Sports();
    Soccer c2 = new Soccer();
    System.out.println(c1.getName());
    c1.getNumberOfTeamMembers();
    System.out.println(c2.getName());
    c2.getNumberOfTeamMembers();
    }
}
