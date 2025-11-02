package zadanie8;
import java.util.Scanner;


public class Main {
    static void main() {
        int year;
        
        Scanner input = new Scanner(System.in);
        IO.print("Wprowadź rok jako liczbę: ");
        year = input.nextInt();
        
        // operacje logiczne do sprawdzenia czy rok jest przestępny zapisane w zmiennych typu boolean
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        boolean isLeapYear = (isDivisibleBy4 && !isDivisibleBy100) || isDivisibleBy400;
        
        // wykorzystanie operatora wyboru do wygenerowania odpowiedzi
        String answer = isLeapYear ? "jest przestępny": "nie jest przestępny";
        
        IO.println("Rok " + year + " " + answer);
        
        input.close();
    }
}
