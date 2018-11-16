import java.util.Arrays;
import java.util.List;
import java.math.*;


public class Client {
  public static void main(String[] args) {
      
    System.out.println("Implementation of Strategy Pattern using Lambda in Java");
    
    List<Discount> discountStrategies = 
      Arrays.asList(
        (amount) -> {
                        System.out.println("Calculating Diwali Discount");
                        System.out.println(amount.multiply(BigDecimal.valueOf(0.5)));
                    },
        (amount) -> {
                        System.out.println("Calculating Christmas Discount");
                        System.out.println(amount.multiply(BigDecimal.valueOf(0.9)));
                    }
      );
    
      discountStrategies.forEach((elem) -> elem.applyDiscount(BigDecimal.valueOf(100)));
  }
  
}