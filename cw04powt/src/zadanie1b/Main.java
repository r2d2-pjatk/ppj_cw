package zadanie1b;

public class Main {
    static void main() {
        /*
        Jaka jest najmniejsza i największa liczba,
        która w zapisie oktalnym jest czterocyfrowa?
        Zdefiniuj zmienną a typu int z tego zakresu
        i wypisz, od końca, jej kolejne cyfry w systemie oktalnym
        (każda cyfra w osobnej linii).
        Wypisz też sumę tych cyfr.
        */
        
        // int min4DigitOctNum = 01000; // 512
        // int max4DigitOctNum = 07777; // 4095
        
        int a = 05271;
        int numOfDigits = 4;
        int sumOfDigits = 0;
        int nextOctDigit;
        
        for (int i = 0; i < numOfDigits; i++) {
            // odczyt cyfry oktalnej za pomocą modulo, reszta z dzielenia przez 8 dla liczby dec
            nextOctDigit = a % 8;
            // dodanie cyfry oktalnej do sumy
            sumOfDigits += nextOctDigit;
            System.out.println(nextOctDigit);
            // dzielenie całkowite liczby dec umożliwia przejście do odczytu kolejnej cyfry
            a /= 8;
        }
        
        // wypisanie sumy cyfr oktalnych
        System.out.println("Suma cyfr oktalnych: " + sumOfDigits);
    }
}
