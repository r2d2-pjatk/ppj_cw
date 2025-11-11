package zadanie2b;

public class Main {
    static void main() {
        /*
        Mając dwie dodatnie liczby n i m,
        obie mniejsze od 256,
        zdefiniuj liczbę k, której drugi najmniej znaczący bajt jest taki sam jak najmniej znaczący bajt n,
        a bajt najmniej znaczący taki sam jak najmniej znaczący bajt m.
        Na przykład, jeśli n jest 3, a m jest 15, to k powinno być 783.
        */
        
        // przykładowo dla n = 3 i m = 15
        // n = 0b0000_0011, m = 0b0000_1111
        // k = 0b0000_0011_0000_1111
        int bitMask = 0b1111_1111;
        int n = 3, m = 15;
        // w pierwszej kolejności przypisujemy do k liczbę n na pozycji najmniej znaczącego bajta i usuwamy dalsze bajty
        // przesuwamy bajt odpowiadający liczbie n na kolejną pozycję (drugi najmniej znaczący bajt)
        // najmniej znaczący bajt liczby m przypisujemy do nzb k, dzięki operacji XOR, bez zmiany kolejnego bajta
        int k = ((n & bitMask) << 8) ^ (m & bitMask);
        
        System.out.println("Dla liczby n = " + n + " oraz m = " + m + " wartość k wynosi " + k);
    }
}
