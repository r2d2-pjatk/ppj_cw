package zadanie4;

import java.util.Arrays;

public class Main {
    static void main() {
        /*
        Zdefiniuj dwuwymiarową tablicę intów i dwa indeksy:
        program powinien zamienić miejscami „wiersze” tablicy o podanych indeksach.
        Wydrukuj w czytelnej postaci tablicę przed i po tej operacji.
        Tablica nie musi być prostokątna; nie wolno też tworzyć pomocniczych tablic.
        */
        int rowNum = (int) (Math.random() * (5 - 3 + 1) + 2);
        int colNum = (int) (Math.random() * (5 - 3 + 1) + 2);
        int[][] arr = new int[rowNum][colNum];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * (10 - 1 + 1) + 1);
            }
        }
        
        for (int[] row: arr) {
            for (int val: row) {
                System.out.printf("%3d", val);
            }
            System.out.println();
        }
        
        int index1 = 0, index2 = 2;
        for (int i = 0; i < arr.length; i++) {
            int[] tempRow = arr[i];
            if (i == index1) {
                arr[i] = arr[index2];
                arr[index2] = tempRow;
            }
        }
        
        System.out.println();
        for (int[] row: arr) {
            for (int val: row) {
                System.out.printf("%3d", val);
            }
            System.out.println();
        }
    }
}
