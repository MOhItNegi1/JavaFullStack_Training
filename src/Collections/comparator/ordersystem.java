package Collections.comparator;

import java.util.Arrays;
import java.util.Comparator;

class Order implements Comparator<Order> {
    int orderID;
    String customerName;
    double orderAmount;
    int itemCount;
    long orderTime;

    Order(int orderID, String customerName, double orderAmount, int itemCount, long orderTime) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.orderAmount = orderAmount;
        this.itemCount = itemCount;
        this.orderTime = orderTime;
    }

    @Override
    public int compare(Order o1, Order o2) {
        // Higher orderAmount first
        if (o1.orderAmount != o2.orderAmount) {
            return Double.compare(o2.orderAmount, o1.orderAmount);
        }
        // Fewer itemCount first
        if (o1.itemCount != o2.itemCount) {
            return Integer.compare(o1.itemCount, o2.itemCount);
        }
        // Earlier orderTime first
        if (o1.orderTime != o2.orderTime) {
            return Long.compare(o1.orderTime, o2.orderTime);
        }
        // customerName in ascending order
        if (!o1.customerName.equals(o2.customerName)) {
            return o1.customerName.compareTo(o2.customerName);
        }
        // orderId in ascending order
        return Integer.compare(o1.orderID, o2.orderID);
    }

    @Override
    public String toString() {
        return "Order{ID=" + orderID + ", Name='" + customerName + '\'' +
                ", Amount=" + orderAmount + ", Items=" + itemCount +
                ", Time=" + orderTime + '}';
    }
}

public class ordersystem {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 500.0, 3, 1000),
            new Order(2, "Bob", 500.0, 2, 1000),
            new Order(3, "Charlie", 600.0, 2, 1000),
            new Order(4, "Alice", 500.0, 2, 1000),
            new Order(5, "Zoe", 500.0, 2, 900)
        };

        // Create a dummy Order object to access compare() method
        Order comparator = new Order(0, "", 0, 0, 0);
        Arrays.sort(orders, comparator);

        System.out.println("Sorted Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}