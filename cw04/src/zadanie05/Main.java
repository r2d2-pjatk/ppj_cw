package zadanie05;
import java.util.Scanner;


public class Main {
    static void main() {
        /*
        Napisz program, który wczytuje w pętli ciąg liczb całkowitych
        do momentu, gdy użytkownik poda liczbę 0,
        która jest tylko sygnałem końca danych i nie jest dalej brana pod uwagę.
        Następnie program wypisuje wartości
        najmniejszego i największego elementu wczytanego ciągu
        oraz liczbę wystąpień tych wartości w całym ciągu.
        Na przykład dla ciągu (2, 3, 4, 2, 7, 4, 7, 2)
        program powinien wypisać
        Min = 2, 3 razy
        Max = 7, 2 razy
        Uwaga: nie wolno stosować żadnych tablic ani innych kolekcji!
        */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        // ustawiamy początkowe wartości
        int min = x, max = x;
        int minCounter = 1, maxCounter = 1;
        boolean isRunning = true;
        
        while (isRunning) {
            if (x != 0)
                x = sc.nextInt();
            else
                isRunning = false;
            
            if ((x < min) && (x != 0)) {
                min = x;
                minCounter = 1;
            } else if (x > max) {
                max = x;
                maxCounter = 1;
            } else if (x == min) {
                minCounter++;
            } else if (x == max) {
                maxCounter++;
            }
        }
        
        IO.println("Min = " + min + ", " + minCounter + " razy");
        IO.println("Max = " + max + ", " + maxCounter + " razy");
    }
}
