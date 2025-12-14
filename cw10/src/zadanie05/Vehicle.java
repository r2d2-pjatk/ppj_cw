package zadanie05;

public class Vehicle {
    
    private String name;
    private int price;
    private double mpg;
    
    public Vehicle(String n, int p, double f) {
        this.name = n;
        this.price = p;
        this.mpg = f;
    }
    
    public static void sort(Vehicle[] vs) {
        for (int i = 0; i < vs.length - 1; i++) {
            int minValIndex = i;
            for (int j = i + 1; j < vs.length; j++) {
                if (vs[j].compareTo(vs[minValIndex]) < 0)
                    minValIndex = j;
            }
            Vehicle temp = vs[minValIndex];
            vs[minValIndex] = vs[i];
            vs[i] = temp;
        }
    }
    
    public String getName() {
        if (this.getClass().equals(Vehicle.class))
            throw new UnsupportedOperationException();
        return name;
    }
    
    public int getPrice() {
        if (this.getClass().equals(Vehicle.class))
            throw new UnsupportedOperationException();
        return price;
    }
    
    public double getMpg() {
        if (this.getClass().equals(Vehicle.class))
            throw new UnsupportedOperationException();
        return mpg;
    }
    
    public int compareTo(Vehicle v) {
        boolean isThisCar = this.getClass().equals(Car.class);
        boolean isOtherCar = v.getClass().equals(Car.class);
        boolean isThisBicycle = this.getClass().equals(Bicycle.class);
        boolean isOtherBicycle = v.getClass().equals(Bicycle.class);
        
        boolean isThisBicycleAndOtherCar = isThisBicycle && isOtherCar;
        boolean isThisCarAndOtherBicycle = isThisCar && isOtherBicycle;
        boolean areBothBicycle = isThisBicycle && isOtherBicycle;
        boolean areBothCar = isThisCar && isOtherCar;
        
        boolean isThisCheaperBicycle = areBothBicycle && (this.getPrice() < v.getPrice());
        boolean isOtherCheaperBicycle = areBothBicycle && (this.getPrice() > v.getPrice());
        boolean isThisHasGreaterMPG = areBothCar && (this.getMpg() > v.getMpg());
        boolean isOtherHasGreaterMPG = areBothCar && (this.getMpg() < v.getMpg());

        if (isThisBicycleAndOtherCar || isThisCheaperBicycle || isThisHasGreaterMPG) {
            return -1;
        } else if (isThisCarAndOtherBicycle || isOtherCheaperBicycle || isOtherHasGreaterMPG) {
            return 1;
        } else {
            return 0;
        }
    }
    
    @Override
    public String toString() {
        if (this.getClass().equals(Bicycle.class)) {
            return this.getClass().getName() + " " +
                    this.getName() + "($" + this.getPrice() + ")";
        }
        else if (this.getClass().equals(Car.class)) {
            return this.getClass().getName() + " " +
                    this.getName() + "($" + this.getPrice() + "; "
                    + "fc=" + this.getMpg() + ")";
        }
        return null;
    }
    
}


class Car extends Vehicle {
    
    public Car(String n, int p, double f) {
        super(n, p, f);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}


class Bicycle extends Vehicle {
    
    public Bicycle(String n, int p) {
        super(n, p, 0);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
