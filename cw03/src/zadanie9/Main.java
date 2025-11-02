package zadanie9;
import java.util.Scanner;

public class Main {
    static void main() {
        double celsiusTemp;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Wprowadź temperaturę w stopniach Celsjusza (°C): ");
        celsiusTemp = input.nextDouble();
        
        double fahrenheitTemp = celsiusTemp * 9/5 + 32;
        System.out.println("Temperatura " + celsiusTemp + " °C" + " odpowiada " + fahrenheitTemp + " °F");
        
        input.close();
    }
}
