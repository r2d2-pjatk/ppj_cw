package zadanie02;

public class Bank {

    public static final int MAX_DEBET = 50;
    
    private Customer[] customers;
    
    public Bank(Customer[] customers) {
        this.customers = customers;
    }
    
    public Customer getCustomerByName(String name)
            throws NoSuchCustomerException {
        for (Customer customer : customers) {
            if (customer.getName().equals(name))
                return customer;
        }
        throw new NoSuchCustomerException();
    }
    
    public void deposit(String name, int amount) {
        try {
            Customer customer = this.getCustomerByName(name);
            customer.deposit(amount);
            System.out.println(name + ": deposit " + amount);
        } catch (NoSuchCustomerException nsce) {
            System.out.println("Cancelled: No such customer: " + name);
        } catch (NegativeAmountException nae) {
            System.out.println("Cancelled: amount negative");
        }
    }
    
    public void withdraw(String name, int a) {
        try {
            Customer customer = this.getCustomerByName(name);
            customer.withdraw(a);
            System.out.println(name + ": withdrawal " + a);
        } catch (NoSuchCustomerException nsce) {
            System.out.println("Cancelled: No such customer: " + name);
        } catch (NegativeAmountException nae) {
            System.out.println("Cancelled: amount negative");
        } catch (InsufficientFundsException ife) {
            System.out.println("Cancelled: insufficient funds");
        }
        
        int sumOfCustomersBalance = 0;
        for (Customer customer : customers) {
            sumOfCustomersBalance += customer.getBalance();
        }
        if (sumOfCustomersBalance < 0)
            throw new BankruptcyException("\n\t\tBank went bankrupt!!!");
    }

}
