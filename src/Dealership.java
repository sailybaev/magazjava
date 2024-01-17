import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private List<Car> inventoryCars;
    private List<Customer> customers;
    private List<Salesperson> salespersons;
    private List<Sale> sales;

    public Dealership() {
        inventoryCars = new ArrayList<>();
        customers = new ArrayList<>();
        salespersons = new ArrayList<>();
        sales = new ArrayList<>();
    }

    // Car Inventory Management

    public void addCarToInventory(Car car) {
        inventoryCars.add(car);
    }

    public void removeCarFromInventory(Car car) {
        inventoryCars.remove(car);
    }

    public List<Car> getAvailableCars() {
        List<Car> availableCars = new ArrayList<>();
        for (Car car : inventoryCars) {
            if (car.isAvailable()) {
                availableCars.add(car);
            }
        }
        return availableCars;
    }

    // Customer Management

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    // Salesperson Management

    public void addSalesperson(Salesperson salesperson) {
        salespersons.add(salesperson);
    }

    public List<Salesperson> getAllSalespersons() {
        return salespersons;
    }

    // Sales Management

    public void makeSale(Car car, Customer customer, Salesperson salesperson, double price) {
        if (inventoryCars.contains(car) && car.isAvailable() && customer.getBudget() >= price) {
            car.setAvailable(false);
            customer.setBudget(customer.getBudget() - price);
            Sale sale = new Sale(car, customer, salesperson, java.time.LocalDate.now(), price);
            sales.add(sale);
        } else {
            System.out.println("Unable to make the sale.");
        }
    }

    public List<Sale> getAllSales() {
        return sales;
    }
}
