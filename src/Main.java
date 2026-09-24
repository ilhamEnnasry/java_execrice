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

        // overload
        double discount1 = RCustomer.calculateDiscount(200);
        double discount2 = PCustomer.calculateDiscount(350, 10);

        //System.out.println("the first discount is " + discount1);
        //System.out.println("the second discount is " + discount2);

        // equals
        //System.out.println(RCustomer.equals(PCustomer));

        // hashCode
        //System.out.println(RCustomer.hashCode());
        //System.out.println(PCustomer.hashCode());

        // List
        List<Customer> customersList = new ArrayList<>();
        customersList.add(PCustomer);
        customersList.add(RCustomer);
        System.out.println("List size: " + customersList.size());
        System.out.println(customersList);

        // Hashset
        Set<Customer> customerSet = new HashSet<>();
        customerSet.add(RCustomer);
        customerSet.add(PCustomer);
        System.out.println("Set size: " + customerSet.size());
        System.out.println(customerSet);

        // HashMap
        Map<Integer, Customer> customerMap = new HashMap<>();

        customerMap.put(1, RCustomer);
        customerMap.put(1, PCustomer);

        System.out.println("HashMap size: " + customerMap.size());
        System.out.println(customerMap);

        System.out.println(customerMap.get(1));
    }
}