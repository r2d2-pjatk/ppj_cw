package zadanie4;

public class Main {
    static void main(String[] args) {
        // literał 12.34567E2 ma taką samą wartość, z notacją wykładniczą 10^2
        System.out.println("Literał " + 1234.567 + " == " + 12.34567E2 + ": " + (1234.567 == 12.34567E2));
        System.out.println("Literał " + 1234.567 + " == " + 1.234567E06 + ": " + (1234.567 == 1.234567E06));
        // literał 1234567E-3 ma taką samą wartość, z notacją wykładniczą 10^-3
        System.out.println("Literał " + 1234.567 + " == " + 1234567E-3 + ": " + (1234.567 == 1234567E-3));
    }
}
