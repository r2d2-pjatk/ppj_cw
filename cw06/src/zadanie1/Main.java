package zadanie1;

import java.util.Scanner;

public class Main {
    static void main() {
        /*
        Zdefiniuj dwuwymiarową, prostokątną tablicę intów,
        a następnie oblicz
        i wypisz sumę wszystkich elementów z ostatniej kolumny.
        Żadne zmiany programu
        nie powinny być konieczne po modyfikacji tablicy,
        w szczególności zmianie jej rozmiarów.
        */
        Scanner sc = new Scanner(System.in);
        int numOfRows, numOfCols;
        
        //
        System.out.print("Wpisz liczbę wierszy: ");
        numOfRows = sc.nextInt();
        
        System.out.print("Wpisz liczbę kolumn: ");
        numOfCols = sc.nextInt();
        
        int[][] arr = new int[numOfRows][numOfCols];
        
        // wypełnienie tablicy 2d
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * (10 - 1 + 1) + 1);
            }
        }
        
        // wyświetlenie tablicy 2d
        for (int[] row: arr) {
            for (int val: row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
        
        // suma wszystkich elementów ostatniej kolumny
        int lastColIndex = numOfCols - 1;
        int sumOfLastCol = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfLastCol += arr[i][lastColIndex];
        }
        System.out.println(
            "Suma elementów ostatniej kolumny: " + sumOfLastCol
        );
        
        sc.close();
    }
}
