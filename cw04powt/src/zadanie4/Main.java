package zadanie4;

import java.util.Scanner;


public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        
        IO.println("Podaj trzy liczby naturalne: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        boolean areTwoOfThreeEqual = ((a == b) & (a != c)) || ((a == c) & (a != b)) || ((b == c) & (b != a));
        
        if (areTwoOfThreeEqual)
            IO.println("OK");
        else
            IO.println("NOT OK");
        
        input.close();
    }
}
