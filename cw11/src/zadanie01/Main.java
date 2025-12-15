package zadanie01;

public class Main {
    public static void main (String[] args) {
        Car car = new Car();
        while (true) {
            try {
                car.drive100km();
            } catch (NoGasException e) {
                System.out.println(e.getMessage());
                car.fill();
            }
        }
    }
}
