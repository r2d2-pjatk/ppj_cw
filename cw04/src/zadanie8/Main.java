package zadanie8;

public class Main {
    static void main() {
        int n = 70;
        int k = n ^ (1 << 5);
        // w przypadku operacji XOR pierwotne bity liczby n nie ulegają zmianie poza pozycją k
        
        System.out.println((char)n + " " + (char)k);
    }
}
