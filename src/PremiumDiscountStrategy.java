public class PremiumDiscountStrategy implements DiscountStrategy{
    @Override
    public double calculateDiscount(double price) {
        return price * 0.2;
    }
}
