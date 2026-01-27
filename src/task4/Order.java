package task4;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<OrderItem> items;
    public Order(List<OrderItem> items){
        if (items == null || items.isEmpty()){
            throw new IllegalArgumentException("fygbhnjkm");
        }
        this.items = items;
    }
    public  double totalAmount(){
        double sum = 0;
        for (OrderItem item :items){
            sum += Double.parseDouble(item.total().toString());
        }
        return sum;
    }

    public List<OrderItem> getItems() {
        return new ArrayList<>(items) ;
    }
}
