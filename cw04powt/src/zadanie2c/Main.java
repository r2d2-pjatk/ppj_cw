package zadanie2c;

public class Main {
    static void main() {
        /*
        Mając liczbę n zdefiniuj liczbę k,
        która ma reprezentację bitową taką jak n,
        ale ze wszystkimi bitami odwróconymi drugiego najmniej znaczącego bajtu.
        a przykład, jeśli n wynosi 65025, to wartość k powinna być 257.
        */
        
        
        // przykładowo dla n = 65025
        // n = 0b1111_1110_0000_0001
        // k = 0b0000_0001_0000_0001
        int n = 65025;
        // przesuwamy maskę bitową na pozycję 1 bajtu (2-ego najmniej znaczącego)
        // używamy operacji XOR, aby odwrócić wartości bitów na pozycji 1 bajtu i nie zmieniać bitów na bajcie 0
        int k = n ^ (0b1111_1111 << 8);
        
        System.out.println("Dla liczby " + n + " wartość k wynosi " + k);
    }
}
