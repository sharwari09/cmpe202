import java.math.BigDecimal;
import java.math.*;

public interface Discount {
    void applyDiscount(BigDecimal amount);
}