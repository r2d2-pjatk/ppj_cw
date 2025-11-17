package zadanie8;

public class Main {
    static void main() {
        /*
        Przygotuj tablicę A o losowym rozmiarze n z przedziału [1,20),
        dalej wypełnij tablicę losowymi wartościami całkowitymi
        tak, aby tablica była posortowana rosnąco.
        Wyświetl indeks i ze zbioru {1, . . . , n}
        taki, że A[i] = i, albo stwierdź, że nie ma takiego indeksu.
        */
        int n = 10;
        int[] a = new int[n];
        
        // wypełnianie losowymi wartościami
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 19 + 1);
        }
        
        // sortowanie tablicy rosnąco/niemalejąco (selection sort)
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            
            int tmp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = tmp;
        }
        
        for (int el: a) {
            System.out.print(el + "\t");
        }
    }
}
