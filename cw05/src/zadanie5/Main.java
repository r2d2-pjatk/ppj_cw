package zadanie5;

public class Main {
    static void main() {
        /*
        Zdefiniuj tablicę nieujemnych liczb całkowitych,
        a następnie wydrukuj „histogram” takich danych w układzie pionowym,
        czyli w kolejnych kolumnach po tyle gwiazdek ile wynosi wartość kolejnego elementu tablicy;
        kolumny wyrównane u dołu.
        Na przykład dla tablicy
            int[] arr = {1, 5, 8, 2, 6};
        */
        int[] arr = {1, 5, 8, 2, 6};
        char asterisk = '*';
        
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue)
                maxValue = arr[i];
        }
        
        for (int i = maxValue; i > 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (i <= arr[j]) {
                    System.out.print(asterisk);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
