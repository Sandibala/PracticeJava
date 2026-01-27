package task4;

import java.math.BigDecimal;

public class  OrderItem {
    private final String name;
    private final int quantity;
    private final Money price;

    public OrderItem(String name, int quantity, Money price) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("The name must not be empty!");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("The name must not be empty!");
        }
        if (price == null) {
            throw new IllegalArgumentException("Price cannot be null");
        }

        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Money total(){
        return new Money(BigDecimal.valueOf(priceAmount() * quantity));
    }
    private double priceAmount(){
        return Double.parseDouble(price.toString());
    }
}
