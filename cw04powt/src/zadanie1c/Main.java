package zadanie1c;

public class Main {
    static void main() {
        /*
        Jaka jest najmniejsza i największa liczba,
        która w zapisie szesnastkowym jest trzycyfrowa?
        Zdefiniuj zmienną a typu int z tego zakresu
        i wypisz, od końca, jej kolejne cyfry w systemie szesnastkowym
        (każda cyfra w osobnej linii, cyfry powyżej 9 mogą być zapisane w systemie dziesiętnym).
        Wypisz też sumę tych cyfr.
        */
        
        // int min3DigitHexNum = 0x100; // 256
        // int max3DigitHexNum = 0xFFF; // 4095
        
        int a = 0x7e9;
        int numOfDigits = 3;
        int sumOfDigits = 0;
        int nextHexDigit;
        
        for (int i = 0; i < numOfDigits; i++) {
            nextHexDigit = a % 16;
            sumOfDigits += nextHexDigit;
            System.out.println(nextHexDigit);
            a /= 16;
        }
        
        // wypisanie sumy cyfr heksadecymalnych
        System.out.println("Suma cyfr heksadecymalnych: " + sumOfDigits);
    }
}
