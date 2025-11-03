package zadanie2;

public class ColorBytes {
    public static void main(String[] args) {
        // Cztery składowe koloru (każda w zakresie 0–255)
        int a = 23;   // alfa (przezroczystość)
        int r = 121;  // składowa czerwona
        int g = 255;  // składowa zielona
        int b = 130;  // składowa niebieska
        int color = 0; // tu zapiszemy wynik pakowania
        
        // PAKOWANIE
        // Każdy int ma 4 bajty (32 bity).
        // Kolejne bajty ustawiamy tak:
        // [ a ][ r ][ g ][ b ]
        // przesuwając odpowiednie wartości bitowo:
        color = (a << 24) |  // alfa w najbardziej znaczącym bajcie
                (r << 16) |  // red w drugim bajcie
                (g << 8)  |  // green w trzecim bajcie
                b;           // blue w najmniej znaczącym bajcie
        // Operator | (bitowe OR) łączy te bajty w jedną 32-bitową liczbę całkowitą.
        
        System.out.println("a, r, g, b = " + a + ", " + r + ", " + g + ", " + b);
        System.out.println("color = " + color);
        
        // Zerujemy zmienne, by pokazać, że później odzyskamy dane z 'color'
        a = r = g = b = 0;
        
        // ROZPAKOWYWANIE
        // Teraz z powrotem wyciągamy wartości z jednego inta.
        // Używamy przesunięć w prawo (>>) i maskowania & 0b1111_1111 0xFF,
        // by odciąć wszystkie pozostałe bity poza dolnym bajtem (8 bitów).
        a = (color >> 24) & 0b1111_1111; // przesuwamy 24 bity w prawo, bierzemy ostatnie 8 bitów
        r = (color >> 16) & 0b1111_1111; // przesuwamy 16 bitów w prawo
        g = (color >> 8)  & 0b1111_1111; // przesuwamy 8 bitów w prawo
        b = color & 0b1111_1111;         // najmniej znaczący bajt (nie trzeba przesuwać)
        
        System.out.println("a, r, g, b = " + a + ", " + r + ", " + g + ", " + b);
    }
}

