package zadanie13;

import java.util.Scanner;

public class Main {
    static void main() {
        /*
        Palindrom to słowo, liczba, zdanie lub inny ciąg znaków,
        który czytany od lewej do prawej i od prawej do lewej
        brzmi tak samo
        Dana jest tablica
        char[] tab = ...
        Utwórz kompletny program,
        który stwierdzi czy w tablicy tab jest przechowywany palindrom.
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Napisz słowo, które jest (lub nie) palindromem: ");
        String word = sc.next();
        // char[] tab = {'z', 'a', 'r', 'a', 'z'};
        char[] tab = word.toCharArray();
        
        boolean isPalindrome = true;
        int leftEndIndex = 0, rightEndIndex = tab.length - 1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[leftEndIndex++] != tab[rightEndIndex--]) {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println("Tablica znaków " + (isPalindrome ? "jest ": "nie jest ") + "palindromem");
    }
}
