public class MainOrder {
    public static void main(String[] args) {
        RegularOrder reg1 = new RegularOrder(1, 30, 5);
        RegularOrder reg2 = new RegularOrder(2, 40, 5);
        ExpressOrder exp1 = new ExpressOrder(1, 45, 3, 20);
        ExpressOrder exp2 = new ExpressOrder(2, 125, 2, 35.49);
        System.out.println(reg1);
        System.out.println(reg2);
        System.out.println(exp1);
        System.out.println(exp2);
    }
}
