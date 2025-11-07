package zadanie3;
import javax.swing.JOptionPane;
import java.awt.*;
import java.util.Scanner;
import java.lang.Math;


public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);
        double height, weight, bmi;
        
        IO.print("Jaki jest twój wzrost (w metrach)?: ");
        height = input.nextDouble();
        
        IO.print("Jaka jest twoja waga (w kilogramach)?: ");
        weight = input.nextDouble();
        
        bmi = weight / Math.pow(height, 2);
        JOptionPane.showMessageDialog(null, "Twój współczynnik BMI wynosi " + bmi);
    }
}
