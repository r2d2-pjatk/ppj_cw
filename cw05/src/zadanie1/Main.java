package zadanie1;

public class Main {
    static void main() {
        /*
        Stwórz w funkcji main tablicę intów o dowolnym rozmiarze i zawartości.
        Program wypisuje następnie w jednej linii wszystkie elementy tablicy,
        ale każdą występującą w niej wartość tylko raz.
        Na przykład, dla tablicy
            int[] arr = {2, 5, 3, 2, 1, 3, 6, 5, 3};
        program powinien wypisać
            2 5 3 1 6
        Nie twórz żadnych dodatkowych tablic czy kolekcji. Tablica nie może być modyfikowana.
        */
        int[] arr = {2, 5, 3, 2, 1, 3, 6, 5, 3};
        boolean isUniqueElement = true;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isUniqueElement = false;
                    break;
                } else {
                    isUniqueElement = true;
                }
            }
            if (isUniqueElement)
                System.out.printf("%2d", arr[i]);
        }
    }
}
