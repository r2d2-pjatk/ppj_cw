package zadanie_dodatkowe1;

import java.util.Scanner;

public class Main {
    static void main() {
        /*
        Napisz program pełniący funkcję (bardzo) prostego kalkulatora.
        Program wczytuje za pomocą Scannera lub JOptionPane dwie liczby (typu double),
        a następnie, jako String, symbol działania (+, −, ∗ lub /),
        po czym wyświetla wynik (sumę, różnicę, iloczyn bądź iloraz wczytanych liczb).
        Do porównywania napisów, na przykład s1 i s2,
        służy metoda equals (s1.equals(s2) zwraca true lub false).
        Jeśli wpadniesz na pomysł jak to dodatkowo rozszerzyć bądź dodać inne funkcjonalności to śmiało :)
        */
        Scanner sc = new Scanner(System.in);
        double a, b;
        double result = 0;
        String calcSymbol;
        
        System.out.println("Podaj dwie liczby:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Podaj symbol działania (+, -, * lub /):");
        calcSymbol = sc.next();
        
        if (calcSymbol.equals("+")) {
            result = a + b;
            System.out.println(result);
        } else if (calcSymbol.equals("-")) {
            result = a - b;
            System.out.println(result);
        } else if (calcSymbol.equals("*")) {
            result = a * b;
            System.out.println(result);
        } else if (calcSymbol.equals("/")) {
            result = a / b;
            System.out.println(result);
        } else {
            System.out.println("Nie podano prawidłowych liczb lub symbolu działania");
        }
    }
}
