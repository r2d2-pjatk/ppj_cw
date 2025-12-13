package zadanie02;

public class Temperature {
    
    private double temperature;
    
    public Temperature(double tm, char unit) {
        this.temperature = switch (unit) {
            case 'C' -> tm;
            case 'K' -> tm - 273.15;
            case 'F' -> 5. / 9 * (tm - 32);
            default -> throw new IllegalArgumentException("Nieprawidłowa jednostka");
        };
    }
    
    public double getInC() {
        return temperature;
    }
    
    public double getInF() {
        return 9. / 5 * temperature + 32;
    }
    
    public double getInK() {
        return temperature + 273.15;
    }
}
