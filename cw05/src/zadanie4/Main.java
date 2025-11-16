package zadanie4;

public class Main {
    static void main() {
        /*
        Napisać program, który przestawia elementy tablicy intów tak,
        że wszystkie elementy parzyste występują przed nieparzystymi.
        Program powinien wypisać elementy tablicy przed i po przestawieniu
        oraz podać również ilość elementów parzystych.
        Na przykład dla tablicy
            int[] arr = { 2,3,4,3,6,7,6,8,2,9 };
        wynik mógłby wyglądać tak (kolejność, w jakiej wypisywane są elementy, jest nieistotna,
        byle wszystkie parzyste występowały przed nieparzystymi):
            2 4 6 6 8 2 3 3 7 9 count = 6
        Nie wolno tworzyć żadnych dodatkowych tablic ani Stringów!
        Wolno użyć tylko jednego przebiegu pętli!
        */
        int[] arr = {2, 3, 4, 3, 6, 7, 6, 8, 2, 9};
        int evenNumCounter = 0;
        int evenStartIndex = 0;
        
        for(int i = 0; i < arr.length; i++) {
            boolean isEven = arr[i] % 2 == 0;
            int temp = arr[i];
            
            if (isEven) {
                arr[i] = arr[evenStartIndex];
                arr[evenStartIndex] = temp;
                evenStartIndex++;
                evenNumCounter++;
            }
        }
        
        for(int element: arr) {
            System.out.print(element + "\t");
        }
        System.out.println("count = " + evenNumCounter);
    }
}
