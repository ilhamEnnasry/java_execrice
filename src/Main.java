import java.util.*;

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
        //System.out.println(RCustomer);
        //System.out.println(PCustomer);

        //override
        //RCustomer.introduce();
        //PCustomer.introduce();

        // interface method
        //RCustomer.pay();

        // Assign the appropriate discount strategy to each customer
        RCustomer.setDiscountStategy(new RegularDiscountStrategy());
        PCustomer.setDiscountStategy(new PremiumDiscountStrategy());

        double regularDiscount = RCustomer.calculateDiscount(200);
        double premiumDiscount = PCustomer.calculateDiscount(200);

        System.out.println("Regular Customer discount is " + regularDiscount);
        System.out.println("Premium Customer discount is " + premiumDiscount);

        // equals
        //System.out.println(RCustomer.equals(PCustomer));

        // hashCode
        //System.out.println(RCustomer.hashCode());
        //System.out.println(PCustomer.hashCode());

        // List
        List<Customer> customersList = new ArrayList<>();
        customersList.add(PCustomer);
        customersList.add(RCustomer);
        System.out.println("Printing a list of any type:");
        printList(customersList);
        //System.out.println("List size: " + customersList.size());
        //System.out.println(customersList);

        // Super Customer
        List<Customer> customers = new ArrayList<>();
        addCustomer(customers);
        System.out.println("Adding a Customer to the list with super");
        printList(customers);

        // Hashset
        Set<Customer> customerSet = new HashSet<>();
        //customerSet.add(RCustomer);
        //customerSet.add(PCustomer);
        //System.out.println("Set size: " + customerSet.size());
        //System.out.println(customerSet);

        // HashMap
        Map<Integer, Customer> customerMap = new HashMap<>();

        customerMap.put(1, RCustomer);
        customerMap.put(1, PCustomer);
        System.out.println("Reading a Customer from the list with extend");
        printCustomers(customersList);

        //System.out.println("HashMap size: " + customerMap.size());
        //System.out.println(customerMap);

        //System.out.println(customerMap.get(1));

        // Generic Class
        CustomerBox<Customer> box = new CustomerBox<>(RCustomer);
        CustomerBox<String> stringbox = new CustomerBox<>("welcome");
        CustomerBox <Integer> intBox = new CustomerBox<> (456);
        System.out.println(box.getValue());
        System.out.println(stringbox.getValue());
        System.out.println(intBox.getValue());

        //Bounded Generics
        Customer customerBounded = new Customer();
        customerBounded.name = "Bounded Customer";
        customerBounded.age = 35;
        customerBounded.customerId = 10;
        customerBounded.type = CustomerType.REGULAR;

        CustomerBoxBounded<Customer> CustomerBounded = new CustomerBoxBounded<> (customerBounded);
        System.out.println(CustomerBounded.getValue());

    }

    public static void printList (List<?> list) {
        System.out.println(list);
    }

    public static void addCustomer(List<? super Customer> list) {

        Customer customer = new Customer();
        customer.name = "Super Customer";
        customer.age = 35;
        customer.customerId = 10;
        customer.type = CustomerType.REGULAR;

        list.add(customer);

    }

    public static void printCustomers(List<? extends Customer> list) {

        Customer customer = list.get(0);

        customer.introduce();
    }
}