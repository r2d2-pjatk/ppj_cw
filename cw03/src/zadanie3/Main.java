package zadanie3;

public class Main {
    public static void main(String[] args) {
        // int nie mieszczący się w zakresie typu int (powyżej wartości (2^31)-1 dla 32 bitów)
        // System.out.println(3_000_000_000);
        // po dodaniu sufiksu kompilator nie zwraca błędu, ponieważ nie interpretuje już literału jako int
        System.out.println(3_000_000_000L);
    }
}
