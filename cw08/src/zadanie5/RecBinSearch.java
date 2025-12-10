package zadanie5;

public class RecBinSearch {
    public static void main (String[] args) {
        int[] a = {1, 4, 5, 7, 9, 10};
        for (int i = a[0]; i <= a[a.length - 1]; ++i)
            System.out.printf("what=%2d ind=%2d%n",
                    i, binSearchRec(a, i, 0, a.length));
        System.out.println("**************");
        int[] b = {-1, 1, 3, 4, 6};
        for (int i = b[0]; i <= b[b.length - 1]; ++i)
            System.out.printf("what=%2d ind=%2d%n",
                    i, binSearchRec(b, i, 0, b.length));
    }
    
    public static int binSearchRec(int[] a, int what, int from, int to) {
        // Krok 1: Warunek bazowy (elementu nie ma w tablicy)
        if (from > to) {
            return -1;
        }
        
        // Krok 2: Obliczenie środkowego indeksu
        // Użycie tej formy zapobiega potencjalnemu przepełnieniu dla dużych liczb
        int mid = from + (to - from) / 2;
        
        // Krok 3: Sprawdzenie środkowego elementu (Warunek 1: Znaleziono)
        if (a[mid] == what) {
            return mid;
        }
        // Krok 4: Wywołanie rekurencyjne
        // Warunek 2: Wartość jest mniejsza -> szukaj w lewej połowie
        else if (a[mid] > what) {
            return binSearchRec(a, what, from, mid - 1);
        }
        // Warunek 3: Wartość jest większa -> szukaj w prawej połowie
        else { // a[mid] < what
            return binSearchRec(a, what, mid + 1, to);
        }
    }
}
