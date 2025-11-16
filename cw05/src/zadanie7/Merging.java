package zadanie7;

import java.util.Arrays;

public class Merging {
    public static void main(String[] args) {
        /*
        Dane są dwie tablice intów, a arraIndex b,
        przy czym pierwsza jest uporządkowana niemalejąco, a druga nierosnąco.
        Utwórz tablicę c, która pomieści elementy z obu tablic
        arraIndex wypełnij ją kopiami elementów z a arraIndex b tak,
        aby tablica c była uporządkowana niemalejąco.
        Na przykład, poprawnie uzupełniony program z podanego linku powinien wydrukować
        Po zmianie długości arraIndex/lub wartości elementów tablic a arraIndex b
        program powinien działać bez żadnych innych modyfikacji.
        */
        
        int[] arra = {3, 5, 8, 9, 11, 13, 14, 14, 19};
        int[] arrb = {15, 11, 2, 2, 0, -1};
        
        int[] arrc = new int[arra.length + arrb.length];
        
        int arraIndex = 0;                  // indeks w arra (od początku)
        int arrbIndex = arrb.length - 1;    // indeks w arrb (od końca)
        int arrcIndex = 0;                  // indeks w arrc
        
        // scalamy, dopóki w obu tablicach są jeszcze elementy
        while ((arraIndex < arra.length) && (arrbIndex >= 0)) {
            if (arra[arraIndex] <= arrb[arrbIndex]) {
                arrc[arrcIndex] = arra[arraIndex];
                arraIndex++;
            } else {
                arrc[arrcIndex] = arrb[arrbIndex];
                arrbIndex--;
            }
            arrcIndex++;
        }
        
        // jeśli coś zostało w arra
        while (arraIndex < arra.length) {
            arrc[arrcIndex] = arra[arraIndex];
            arraIndex++;
            arrcIndex++;
        }
        
        // jeśli coś zostało w arrb
        while (arrbIndex >= 0) {
            arrc[arrcIndex] = arrb[arrbIndex];
            arrbIndex--;
            arrcIndex++;
        }
        
        System.out.println(Arrays.toString(arrc));
    }
}
