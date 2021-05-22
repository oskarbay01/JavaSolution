package Day11;

public class Courier implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary+=80;

    }

    @Override
    public void bonus() {

    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}
