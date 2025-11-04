package zadanie5;

public class Main {
    static void main() {
        /*
        Jak utworzyć liczbę typu int tak, żeby w jej reprezentacji bitowej była jedynka na pozycji k
        (pozycje liczymy od zera dla najmniej znaczącego bitu) a na pozostałych pozycjach zera.
        Utwórz taką liczbę dla kilku wartości k i ją wydrukuj.
        */
        
        int k = 5;
        int num = 1 << k;
        IO.println(num);
        
        k = 6;
        num = 1 << k;
        IO.println(num);
        
        k = 8;
        num = 1 << k;
        IO.println(num);
        // liczba k jest wykładnikiem liczby 2, a liczba num jest to 2 do potęgi k
    }
}
