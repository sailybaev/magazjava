import java.time.LocalDate;

public class Sale {
    private Car car;
    private Customer customer;
    private Salesperson salesperson;
    private LocalDate date;
    private double price;

    public Sale(Car car, Customer customer, Salesperson salesperson, LocalDate date, double price) {
        this.car = car;
        this.customer = customer;
        this.salesperson = salesperson;
        this.date = date;
        this.price = price;
    }


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Salesperson getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(Salesperson salesperson) {
        this.salesperson = salesperson;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "car=" + car +
                ", customer=" + customer +
                ", salesperson=" + salesperson +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
