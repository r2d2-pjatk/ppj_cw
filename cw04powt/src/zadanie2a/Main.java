package zadanie2a;

public class Main {
    static void main() {
        /*
        Mając liczbę n zdefiniuj liczbę k, której reprezentacja bitowa zawiera same zera,
        ale jej najmniej znaczący bajt jest taki sam jak drugi najmniej znaczący bajt n.
        Na przykład, jeśli n jest 1793, to k powinno mieć wartość 7 (dlaczego?).
        */
        
        int n = 1793; // 0b0000_0111_0000_0001
        // w wyniku przesunięcia bitowego usuwamy najmniej znaczący bajt
        // maska bitowa usuwa wszystkie starsze bajty pozostawiając tylko 8 najmłodszych bitów
        int k = (n >> 8) & 0b1111_1111;
        
        System.out.println("Dla liczby " + n + " wartość k wynosi " + k);
    }
}
