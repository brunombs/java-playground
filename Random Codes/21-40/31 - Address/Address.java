public class Address {
    String street;
    int number;
    String city;
    String state;
    String zipCode;

    public Address(String street, int number, String city, String state, String zipCode) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public static void main(String[] args) {
        Address address = new Address("Fifth Avenue", 10, "New York", "New York", "05000");

        System.out.println(address.getStreet());
        System.out.println(address.getNumber());
        System.out.println(address.getCity());
        System.out.println(address.getState());
        System.out.println(address.getZipCode());

        address.setStreet("Rua Brasil");
        address.setNumber(42);
        address.setCity("Salvador");
        address.setState("Bahia");
        address.setZipCode("50000");

        System.out.println(address.getStreet());
        System.out.println(address.getNumber());
        System.out.println(address.getCity());
        System.out.println(address.getState());
        System.out.println(address.getZipCode());
    }
}
