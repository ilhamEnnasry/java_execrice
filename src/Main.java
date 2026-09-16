import java.math.BigDecimal;
import java.text.NumberFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        PCustomer.customerId = 7;
        PCustomer.type = CustomerType.PREMIUM;

        //override
        RCustomer.introduce();
        PCustomer.introduce();

        // interface method
        RCustomer.pay();

        // overload
        double discount1 = RCustomer.calculateDiscount(200);
        double discount2 = PCustomer.calculateDiscount(350, 10);

        System.out.println("the first discont is " + discount1);
        System.out.println("the second discount is " + discount2);
    }
}