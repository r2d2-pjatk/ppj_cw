package zadanie12;

import java.util.Scanner;

public class Main {
    static void main() {
        /*
        Napisz program pobierający od użytkownika trzy nieujemne liczby całkowite
        i wypisujący na ekranie „histogram” dla tych danych,
        to znaczy trzy „słupki” złożone ze znaków ’*’, wyrównane od dołu,
        o wysokościach równych wartościom trzech wczytanych liczb.
        Nie używaj tablic, napisów ani żadnych innych kolekcji.
        */
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int maxNum = 0, numOfValues = 3;
        char asterisk = '*';
        
        System.out.println("Podaj trzy nieujemne liczby całkowite");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Wybrane liczby: " + a + ", " + b + ", " + c);
        
        if (a > maxNum)
            maxNum = a;
        if (b > maxNum)
            maxNum = b;
        if (c > maxNum)
            maxNum = c;
        
        for (int i = maxNum; i > 0; i--) {
            for (int j = 1; j <= numOfValues; j++) {
                switch (j) {
                    case 1:
                        if (i <= a)
                            System.out.print(asterisk);
                        else
                            System.out.print(" ");
                        break;
                    case 2:
                        if (i <= b)
                            System.out.print(asterisk);
                        else
                            System.out.print(" ");
                        break;
                    case 3:
                        if (i <= c)
                            System.out.println(asterisk);
                        else
                            System.out.println(" ");
                        break;
                }
            }
        }
    }
}
