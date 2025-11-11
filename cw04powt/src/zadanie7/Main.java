package zadanie7;

import java.util.Scanner;

public class Main {
    static void main() {
        /*
        Załóżmy, że jedna liczba typu int określa
        krój, styl, wagę i wielkość czcionki według następującego schematu:
        • wartość dwóch najmłodszych bitów określa krój
            – 0: Courier
            – 1: Times
            – 2: Arial
            – 3: Helvetica
        • dwa następne bity określają styl
            – 0: plain
            – 1: italic
            – 2: slanted
            – 3: nieokreślone (illegal)
        • jeden następny bit określa wagę
            – 0: normal
            – 1: bold
        • trzy następne bity określają wielkość
            – 0: x-small
            – 1: small
            – 2: medium
            – 3: large
            – 4: x-large
            – pozostałe wartości: nieokreślone (illegal)
        Napisz program definiujący jedną liczbę typu int,
        a następnie wypisujący informację o foncie określanym tą liczbą.
        Jeśli liczba nie określa żadnej czcionki,
        program powinien wypisać odpowiedni komunikat i się zakończyć.
        Uwagi:
        • Aby zakończyć program można zastosować w funkcji main instrukcję return;
        • Przydatne będzie składanie (konkatenacja) napisów do skonstruowania końcowego komunikatu.
        Na przykład dla liczb 102, 166, 46, 137 wyniki powinny być, odpowiednio
            n=102: Arial, italic, normal, large
            n=166: illegal size
            n=46: illegal style
            n=137: Times, slanted, normal, x-large
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = sc.nextInt();
        
        int fontBits = n & 0b11;
        String font = switch (fontBits) {
            case 0 -> "Courier";
            case 1 -> "Times";
            case 2 -> "Arial";
            case 3 -> "Helvetica";
            default -> null;
        };
        
        int styleBits = (n & (0b11 << 2)) >> 2;
        String style = switch (styleBits) {
            case 0 -> "plain";
            case 1 -> "italic";
            case 2 -> "slanted";
            case 3 -> "nieokreślone (illegal)";
            default -> null;
        };
        
        int weightBits = (n & (1 << 4)) >> 4;
        String weight = switch (weightBits) {
            case 0 -> "normal";
            case 1 -> "bold";
            default -> null;
        };
        
        int sizeBits = (n & (0b111 << 5)) >> 5;
        String size = switch (sizeBits) {
            case 0 -> "x-small";
            case 1 -> "small";
            case 2 -> "medium";
            case 3 -> "large";
            case 4 -> "x-large";
            default -> "nieokreślone (illegal)";
        };
        
        
        boolean isStyleValid = !style.equals("nieokreślone (illegal)");
        boolean isSizeValid = !size.equals("nieokreślone (illegal)");
        
        if (isStyleValid && isSizeValid) {
            System.out.println("n=" + n + ": " + font + ", " + style + ", " + weight + ", " + size);
        } else if (!isStyleValid) {
            System.out.println("n=" + n + ": " + "illegal style");
        } else if (!isSizeValid) {
            System.out.println("n=" + n + ": " + "illegal size");
        }
        
        sc.close();
    }
}
