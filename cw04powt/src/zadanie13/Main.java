package zadanie13;

import java.util.Scanner;

public class Main {
    static void main() {
        /*
        Zdefiniuj w programie cztery liczby typu int
        — a1, a2, b1, b2
        — które interpretujemy jako współrzędne na osi liczbowej końców dwóch przedziałów:
        A = [a1, a2] oraz B = [b1, b2].
        Program wczytuje jedną liczbę (nazwijmy ją x) typu int i odpowiada na pytania
        */
        Scanner sc = new Scanner(System.in);
        // przedział A
        int a1 = 2, a2 = 4;
        // przedział B
        int b1 = 1, b2 = 6;
        int x;
        
        System.out.println("Interval A = [" + a1 + ", " + a2 + "]");
        System.out.println("Interval B = [" + b1 + ", " + b2 + "]");
        
        System.out.print("Enter x ");
        x = sc.nextInt();
        
        boolean isXinA = (x >= a1) && (x <= a2);
        boolean isXinB = (x >= b1) && (x <= b2);
        boolean isXinAminusB = isXinA && !isXinB;
        boolean isXinBminusA = isXinB && !isXinA;
        boolean isXinIntersecOfAB = isXinA && isXinB;
        boolean isXinUnionOfAB = isXinA || isXinB;
        boolean isXinSymmDiffOfAB = isXinAminusB || isXinBminusA;
        
        System.out.println("x in A:                       " + isXinA);
        System.out.println("x in B:                       " + isXinB);
        System.out.println("x in A\\B:                     " + isXinAminusB);
        System.out.println("x in B\\A:                     " + isXinBminusA);
        System.out.println("x in intersection of A and B: " + isXinIntersecOfAB);
        System.out.println("x in union of A and B         " + isXinUnionOfAB);
        System.out.println("x in symm. diff. of A and B   " + isXinSymmDiffOfAB);
    }
}
