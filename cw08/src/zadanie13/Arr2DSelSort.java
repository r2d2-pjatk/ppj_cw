package zadanie13;

import java.util.Arrays;

public class Arr2DSelSort {
    public static void main (String[] args) {
        int[][] a = {
            {3, 2, 6, 1, 3, 5, 6, 1, 3},
            {3, 1, 2, 1, 5, 7, 2},
            {8, 9, 2, 1}
        };
        System.out.println("Before:");
        printArr2D(a);
        sortRows(a);
        System.out.println("After:");
        printArr2D(a);
        
        int[][] b = {
            {3, 2, 6, 1, 6},
            {7, 1, 2, 1, 5},
            {5, 3, 1, 8, 7},
            {8, 9, 2, 7, 1}
        };
        System.out.println("Now columns\nBefore:");
        printArr2D(b);
        sortCols(b);
        System.out.println("After:");
        printArr2D(b);
    }
    
    public static void selSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minValIndex])
                    minValIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minValIndex];
            arr[minValIndex] = temp;
        }
    }
    
    public static void sortRows(int[][] arr) {
        for (int[] row : arr) {
            selSort(row);
        }
    }
    
    public static void sortCols(int[][] arr) {
        int colIndex = 0;
        
        while (colIndex < arr[0].length) {
            int[] tempColArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                tempColArr[i] = arr[i][colIndex];
            }
            
            selSort(tempColArr);
            
            for (int i = 0; i < arr.length; i++) {
                arr[i][colIndex] = tempColArr[i];
            }
            
            colIndex++;
        }
    }
    
    public static void printArr2D(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
