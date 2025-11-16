package zadanie6;

public class Main {
    static void main() {
        /*
        Napisz program, który definiuje dwie tablice intów i wypisuje wszystkie elementy,
        które występują zarówno w jednej, jak i drugiej tablicy, ale każdą wartość tylko raz, bez powtórzeń.
        Na przykład dla tablic
            int[] arr = {2, 3, 4, 3, 6, 7, 6, 8, 2, 9};
            int[] brr = {2, 3, 6, 8, 5, 1};
        wynik mógłby wyglądać tak (kolejność, w jakiej wypisywane są elementy, jest nieistotna):
            3 6 8 2
        Nie wolno tworzyć żadnych dodatkowych tablic, kolekcji ani Stringów.
        Nie używaj też klas z żadnych pakietów prócz standardowego java.lang.
        Tablice nie mogą być zmieniane (w szczególności sortowane).
        */
        int[] arr = {2, 3, 4, 3, 6, 7, 6, 8, 2, 9};
        int[] brr = {2, 3, 6, 8, 5, 1};
        
        for (int i = 0; i < brr.length; i++) {
            // czy brr[i] już wystąpiło wcześniej w brr
            boolean alreadyPresent = false;
            for (int k = 0; k < i; k++) {
                if (brr[k] == brr[i]) {
                    alreadyPresent = true;
                    break;
                }
            }
            if (alreadyPresent)
                continue;
            
            // czy brr[i] jest w arr
            boolean isInArr = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == brr[i]) {
                    isInArr = true;
                    break;
                }
            }
            if (isInArr) {
                System.out.print(brr[i] + " ");
            }
        }
    }
}