package zadanie2;

import java.util.Arrays;

public class Main {
    static void main() {
        /*
        Napisz statyczną metodę,
        która pobiera dwuwymiarową tablicę intów, na przykład
            int[][] arr = { {1,3}, {3,4,5,8}, {6,8}, {1,9,6} };
        i tworzy i zwraca tablicę o długości arr.length,
        której elementy są równe największym elementom poszczególnych „wierszy” tablicy arr
        (oczywiście, program powinien działać niezależnie od tego, jak tę tablicę zdefiniujemy).
        */
        int[][] arr = {{1, 3}, {3, 4, 5, 8}, {6, 8}, {1, 9, 6}};
        
        System.out.println("arr: " + Arrays.deepToString(arr));
        
        int[] maxRowValsArr = getArrOfMaxRowVals(arr);
        
        System.out.println("maxRowValsArr: " + Arrays.toString(maxRowValsArr));
    }
    
    public static int[] getArrOfMaxRowVals(int[][] arr2d) {
        int[] resultArr = new int[arr2d.length];
        for (int i = 0; i < arr2d.length; i++) {
            int maxValIndex = 0;
            for (int j = 1; j < arr2d[i].length; j++) {
                if (arr2d[i][maxValIndex] < arr2d[i][j])
                    maxValIndex = j;
            }
            resultArr[i] = arr2d[i][maxValIndex];
        }
        return resultArr;
    }
}
