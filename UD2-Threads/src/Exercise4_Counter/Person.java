package Exercise4_Counter;

import java.util.concurrent.atomic.AtomicInteger;

public class Person implements Runnable{

    private SavingAccount savingAccount;

    public Person(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            savingAccount.addMoney();
        }
    }
}
