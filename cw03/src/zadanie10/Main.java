package zadanie10;

public class Main {
    static void main() {
        // zadeklarowana zmienna b typu byte o wartości 176 w systemie oct i 126 dec
        byte b = 0176;
        // wartość zmiennej b w wyrażeniu ulega preinkrementacji i wyświetla się jej nowa wartość
        System.out.println(++b);
        // wartość zmiennej b w wyrażeniu ulega postinkrementacji i wyświetla się jej stara wartość
        System.out.println(b++);
        // wartość zmiennej przekroczyła maksymalny zakres dla typu byte i doszło do przepełnienia typu liczbowego
        // z tego powodu wynik zmienił się w minimalny zakres dla typu byte
        System.out.println(b);
    }
}
