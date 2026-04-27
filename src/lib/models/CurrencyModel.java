package lib.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class CurrencyModel extends BaseModel {
    @Column(unique = true, nullable = false)
    private String code;
    public String getCode() {
        return code;
    }

    @Column(nullable = false)
    private BigDecimal rate;
    public BigDecimal getRate() {
        return rate;
    }
}
