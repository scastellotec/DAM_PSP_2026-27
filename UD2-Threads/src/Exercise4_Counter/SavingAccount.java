package Exercise4_Counter;

public class SavingAccount {

    private int money;

    public SavingAccount(int money) {
        this.money = money;
    }

    public synchronized void addMoney(){
        money++;
    }

    public int getMoney() {
        return money;
    }
}
