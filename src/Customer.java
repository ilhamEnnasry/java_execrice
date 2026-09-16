public class Customer extends Person implements Payable{
    int customerId;
    CustomerType type;

    //override
    @Override
    public void introduce() {
        System.out.println("I am a customer and my name is " + name);
    }

    //Overloding
    public double calculateDiscount(double price) {
        return price * 0.10;
    }
    public double calculateDiscount(double price, double discount) {
        return price * discount / 100;
    }

    // interface method
    @Override
    public void pay() {
        System.out.println("Customer is paying ");
    }
}
