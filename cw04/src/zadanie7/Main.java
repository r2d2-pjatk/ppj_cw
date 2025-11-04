package zadanie7;

public class Main {
    static void main() {
        int n = -1;
        // maska zachowuje tylko najmłodszy bajt, ponieważ tylko 8 najmłodszych bitów daje 1 w operacji AND z liczbą n
        int k = n & 0b1111_1111;
        
        IO.println(k);
    }
}
