public class Main {
    public static void main(String[] args) {
        Store myStore = new Store(0);
        Stock iphone = new Stock("iPhone", 14, 479);
        Stock macbook = new Stock("MacBook Air", 22, 1199);
        Stock appleWatch = new Stock("Apple Watch", 8, 399);
        System.out.println("Store balance: " + myStore.getBalance());
        iphone.getDetails();
        //macbook.getDetails();
        //appleWatch.getDetails();

        myStore.sell(iphone, 1);
        iphone.getDetails();
        System.out.println("Store balance: " + myStore.getBalance());

    }
}
