package zadanie4;

public class Recurs1 {
    public static void main(String[] args) {
        /*
        Napisz statyczną rekurencyjną metodę,
        która pobiera tablicę intów, indeks startowy i wartość całkowitą,
        a zwraca liczbę wystąpień tej wartości w tablicy,
        biorąc pod uwagę tylko jej elementy od podanego indeksu;
        na przykład program powinien wydrukować
	        2 -> 3
	        3 -> 4
        Nie używaj pętli, pól statycznych ani dodatkowych tablic/kolekcji/napisów.
        */
        int[] a = {2, 3, 2, 4, 3, 1, 6, 3, 2, 3};
        System.out.println("2 -> " + count(a,0,2));
        System.out.println("3 -> " + count(a,0,3));
    }
    
    public static int count(int[] arr, int from, int what) {
        if (from >= arr.length)
            return 0;
        else
            return ((arr[from] == what) ? 1 : 0) + count(arr, from + 1, what);
    }
}
