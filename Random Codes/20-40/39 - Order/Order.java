public class Order {
    private final int orderNumber;
    private final double totalValue;
    private int deliveryTime;

    public Order(int orderNumber, double totalValue, int deliveryTime) {
        this.orderNumber = orderNumber;
        this.totalValue = totalValue;
        this.deliveryTime = deliveryTime;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }
}
