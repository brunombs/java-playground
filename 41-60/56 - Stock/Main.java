public class Main {
    public static void main(String[] args) {
        Stock iphone = new Stock("iPhone", 14, 479);
        Stock macbook = new Stock("MacBook Air", 22, 1199);
        Stock appleWatch = new Stock("Apple Watch", 8, 399);

        iphone.getDetails();
        macbook.getDetails();
        appleWatch.getDetails();
    }
}
