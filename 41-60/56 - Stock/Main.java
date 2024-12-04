public class Main {
    public static void main(String[] args) {
        Store myStore = new Store(0);
        Stock iphone = new Stock("iPhone", 14, 479);
        Stock macbook = new Stock("MacBook Air", 22, 1199);
        Stock appleWatch = new Stock("Apple Watch", 3, 399);
        System.out.println("Store balance: " + myStore.getBalance());
        System.out.println("Welcome to our store, that's what we have available to sell:");
        iphone.getDetails();
        macbook.getDetails();
        appleWatch.getDetails();

        myStore.sell(iphone, 1);
        myStore.sell(macbook, 3);
        myStore.sell(appleWatch, 2);
        myStore.sell(appleWatch, 2);


    }
}
