package zadanie01;

public class Main {
    static void main() {
        /*
        Napisz program wczytujący trzy liczby całkowite (powiedzmy a, b i c),
        następnie je wypisuje na ekranie
        System.out.println(a + " " + b + " " + c);
        a następnie zmienia wartości tych trzech zmiennych tak, aby
        w a znalazła się najmniejsza z wczytanych liczb,
        w b — środkowa,
        a w c — największa.
        Wydrukuj znów
        System.out.println(a + " " + b + " " + c);
        i powinny to być te same trzy liczby,
        ale we wzrastającym porządku.
        Dowolne dwie (lub wszystkie trzy) liczby mogą być równe.
        Nie używaj tablic ani Stringów!
        */
        
        // zmienne z początkowymi wartościami
        int a = 34, b = 12, c = 19;
        
        System.out.println(a + " " + b + " " + c);
        
        // zmienne do tymczasowego przechowywania wartości
        int tempA = 0, tempB = 0, tempC = 0;
    
        if ((a >= b) && (a >= c)) {
            tempC = a;
        } else if (((a <= b) && (a >= c)) || ((a >= b) && (a <= c))) {
            tempB = a;
        } else if ((a <= b) && (a <= c)) {
            tempA = a;
        }
        
        if ((b >= a) && (b >= c)) {
            tempC = b;
        } else if (((b <= a) && (b >= c)) || ((b >= a) && (b <= c))) {
            tempB = b;
        } else if ((b <= a) && (b <= c)) {
            tempA = b;
        }
        
        if ((c >= a) && (c >= b)) {
            tempC = c;
        } else if (((c <= a) && (c >= b)) || ((c >= a) && (c <= b))) {
            tempB = c;
        } else if ((c <= a) && (c <= b)) {
            tempA = c;
        }
        
        a = tempA;
        b = tempB;
        c = tempC;
        
        System.out.println(a + " " + b + " " + c);
    }
}
