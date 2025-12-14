package zadanie04;

public class CalculatingDevice {
    
    protected String deviceName;
    
    public CalculatingDevice(String deviceName) {
        this.deviceName = deviceName;
    }
    
    public static void printRes(CalculatingDevice[] a, double x, double y) {
        for (CalculatingDevice device : a) {
            System.out.println(device.calculate(x, y));
        }
    }
    
    public String calculate(double x, double y) {
        return deviceName + ": " + x + "+" + y + "=" + (x + y);
    }
    
}


class Calculator extends CalculatingDevice {
    
    public Calculator(String calculatorName) {
        super(calculatorName);
    }
    
    @Override
    public String calculate(double x, double y) {
        return super.calculate(x, y) + "; " +
                x + "-" + y + "=" + (x - y);
    }
    
}


class Computer extends Calculator {
    
    public Computer(String computerName) {
        super(computerName);
    }
    
    @Override
    public String calculate(double x, double y) {
        return super.calculate(x, y) + "; " +
                x + "*" + y + "=" + (x * y) + "; " +
                x + "/" + y + "=" + (x / y);
    }
}
