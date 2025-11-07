package zadanie6;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);
        boolean a, b, c;
        
        a = input.nextBoolean();
        b = input.nextBoolean();
        c = input.nextBoolean();
        
        boolean allThree = a && b && c;
        boolean exactlyOne = (a && !(b || c)) || (b && !(a || c)) || (c && !(a || b));
        boolean exactlyTwo = (!a && b && c) || (a && !b && c) || (a && b && !c);
        boolean atLeastOne = a || b || c;
        boolean atLeastTwo = (a && b) || (a && c) || (b && c);
        
        IO.println("a, b, c = " + a + ", " + b + ", " + c);
        IO.println("allThree:   " + allThree);
        IO.println("exactlyOne: " + exactlyOne);
        IO.println("exactlyTwo: " + exactlyTwo);
        IO.println("atLeastOne: " + atLeastOne);
        IO.println("atLeastTwo: " + atLeastTwo);
        
        input.close();
    }
}
