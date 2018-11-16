import java.math.BigDecimal;
import java.math.*;
public class ChristmasDiscount implements Discount {
    @Override
    public BigDecimal applyDiscount(final BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.9));
    }
 }