package zadanie1a;

public class Main {
    static void main() {
        /*
        Jaka jest najmniejsza i największa liczba,
        która w zapisie binarnym jest pięciocyfrowa?
        Zdefiniuj zmienną a typu int z tego zakresu
        i wypisz, od końca, jej kolejne cyfry w systemie binarnym
        (każda cyfra w osobnej linii).
        Wypisz też sumę tych cyfr.
        */
        
        // int min5DigitBinNum = 0b10000; // 16
        // int max5DigitBinNum = 0b11111; // 31
        
        int a = 0b11000; // 24
        int numOfDigits = 5;
        int sumOfDigits = 0;
        int nextBinDigit;
        
        for (int i = 0; i < numOfDigits; i++) {
            // odczyt bitu na pozycji 0 (od końca)
            nextBinDigit = a & 1;
            // dodanie cyfry binarnej do sumy
            sumOfDigits += nextBinDigit;
            // wypisanie odczytanej cyfry
            System.out.println(nextBinDigit);
            // przesunięcie bitu o pozycję w prawo do odczytu następnego bitu od końca
            a = a >> 1;
        }
        
        // wypisanie sumy bitów
        System.out.println("Suma cyfr (bitów): " + sumOfDigits);
    }
}
