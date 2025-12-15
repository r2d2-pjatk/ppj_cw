package zadanie01;

public class Car {
    
    private int fuelAmount = 35;
    private int odometerValue = 0;
    
    public void fill() {
        double probabilityOfExplosion = (int) (Math.random() * 101) / 100.0;
        if (probabilityOfExplosion <= 0.1) {
            throw new ExplosionException("BOOM");
        } else {
            int extraFuel = (int) (Math.random() * (35 - 15 + 1) + 15);
            this.fuelAmount += extraFuel;
            System.out.println("After filling " + this.fuelAmount);
        }
    }
    
    public void drive100km() throws NoGasException {
        if (this.fuelAmount < 10) {
            throw new NoGasException(
                "Only " + this.fuelAmount + " liters. " +
                "Must fill the tank"
            );
        } else {
            this.fuelAmount -= 10;
            this.odometerValue += 100;
            System.out.println(
                this.odometerValue + "km driven" + ", " +
                this.fuelAmount + " liters left"
            );
        }
    }
    
}
