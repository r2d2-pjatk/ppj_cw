package zadanie7;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);
        
        System.out.print(
            "Wybierz płeć (0 - kobieta, 1 - mężczyzna): ");
        int plec = input.nextInt();
        
        System.out.print(
            "Wybierz stan cywilny (0 - panna, 1 - kawaler, 2 - mężatka, 3 - żonaty): "
        );
        int stan_cyw = input.nextInt();
        
        System.out.print(
            "Wybierz grupę wiekową (0 - 18-30, 1 - 31-45, 2 - 46-60, 3 - 60+): "
        );
        int grupa_wiek = input.nextInt();
        
        System.out.print(
            "Wybierz wykształcenie (0 - podstawowe, 1 - średnie, 2 - licencjat, 3 - magister): "
        );
        int edu = input.nextInt();
        
        System.out.print(
            "Wybierz miejsce zamieszkania " +
            "(0 - wieś, 1 - miasto do 50 tys., 2 - miasto 50-400 tys., 3 - miasto +400 tys.): "
        );
        int zam = input.nextInt();
        
        System.out.print("Wybierz region kraju (od 0 do 15): ");
        int region = input.nextInt();
        
        System.out.print("Wybierz odpowiedź (od 0 do 7): ");
        int odp = input.nextInt();
        
        short wynik = koduj(plec, stan_cyw, grupa_wiek, edu, zam, region, odp);
        info(wynik);
        
        input.close();
    }
    
    static short koduj(
            int plec,
            int stan_cyw,
            int grupa_wiek,
            int edu,
            int zam,
            int region,
            int odp
    ) {
        short result = (short) (
            plec |                          // poz 0
            (stan_cyw << 1) |               // poz 1, 2
            (grupa_wiek << 3) |             // poz 3, 4
            (edu << 5) |                    // poz 5, 6
            (zam << 7) |                    // poz 7, 8
            (region << 9) |                 // poz 9, 10, 11, 12
            (odp << 13)                     // poz 13, 14, 15
        );
        return result;
    }
    
    static void info(short kod) {
        System.out.println("\nODPOWIEDZI");
        System.out.println("##########");
        
        String plec = switch (kod & 1) {
            case 0 -> "0 - kobieta";
            case 1 -> "1 - mężczyzna";
            default -> throw new IllegalArgumentException("Błędna wartość");
        };
        System.out.println("płeć: " + plec);
        
        String stan_cyw = switch ((kod >> 1) & 0b11) {
            case 0 -> "0 - panna";
            case 1 -> "1 - kawaler";
            case 2 -> "2 - mężatka";
            case 3 -> "3 - żonaty";
            default -> throw new IllegalArgumentException("Błędna wartość");
        };
        System.out.println("stan cywilny: " + stan_cyw);
        
        String grupa_wiek = switch ((kod >> 3) & 0b11) {
            case 0 -> "0 - 18-30";
            case 1 -> "1 - 31-45";
            case 2 -> "2 - 46-60";
            case 3 -> "3 - 60+";
            default -> throw new IllegalArgumentException("Błędna wartość");
        };
        System.out.println("grupa wiekowa: " + grupa_wiek);
        
        String edu = switch ((kod >> 5) & 0b11) {
            case 0 -> "0 - podstawowe";
            case 1 -> "1 - średnie";
            case 2 -> "2 - licencjat";
            case 3 -> "3 - magister";
            default -> throw new IllegalArgumentException("Błędna wartość");
        };
        System.out.println("wykształcenie: " + edu);
        
        String zam = switch ((kod >> 7) & 0b11) {
            case 0 -> "0 - wieś";
            case 1 -> "1 - miasto do 50 tys.";
            case 2 -> "2 - miasto 50-400 tys.";
            case 3 -> "3 - miasto +400 tys.";
            default -> throw new IllegalArgumentException("Błędna wartość");
        };
        System.out.println("miejsce zam.: " + zam);
        
        int region = (kod >> 9) & 0b1111;
        System.out.println("region: " + region);
        
        int odp = (kod >> 13) & 0b111;
        System.out.println("odpowiedź: " + odp);
    }
    
}
