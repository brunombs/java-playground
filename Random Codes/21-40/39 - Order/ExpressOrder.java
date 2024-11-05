public class ExpressOrder extends Order{
    private final double expressFee;

    public ExpressOrder(int orderNumber, double totalValue, int deliveryTime, double expressFee) {
        super(orderNumber, totalValue, deliveryTime);
        this.expressFee = expressFee;
    }

    public double getExpressFee() {
        return expressFee;
    }

    @Override
    public double getTotalValue() {
        return super.getTotalValue() + getExpressFee();
    }


    @Override
    public String toString() {
        return "Express Order\n" +
                "Order number: " + getOrderNumber() +
                "\nDelivery time: " + getDeliveryTime() +
                " days \nTotal value: " + getTotalValue()
                + "$\n" +
                "Express Fee: " + getExpressFee() +
                "\n--------------------------";
    }
}
