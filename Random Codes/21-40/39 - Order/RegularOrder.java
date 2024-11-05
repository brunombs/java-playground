public class RegularOrder extends Order {
    public RegularOrder(int orderNumber, double totalValue, int deliveryTime) {
        super(orderNumber, totalValue, deliveryTime);
    }

    @Override
    public String toString() {
        return "Regular Order\n" +
                "Order number: " + getOrderNumber() +
                "\nDelivery time: " + getDeliveryTime()
                + " days \nTotal value: " + getTotalValue()
                + "$\n--------------------------";
    }
}
