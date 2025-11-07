package zadanie5;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        
        IO.println("Podaj trzy liczby naturalne: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        boolean isSumOfTwoGreaterThanThird = ((a + b) > c) && ((a + c) > b) && ((b + c) > a);
        
        if (isSumOfTwoGreaterThanThird)
            IO.println("OK");
        else
            IO.println("NOT OK");
        
        input.close();
    }
}
