package zadanie12;

import java.util.Arrays;

public class Main {
    static void main() {
        /*
        Dana jest n-elementowa tablica
        (posortowana niemalejąco) liczb całkowitych,
        gdzie n ≥ 2.
        Napisz program wyznaczający wartość,
        która pojawia się w podanej tablicy najczęściej.
        */
        int n = 30;
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        int mostFrequentValIndex = 0;
        int valCounter = 1;
        int maxValCounter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                valCounter++;
                if (valCounter > maxValCounter) {
                    maxValCounter = valCounter;
                    mostFrequentValIndex = i;
                }
            } else
                valCounter = 1;
        }
        
        System.out.println(Arrays.toString(arr));
        
        System.out.println(
                "Najczęstsza wartość w tablicy to " +
                arr[mostFrequentValIndex] +
                " występująca " + maxValCounter +
                "-krotnie"
        );
    }
}
