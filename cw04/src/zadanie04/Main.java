package zadanie04;
import java.util.Scanner;


public class Main {
    static void main() {
        /*
        Napisz program wczytujący cztery liczby całkowite
        i wypisujący różnicę między największą i najmniejszą z nich.
        Możesz utworzyć tylko trzy zmienne typu int.
        Nie używaj tablic, napisów ani innych kolekcji. (Można korzystać z pętli)
        */
        
        Scanner sc = new Scanner(System.in);
        int x, min, max;
        
        // pierwsza liczba
        x = sc.nextInt();
        // inicjalizacja min i max
        min = max = x;
        
        for (int i = 1; i < 4; i++) {
            x = sc.nextInt();
            
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }
        
        IO.println(max - min);
        sc.close();
    }
}
