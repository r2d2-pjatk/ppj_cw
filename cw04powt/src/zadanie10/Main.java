package zadanie10;

public class Main {
    static void main() {
        /*
        Używając funkcji Math.random, zasymuluj w pętli rzut dwiema kostkami.
        Po każdym rzucie wypisz sumę oczek z obu kostek.
        Pętla się kończy, gdy ta suma wypadnie 9.
        Nie używaj break ani continue.
        Rozwiąż zadanie za pomocą pętli do-while oraz pętli for.
        */
        double randomValue;
        int diceThrow, sumOfThrows;
        int numberOfThrows = 2;
        boolean isSumOfNine;
        
        do {
            sumOfThrows = 0;
            for (int i = 0; i < numberOfThrows; i++) {
                randomValue = Math.random();
                diceThrow = (int) (randomValue * 6 + 1);
                System.out.println("Rzut " + (i + 1) + ": " + diceThrow);
                sumOfThrows += diceThrow;
            }
            
            System.out.println("Suma rzutów: " + sumOfThrows);
            isSumOfNine = sumOfThrows == 9;
        } while (!isSumOfNine);
    }
}
