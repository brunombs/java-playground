public class MainOrder {
    public static void main(String[] args) {
        RegularOrder reg1 = new RegularOrder(1, 30, 5);
        RegularOrder reg2 = new RegularOrder(2, 4, 6);
        ExpressOrder exp1 = new ExpressOrder(1, 45, 20, 2);
        System.out.println(reg1);
        System.out.println(reg2);
        System.out.println(exp1);
    }
}
