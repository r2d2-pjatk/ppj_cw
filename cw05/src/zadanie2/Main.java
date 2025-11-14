package zadanie2;

public class Main {
    static void main() {
        /*
        Napisz program, który daną tablicę intów „rotuje” o jedną pozycję w lewo,
        to znaczy pierwszy element jest zastępowany drugim, drugi trzecim itd., a ostatni pierwszym.
        Na przykład tablica:
            1 2 3 4 5
        po operacji rotowania powinna mieć postać:
            2 3 4 5 1
        Nie wolno tworzyć żadnych dodatkowych tablic ani Stringów!
        Po zmianie rozmiaru i/lub wartości elementów tablicy
        program powinien działać prawidłowo bez żadnych innych modyfikacji.
        */
        int[] arr = {1, 2, 3, 4, 5};
        int firstElement = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                arr[i] = firstElement;
            else
                arr[i] = arr[i + 1];
        }
        
        for (int element: arr) {
            System.out.printf("%2d", element);
        }
    }
}
