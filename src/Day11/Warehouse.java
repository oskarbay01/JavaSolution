package Day11;

/**
 * На складе происходит сборка и упаковка интернет-заказа.
 * Создайте классы:
 * - “Склад” (англ. Warehouse ). Поля: countOrder (количество собранных
 * заказов), balance (доход от доставленных заказов). Get и set методы для
 * обоих полей. Для получения информации о значениях полей склада
 * переопределите метод toString() .
 * - “Сборщик” (англ. Picker ), с полем salary , только get метод.
 * - “Курьер” (англ. Courier ), с полем salary , только get метод.
 */
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
