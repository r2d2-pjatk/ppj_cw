package zadanie_dodatkowe1;


public class Main {
    static void main() {
        /*
        Korzystając wyłącznie z operacji matematycznych, napisz program,
        który pobiera 3-cyfrową liczbę naturalną, niebędącą wielokrotnością 10,
        następnie wyprowadza na wyjściu liczbę składającą się z cyfr danej liczby w odwrotnej kolejności (np. 123 -> 321).
        Dane wejściowe podaj w inicjalizacji odpowiedniej zmiennej (typu int) w programie.
        Jako dodatkowe wyzwanie możesz spróbować przerobić program w taki sposób,
        żeby działał dla dowolnej ilości cyfr w liczbie :)
        */
        int number = 123;
        
        int hundredsDigit = number % 10;
        int tensDigit = ((number % 100) - hundredsDigit) / 10;
        int onesDigit = (number - tensDigit * 10 - hundredsDigit) / 100;
        
        int reversedNumber = hundredsDigit * 100 + tensDigit * 10 + onesDigit;
        IO.println(reversedNumber);
    }
}
