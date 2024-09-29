public class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter a = new Counter();
        Counter b = new Counter();
        Counter c = new Counter();
        Counter d = new Counter();
        Counter e = new Counter();
        System.out.println(Counter.getCount());

    }
}
