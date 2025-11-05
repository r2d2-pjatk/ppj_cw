package zadanie02;

public class Main {
    static void main() {
        /*
        Napisz program, który wczytuje trzy liczby, a, b i c,
        a następnie znajduje i drukuje środkową (co do wartości) z nich.
        Zmienne a, b i c nie powinny być modyfikowane.
        */
        
        int a = 32, b = 11, c = 25;
        int midNum = 0;
        
        if (((a >= b) && (a <= c)) || ((a <= b) && (a >= c))) {
            midNum = a;
        } else if (((b >= a) && (b <= c)) || ((b <= a) && (b >= c))) {
            midNum = b;
        } else if (((c >= a) && (c <= b)) || ((c <= a) && (c >= b))) {
            midNum = c;
        }
        
        IO.println("Wartość środkowa liczb (" + a + ", " + b + ", " + c + ") to " + midNum);
    }
}
