package zadanie09;

public class Main {
    public static void main(String[] args) {
        Ticket[] tickets = {
                new Ticket(), new ReducedTicket(),
                new Ticket(), new SeniorTicket()
        };
        
        Ticket.setBasePrice(4.50);
        System.out.printf("Base price = %4.2f; Sum = %5.2f\n",
                Ticket.getBasePrice(), Ticket.getSum(tickets));
        
        Ticket.setBasePrice(6.60);
        System.out.printf("Base price = %4.2f; Sum = %5.2f\n",
                Ticket.getBasePrice(), Ticket.getSum(tickets));
    }
}
