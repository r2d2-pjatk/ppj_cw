package zadanie_dodatkowe1;


public class Main {
    static void main() {
        int number = 456;
        
        int reversedNumber = ((number % 10) * 100) + ((number % 100) - (number % 10)) + ((number - (123 % 100))/100);
        IO.println(reversedNumber);
    }
}
