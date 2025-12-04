package zadanie5;

public class Main {
    static void main() {
        /*
        Zdefiniuj trzywymiarową tablicę intów,
        która reprezentuje wpłaty i wypłaty klientów banku na różne konta
        (każdy klient może mieć kilka kont).
        Na przykład jak pod podanym linkiem gdzie:
            - pierwszy indeks numeruje klientów;
            - drugi indeks numeruje, dla danego klienta, jego konta;
            - trzeci indeks numeruje dla danego klienta i danego, należącego do niego, konta kolejne wpłaty
            (wartości dodatnie) i wypłaty (wartości ujemne).
        Program powinien utworzyć tablicę intów o rozmiarze równym liczbie klientów,
        której elementy są równe sumie wpłat i wypłat kolejnych klientów na jego/jej wszystkich kontach
        (dla danych z przykładu powinny to być liczby 235, 500 i 310).
        Po zmianie rozmiarów i/lub wartości elementów tablicy oper,
        program powinien działać prawidłowo bez żadnych innych modyfikacji.
        */
        int[][][] opers = {
            { {100, -50, 25}, {150, -300}, {300, -90, 100} }, // klient 1, 3 konta
            { {90, -60, 250}, {300, 20,-100} },               // klient 2, 2 konta
            { {20, 50}, {300}, {20,-20,40}, {100,-200} }      // klient 3, 4 konta
        };
        
        int[] sumsOfClientBalances = new int[opers.length];
        
        for (int i = 0; i < opers.length; i++) {
            int sumOfClientBalances = 0;
            for (int j = 0; j < opers[i].length; j++) {
                for (int k = 0; k < opers[i][j].length; k++) {
                    sumOfClientBalances += opers[i][j][k];
                }
            }
            sumsOfClientBalances[i] = sumOfClientBalances;
        }
        
        for (int totalBalance: sumsOfClientBalances) {
            System.out.println(totalBalance);
        }
    }
}
