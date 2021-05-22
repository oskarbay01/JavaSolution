package Day11;

/* ${@Author} created on 09.04.2021 inside the package - Day11 */
public class Warehouse {
    private int countOrder;
    private int balance;

    public Warehouse(int countOrder, int balance) {
        this.countOrder = countOrder;
        this.balance = balance;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }
}
