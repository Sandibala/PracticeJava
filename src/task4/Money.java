package task4;

import java.math.BigDecimal;

public class Money {
    private final BigDecimal amount;
    public Money(BigDecimal amount) {
        if (amount == null){
            throw new IllegalArgumentException("The amount must not be 0!");
        }
        if (amount.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Amount must be more than 0!");
        }
        this.amount = amount;
    }

    public String toString(){
        return amount.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Money)) {
            return false;
        }

        Money money = (Money) o;
        return amount.compareTo(money.amount) == 0;
    }

    @Override
    public int hashCode() {
        return amount.hashCode();
    }
}
