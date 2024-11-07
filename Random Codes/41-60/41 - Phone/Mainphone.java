public static void main(String[] ignoredArgs) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Cellphone> phones = new ArrayList<>();

    while (true) {
        System.out.println("Enter phone type (1 for CellPhone, 2 for SmartPhone, 0 to exit): ");
        int choice = -1;

        while (choice != 0 && choice != 1 && choice != 2) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice != 0 && choice != 1 && choice != 2) {
                    System.out.println("Invalid choice. Please enter 1 for CellPhone, 2 for SmartPhone, or 0 to exit.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number (1, 2, or 0): ");
                scanner.next();
            }
        }
        scanner.nextLine();

        if (choice == 0) {
            break;
        }

        System.out.println("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter model: ");
        String model = scanner.nextLine();
        System.out.println("Enter battery duration (in hours): ");
        double batteryDuration = scanner.nextDouble();
        scanner.nextLine();

        if (choice == 1) {
            Cellphone phone = new Cellphone(brand, model, batteryDuration);
            phones.add(phone);
        } else {
            System.out.println("Enter operating system: ");
            String os = scanner.nextLine();
            System.out.println("Enter storage (in GB): ");
            int storage = scanner.nextInt();
            scanner.nextLine();

            Smartphone phone = new Smartphone(brand, model, batteryDuration, os, storage);
            phones.add(phone);
        }
    }

    System.out.println("You have entered the following phones:");
    for (Cellphone phone : phones) {
        phone.displayInfo();
        System.out.println();
    }
}
