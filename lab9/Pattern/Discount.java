import java.math.BigDecimal;
import java.math.*;

public interface Discount {
    BigDecimal applyDiscount(BigDecimal amount);
}