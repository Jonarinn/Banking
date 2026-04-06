package forex;

import java.math.BigDecimal;

public class Money {
    public Money(Currency currency) {}
    private Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    private BigDecimal amount;
}
