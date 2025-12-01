package zadanie2;

import java.util.Arrays;

public class Main {
    static void main() {
        /*
        Zdefiniuj w programie dwuwymiarową,
        prostokątną tablicę intów, na przykład
            int[][] arr = {{1,3,2}, {3,4,8}, {2,6,8}, {1,8,5}};
        i oblicz indeks „wiersza”,
        dla którego suma elementów jest największa
        oraz indeks „kolumny”, dla której suma elementów jest największa
        (w powyższym przykładzie byłyby to indeksy 2 i 2).
        Oczywiście program powinien działać dla dowolnej dwuwymiarowej prostokątnej tablicy,
        niezależnie od jej wymiarów.
        */
        int[][] arr = {
            {1,3,2},
            {3,4,8},
            {2,6,8},
            {1,8,5}
        };
        
        // tablice przygotowane do przechowywania sum wierszy i kolumn
        int[] sumsOfRows = new int[arr.length];
        int[] sumsOfCols = new int[arr[0].length];
        
        // zliczanie sumy wszystkich wierszy
        for (int i = 0; i < arr.length; i++) {
            int sumOfRow = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sumOfRow += arr[i][j];
            }
            sumsOfRows[i] = sumOfRow;
        }
        
        // zliczanie sumy wszystkich kolumn
        int colIndex = 0;
        int numOfCols = sumsOfCols.length;
        while (colIndex < numOfCols) {
            int sumOfCol = 0;
            for (int i = 0; i < arr.length; i++) {
                sumOfCol += arr[i][colIndex];
            }
            sumsOfCols[colIndex++] = sumOfCol;
        }
        
        int highestSumOfRowIndex = 0;
        int highestSumOfColIndex = 0;
        
        // indeks wiersza z największą sumą
        for (int i = 1; i < sumsOfRows.length; i++) {
            if (sumsOfRows[highestSumOfRowIndex] < sumsOfRows[i])
                highestSumOfRowIndex = i;
        }
        
        // indeks kolumny z największą sumą
        for (int i = 1; i < sumsOfCols.length; i++) {
            if (sumsOfCols[highestSumOfColIndex] < sumsOfCols[i])
                highestSumOfColIndex = i;
        }
        
        System.out.println("Tablica prostokątna 2D:");
        for (int[] row: arr) {
            for (int val: row) {
                System.out.printf("%2d", val);
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Sumy wierszy: " + Arrays.toString(sumsOfRows));
        System.out.println("Indeks wiersza z największą sumą: " + highestSumOfRowIndex);
        System.out.println("Sumy kolumn:  " + Arrays.toString(sumsOfCols));
        System.out.println("Indeks kolumny z największą sumą: " + highestSumOfColIndex);
    }
}
