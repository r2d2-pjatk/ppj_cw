package zadanie09;

public class Ticket {
    
    private static double basePrice;
    
    public static void setBasePrice(double newBasePrice) {
        basePrice = newBasePrice;
    }
    
    public static double getBasePrice() {
        return basePrice;
    }
    
    public static double getSum(Ticket[] tickets) {
        double ticketTotalPrice = 0;
        for (Ticket ticket : tickets) {
            ticketTotalPrice += ticket.getPrice();
        }
        return ticketTotalPrice;
    }
    
    public double getPrice() {
        return basePrice;
    }
    
}


class ReducedTicket extends Ticket {
    
    @Override
    public double getPrice() {
        return super.getPrice() * 0.5;
    }
    
}


class SeniorTicket extends Ticket {
    
    @Override
    public double getPrice() {
        if ((super.getPrice() - 5) <= 0)
            return 0;
        else
            return super.getPrice() - 5;
    }
    
}
