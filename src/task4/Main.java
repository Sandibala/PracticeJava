package task4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Money priceApple = new Money(new BigDecimal("10.50"));
        Money priceBanana = new Money(new BigDecimal("5.25"));

        OrderItem apple = new OrderItem("Apple", 3, priceApple);
        OrderItem banana = new OrderItem("Banana", 2, priceBanana);

        List<OrderItem> items = new ArrayList<>();
        items.add(apple);
        items.add(banana);

        Order order = new Order(items);

        System.out.println("Order has " + order.getItems().size() + " items");
        System.out.println("Total amount: " + order.totalAmount());
    }
}
