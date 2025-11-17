package zadanie9;

import java.util.Arrays;

public class Main {
    static void main() {
        /*
        Zadeklaruj n-elementową tablicę przechowującą wartości całkowite z przedziału [1,100),
        gdzie n jest zmienną typu int oraz n >= 2.
        Wyświetl na konsolę drugą wartość co do wielkości z podanej tablicy.
        W przypadku równych elementów tablicy wyświetl 0.
        */
        int n = 10;
        int[] arrA = new int[n];
        
        // generowanie elementów
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = (int) (Math.random() * 99 + 1);
        }
        
        
        int maxValueIndex = 0;
        for (int i = 1; i < arrA.length; i++) {
            if (arrA[i] > arrA[maxValueIndex])
                maxValueIndex = i;
        }
        
        int secondMaxValueIndex = (maxValueIndex == 0 ? 1 : 0);
        for (int i = 1; i < arrA.length; i++) {
            if ((arrA[i] > arrA[secondMaxValueIndex]) && (i != maxValueIndex))
                secondMaxValueIndex = i;
        }
        
        System.out.println(Arrays.toString(arrA));
        if (arrA[maxValueIndex] != arrA[secondMaxValueIndex])
            System.out.println(arrA[secondMaxValueIndex]);
        else
            System.out.println(0);
    }
}
