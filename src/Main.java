public class Main {
    public static void main(String[] args) {

        //Create Regular Customer
        Customer RCustomer = new Customer();
        RCustomer.name = "Regular ilham";
        RCustomer.age = 30;
        RCustomer.customerId = 5;
        RCustomer.type = CustomerType.REGULAR;


        // Create Premium Customer
        Customer PCustomer = new Customer();
        PCustomer.name = "Premium ilham";
        PCustomer.age = 35;
        PCustomer.customerId = 5;
        PCustomer.type = CustomerType.PREMIUM;

        // toString
        System.out.println(RCustomer);
        System.out.println(PCustomer);

        //override
        RCustomer.introduce();
        PCustomer.introduce();

        // interface method
        RCustomer.pay();

        // overload
        double discount1 = RCustomer.calculateDiscount(200);
        double discount2 = PCustomer.calculateDiscount(350, 10);

        System.out.println("the first discount is " + discount1);
        System.out.println("the second discount is " + discount2);

        // equals
        System.out.println(RCustomer.equals(PCustomer));

        // hashCode
        System.out.println(RCustomer.hashCode());
        System.out.println(PCustomer.hashCode());

    }
}