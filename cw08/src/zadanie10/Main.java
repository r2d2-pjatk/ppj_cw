package zadanie10;

import java.util.Arrays;

public class Main {
    static void main() {
        int[] arr = generateArr();
        System.out.print(Arrays.toString(arr) + ", ");
        
        swapMinAndMax(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static int[] generateArr() {
        int n = (int) (Math.random() * (10 - 5 + 1) + 5);
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20 + 1);
        }
        
        return arr;
    }
    
    public static void swapMinAndMax(int[] arr) {
        int minValIndex = 0, maxValIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxValIndex])
                maxValIndex = i;
            if (arr[i] < arr[minValIndex])
                minValIndex = i;
        }
        
        int temp = arr[minValIndex];
        arr[minValIndex] = arr[maxValIndex];
        arr[maxValIndex] = temp;
    }
}
