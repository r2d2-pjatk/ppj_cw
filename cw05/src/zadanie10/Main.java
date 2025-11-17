package zadanie10;

import java.util.Arrays;

public class Main {
    static void main() {
        /*
        Dana jest n-elementowa tablica
        (posortowana niemalejąco) liczb całkowitych,
        gdzie n ≥ 2.
        Napisz program stwierdzający
        czy w podanej tablicy jakaś wartość występuje co najmniej n/2 razy.
        */
        int n = 10;
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 3 + 1);
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j])
                    minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
        
        
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            
            if (count >= n / 2) {
                System.out.println(
                        "Liczba " + arr[i] +
                        " występuje co najmniej " +
                        (n / 2) + " razy"
                );
                break;
            }
        }
    }
}
