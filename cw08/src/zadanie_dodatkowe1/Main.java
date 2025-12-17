package zadanie_dodatkowe1;

public class Main {
    static void main() {
        /*
        Stwórz statyczną metodę private static int roll() { // ...}
        która przeprowadza symulację rzutu dwiema kostkami i powtarza ją, aż wypadną dwie szóstki;
        metoda zwraca liczbę wykonanych rzutów.
        W metodzie main wywołaj metodę roll 3 miliony razy i odpowiedz na pytania:
        - w jakim procencie przypadków uzyskano dwie szóstki już w pierwszym rzucie;
        - w jakim procencie przypadków uzyskano dwie szóstki dopiero po 128 lub więcej rzutach.
        Wynik programu mógłby zatem wyglądać tak
        [Jak można łatwo policzyć, wartości oczekiwane dla tych dwóch liczb wynoszą, odpowiednio, 2.78% i 2.79%]
        */
        int numOfRollCalls = 3_000_000;
        int[] rollCountArr = new int[numOfRollCalls];
        
        for (int i = 0; i < rollCountArr.length; i++) {
            System.out.println("Wywołanie " + (i + 1) + " metody roll()");
            rollCountArr[i] = roll();
        }
        
        int pairOfSixInFirstRollCount = 0;
        for (int val : rollCountArr) {
            if (val == 1)
                pairOfSixInFirstRollCount++;
        }
        double pairOfSixInFirstRoll = (double) pairOfSixInFirstRollCount / numOfRollCalls * 100;
        System.out.print("In first roll    : ");
        System.out.printf("%.2f", pairOfSixInFirstRoll);
        System.out.println("%");
        
        int pairOfSixIn128orMoreRollsCount = 0;
        for (int val : rollCountArr) {
            if (val >= 128)
                pairOfSixIn128orMoreRollsCount++;
        }
        double pairOfSixIn128orMoreRolls = (double) pairOfSixIn128orMoreRollsCount / numOfRollCalls * 100;
        System.out.print("128 or more rolls: ");
        System.out.printf("%.2f", pairOfSixIn128orMoreRolls);
        System.out.println("%");
    }
    
    private static int roll() {
        int firstCube, secondCube;
        int rollCount = 0;
        
        do {
            firstCube = (int) (Math.random() * 6 + 1);
            secondCube = (int) (Math.random() * 6 + 1);
            System.out.println("Kość 1: " + firstCube + ", Kość 2: " + secondCube);
            rollCount++;
        } while (!(firstCube == 6 && secondCube == 6));
        
        return rollCount;
    }
}
