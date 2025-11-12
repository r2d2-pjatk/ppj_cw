package zadanie9;

public class Main {
    static void main() {
        /*
        Wywołanie Math.random() zwraca liczbę (pseudo)losową typu double z półotwartego przedziału [0, 1).
        Wykorzystaj ten generator do wylosowania jednej karty ze standardowej talii.
        Najpierw wylosuj liczbę całkowitą z zakresu [1, 4] (odpowiadającą kolorowi: trefl, karo, kier, pik),
        a potem liczbę całkowitą z zakresu [2, 14] (dwójka, trójka, . . . , dziesiątka, Walet, Dama, Król, As).
        Za pomocą wyrażenia switch (switch expression) zdefiniuj napis określający kartę
        i wyświetl go na ekranie, na przykład
            Dama Pik
        Instrukcja System.out.println może wystąpić w programie tylko raz.
        */
        double randomNum = Math.random();
        
        int cardColorNum = (int) (randomNum * 4 + 1);
        String cardColor = switch (cardColorNum) {
            case 1 -> "trefl";
            case 2 -> "karo";
            case 3 -> "kier";
            case 4 -> "pik";
            default -> null;
        };
        
        int cardValueNum = (int) (randomNum * 13 + 2);
        String cardValue = switch (cardValueNum) {
            case 2 -> "dwójka";
            case 3 -> "trójka";
            case 4 -> "czwórka";
            case 5 -> "piątka";
            case 6 -> "szóstka";
            case 7 -> "siódemka";
            case 8 -> "ósemka";
            case 9 -> "dziewiątka";
            case 10 -> "dziesiątka";
            case 11 -> "Walet";
            case 12 -> "Dama";
            case 13 -> "Król";
            case 14 -> "As";
            default -> null;
        };
        
        System.out.println(cardValue + " " + cardColor);
    }
}
