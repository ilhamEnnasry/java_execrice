public class Customer extends Person implements Payable{
    int customerId;
    CustomerType type;

    //override
    @Override
    public void introduce() {
        System.out.println("I am a customer and my name is" + name);
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

    @Override
    public String toString() {
        return "Customer information: " +
                "Name: " + name +
                ", Age: " + age +
                ", Customer ID: " + customerId +
                ", Type: " + type;
    }

    // equals
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Customer)) {
            return false;
        }

        Customer other = (Customer) obj; // Casting

        return customerId == other.customerId;
    }

    // hashCode
    @Override
    public int hashCode() {
        return Integer.hashCode(customerId);
    }
}
