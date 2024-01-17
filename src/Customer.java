public class Customer {
    private String name;
    private String contact;
    private double budget;
    private int id;

    public static int idcnt = 1;

    public Customer(String name, String contact, double budget) {
        this.name = name;
        this.contact = contact;
        this.budget = budget;
        this.id = idcnt++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", budget=" + budget +
                ", id=" + id +
                '}';
    }

}
