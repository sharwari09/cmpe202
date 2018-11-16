import java.math.BigDecimal;
import java.math.*;

class Client{
    public static void main(String[] args){

        System.out.println("Calculating Diwali Discount..");
        Context discountContext = new Context(new DiwaliDiscount());
        BigDecimal discount = discountContext.executeDiscountStrategy(BigDecimal.valueOf(100));

        System.out.println("Diwali Discount :  " + discount);

        System.out.println("Calculating Christmas Discount..");
        discountContext = new Context(new ChristmasDiscount());
        discount = discountContext.executeDiscountStrategy(BigDecimal.valueOf(100));

        System.out.println("Christmas Discount :  " + discount);

    }
}