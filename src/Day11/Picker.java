package Day11;

/* ${@Author} created on 09.04.2021 inside the package - Day11 */
public class Picker implements Worker{
    private int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
     salary+=100;
    }

    @Override
    public void bonus() {

    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}
