import java.math.BigDecimal;
import java.math.*;

class Context{
    private Discount discountStrategy;

    Context(Discount discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    BigDecimal executeDiscountStrategy(BigDecimal amount){

        return discountStrategy.applyDiscount(amount);
    }
}