package zadanie6;

public class Main {
    static void main() {
        /*
        Zdefiniuj dowolną liczbę typu int
        i za pomocą ANDowania dla kilku wartości k sprawdź,
        czy bit na pozycji k jest w tej liczbie 0 czy 1.
        */
        int num = 105; // 0b1101001
        
        int k = 0;
        int bitVal = (num & (1 << k)) >> k;
        IO.println("Dla liczby " + num + " bit w pozycji " + k + " ma wartość " + bitVal);
        
        k++;
        bitVal = (num & (1 << k)) >> k;
        IO.println("Dla liczby " + num + " bit w pozycji " + k + " ma wartość " + bitVal);
        
        k++;
        bitVal = (num & (1 << k)) >> k;
        IO.println("Dla liczby " + num + " bit w pozycji " + k + " ma wartość " + bitVal);
        
        k++;
        bitVal = (num & (1 << k)) >> k;
        IO.println("Dla liczby " + num + " bit w pozycji " + k + " ma wartość " + bitVal);
        
        k++;
        bitVal = (num & (1 << k)) >> k;
        IO.println("Dla liczby " + num + " bit w pozycji " + k + " ma wartość " + bitVal);
        
        k++;
        bitVal = (num & (1 << k)) >> k;
        IO.println("Dla liczby " + num + " bit w pozycji " + k + " ma wartość " + bitVal);
        
        k++;
        bitVal = (num & (1 << k)) >> k;
        IO.println("Dla liczby " + num + " bit w pozycji " + k + " ma wartość " + bitVal);
    }
}
