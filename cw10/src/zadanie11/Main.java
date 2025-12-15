package zadanie11;

public class Main {
    static void main() {
        WorekKosci bagOfDices = new WorekKosci();
        int sumOfRolls = 0;
        int rollCount = 0;
        do {
            // losowanie jednej z kości (klasy pochodnej klasy Kosc) w polu kosci klasy WorekKosci
            Kosc drawnDice = bagOfDices.wylosujKosc();
            // losujemy wartość rzutu z metody roll dla odpowiedniej klasy pochodnej Kosc
            int rollResult = drawnDice.roll();
            System.out.print("Rzut " + ++rollCount + ", ");
            System.out.print("kość " + drawnDice + ": ");
            System.out.print("wynik rzutu = " + rollResult + ", ");
            sumOfRolls += rollResult;
            System.out.println("suma rzutów = " + sumOfRolls);
        } while (sumOfRolls < 100);
    }
}
