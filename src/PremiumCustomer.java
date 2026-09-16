public class PremiumCustomer extends Customer {

    //Override
    @Override
    public void introduce() {
        System.out.println("I am a premium customer and my name is " + name);
    }
}
