package zadanie3;

public class Main {
    static void main() {
        /*
        Napisz program, który daną tablicę intów „rotuje” o n pozycji w lewo,
        to znaczy pierwszy element jest zastępowany (n + 1)-szym, drugi (n + 2)-gim itd.,
        natomiast n pierwszych elementów znajduje się na końcu.
        Na przykład tablica
            1 2 3 4 5
        po rotacji w lewo o trzy pozycje powinna mieć postać:
            4 5 1 2 3
        Rozwiąż to trzema sposobami:
        • stosując (w pętli) n razy rotowanie o jedną pozycję (patrz zad.2);
        • tworząc jedną dodatkową tablicę i kopiując elementy tablic w pętlach;
        • tworząc jedną dodatkową tablicę i wykorzystując funkcję System::arraycopy (bez żadnych jawnych pętli).
        Uwaga: Funkcja arraycopy
            System.arraycopy(sArr, sIndex, tArr, tIndex, count)
        kopiuje count elementów tablicy sArr
        poczynając od elementu o indeksie sIndex do tablicy tArr na pozycje od indeksu tIndex.
        */
        
        // 1 sposób - pętla
        {
            int[] arr = {1, 2, 3, 4, 5};
            int n = 3;
            
            n = n % arr.length;
            
            for (int r = 0; r < n; r++) {       // powtórz n razy rotację o 1 w lewo
                int first = arr[0];
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = first;
            }
            
            for (int element: arr) {
                System.out.printf("%2d", element);
            }
        }
        
        System.out.println();
        // 2 sposób - dodatkowa tablica
        {
            int[] arr = {1, 2, 3, 4, 5};
            int[] newArr = new int[arr.length];
            int n = 3;
            
            n = n % arr.length;
            
            // najpierw kopiujemy ogon od n do końca na początek newArr
            for (int i = 0; i < arr.length - n; i++) {
                newArr[i] = arr[i + n];
            }
            
            // potem kopiujemy pierwsze n elementów na koniec newArr
            for (int i = 0; i < n; i++) {
                newArr[arr.length - n + i] = arr[i];
            }
            
            for (int element: newArr) {
                System.out.printf("%2d", element);
            }
        }
        
        System.out.println();
        // 3 sposób - metoda arraycopy
        {
            int[] arr = {1, 2, 3, 4, 5};
            int[] newArr = new int[arr.length];
            int n = 3;
            
            n = n % arr.length;
            
            // kopiujemy ogon: od n do końca, na początek newArr
            System.arraycopy(arr, n, newArr, 0, arr.length - n);
            
            // kopiujemy początek: od 0 do n-1, na koniec newArr
            System.arraycopy(arr, 0, newArr, arr.length - n, n);
            
            
            for (int element: newArr) {
                System.out.printf("%2d", element);
            }
        }
        
    }
}
