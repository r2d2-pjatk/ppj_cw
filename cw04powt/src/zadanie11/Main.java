package zadanie11;

public class Main {
    static void main() {
        /*
        Napisać program drukujący tabliczkę mnożenia dla liczb od 1 do n.
        Na przykład, jeśli n wynosi 12.
        Aby wypisać liczbę typu int, powiedzmy k, na czterech miejscach
        (wypełniając od lewej znakami odstępu brakujące cyfry)
        można użyć System.out.printf("%4d",k).
        */
        int n = 12;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf((j == n ? "%4d\n": "%4d"), i * j);
            }
        }
    }
}
