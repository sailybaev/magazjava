import java.util.Scanner;

public class Main {
    private static Dealership dealership = new Dealership();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addCar(scanner);
                    break;
                case 2:
                    addCustomer(scanner);
                    break;
                case 3:
                    addSalesperson(scanner);
                    break;
                case 4:
                    makeSale(scanner);
                    break;
                case 5:
                    displayInventory();
                    break;
                case 6:
                    displayCustomers();
                    break;
                case 7:
                    displaySalespersons();
                    break;
                case 8:
                    displaySales();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 9);
    }

    private static void displayMenu() {
        System.out.println("\nDealership Management System");
        System.out.println("1. Add Car to Inventory");
        System.out.println("2. Add Customer");
        System.out.println("3. Add Salesperson");
        System.out.println("4. Make a Sale");
        System.out.println("5. Display Inventory");
        System.out.println("6. Display Customers");
        System.out.println("7. Display Salespersons");
        System.out.println("8. Display Sales");
        System.out.println("9. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addCar(Scanner scanner) {
        System.out.println("Enter car details:");
        System.out.print("Make: ");
        String make = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Car car = new Car(make, model, year, price);
        dealership.addCarToInventory(car);
        System.out.println("Car added to inventory.");
    }

    private static void addCustomer(Scanner scanner) {
        System.out.println("Enter customer details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Contact: ");
        String contact = scanner.nextLine();
        System.out.print("Budget: ");
        double budget = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Customer customer = new Customer(name, contact, budget);
        dealership.addCustomer(customer);
        System.out.println("Customer added.");
    }

    private static void addSalesperson(Scanner scanner) {
        System.out.println("Enter salesperson details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("ID: ");
        String id = scanner.nextLine();

        Salesperson salesperson = new Salesperson(name, id);
        dealership.addSalesperson(salesperson);
        System.out.println("Salesperson added.");
    }

    private static void makeSale(Scanner scanner) {
        System.out.println("Enter sale details:");
        // Get car, customer, and salesperson details...
        // Implement your logic here using dealership.makeSale(...)
    }

    private static void displayInventory() {
        System.out.println("Inventory:");
        for (Car car : dealership.getAvailableCars()) {
            System.out.println(car);
        }
    }

    private static void displayCustomers() {
        System.out.println("Customers:");
        for (Customer customer : dealership.getAllCustomers()) {
            System.out.println(customer);
        }
    }

    private static void displaySalespersons() {
        System.out.println("Salespersons:");
        for (Salesperson salesperson : dealership.getAllSalespersons()) {
            System.out.println(salesperson);
        }
    }

    private static void displaySales() {
        System.out.println("Sales:");
        for (Sale sale : dealership.getAllSales()) {
            System.out.println(sale);
        }
    }
}
