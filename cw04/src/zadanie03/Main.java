package zadanie03;
import java.util.Scanner;


public class Main {
    static void main() {
        /*
        Napisz program, który wczytuje pięć liczb typu int
        i po wczytaniu trzeciej, czwartej i piątej drukuje sumę trzech ostatnio wczytanych liczb.
        Można zdefiniować najwyżej trzy zmienne typu int. Nie używaj pętli ani tablic.
        */
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        // suma liczb 1–3
        System.out.println(a + b + c);
        
        // przesuwamy "okno"
        a = b;
        b = c;
        c = sc.nextInt();
        // suma liczb 2–4
        System.out.println(a + b + c);
        
        a = b;
        b = c;
        c = sc.nextInt();
        // suma liczb 3–5
        System.out.println(a + b + c);
        
        sc.close();
    }
}
