public class MainOrder {
    public static void main(String[] args) {
        RegularOrder reg1 = new RegularOrder(1, 30, 5);
        RegularOrder reg2 = new RegularOrder(2, 40, 5);
        ExpressOrder exp1 = new ExpressOrder(1, 45, 2, 20);
        System.out.println(reg1);
        System.out.println(reg2);
        System.out.println(exp1);
    }
}
