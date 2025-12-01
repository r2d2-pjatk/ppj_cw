package zadanie3;

import java.util.Scanner;

public class Main {
    static void main() {
        /*
        Zdefiniuj w programie dwuwymiarową tablicę Stringów z nazwami krajów i ich stolic,
        na przykład jak w podanym linku i napisz program,
        który wczytuje nazwę kraju, a następnie drukuje nazwę jego stolicy
        (nie zapomnij, że Stringi porównuje się za pomocą equals lub equalsIgnoreCase, a nie za pomocą operatora ==).
        Program powinien wyświetlić stosowny komunikat, jeśli nie odnajdzie podanej nazwy kraju.
        */
        Scanner sc = new Scanner(System.in);
        
        String[][] countriesCapitals = {
            {"Kenya",  "Nairobi"}, {"Rwanda", "Kigali"},
            {"Gambia", "Banjul"},  {"Ghana",  "Accra"},
            {"Niger",  "Niamey"},  {"Zambia", "Lusaka"}
        };
        
        System.out.print("Podaj nazwę kraju: ");
        String country = sc.nextLine();
        
        boolean isListedCountry = false;
        for (String[] countryCapital: countriesCapitals) {
            if (countryCapital[0].equals(country)) {
                isListedCountry = true;
                System.out.println(countryCapital[1]);
                break;
            }
        }
        if (!isListedCountry)
            System.out.println("Nie odnaleziono nazwy kraju");
    }
}
