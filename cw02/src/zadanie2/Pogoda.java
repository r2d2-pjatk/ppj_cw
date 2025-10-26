package zadanie2;

import java.util.Scanner;


public class Pogoda {
    void main() {
        String weatherStatus;
        Scanner input = new Scanner(System.in);
        
        IO.println("Jaka jest pogoda za oknem?");
        weatherStatus = input.nextLine();
        IO.println("Pogoda jest " + weatherStatus);
    }
}
