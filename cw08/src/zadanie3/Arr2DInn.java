package zadanie3;

import java.util.Arrays;

public class Arr2DInn {
    public static void main(String[] args) {
        /*
        Napisz statyczną metodę inner,
        która pobiera dwuwymiarową prostokątną (z założenia) tablicę intów
        (zakładamy, że ani liczba wierszy, ani kolumn nie jest mniejsza od trzech).
        Metoda zwraca nową, utworzoną wewnątrz metody, dwuwymiarową prostokątną tablicę,
        która zawiera „wnętrze” przekazanej tablicy,
        czyli bez pierwszego i ostatniego wiersza i bez pierwszej i ostatniej kolumny.
        Sama metoda niczego nie drukuje!
        */
        int[][] a = {
            {1, 2, 3, 4, 5, 6},
            {2, 3, 4, 5, 6, 7},
            {3, 4, 5, 6, 7, 8},
            {4, 5, 6, 7, 8, 9}
        };
        for (int[] r : a)
            System.out.println(Arrays.toString(r));
        System.out.println();
        for (int[] r : inner(a))
            System.out.println(Arrays.toString(r));
    }
    
    public static int[][] inner(int[][] arr) {
        int[][] newArr = new int[arr.length - 2][arr[0].length - 2];
        
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                newArr[i][j] = arr[i + 1][j + 1];
            }
        }
        
        return newArr;
    }
}
    


