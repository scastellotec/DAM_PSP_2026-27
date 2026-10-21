package Exercise4_Counter;

public class Main {

    static void main() throws InterruptedException {

        // Create a shared resource between two or more threads
        SavingAccount sa = new SavingAccount(0);

        // Create the threads
        Thread alex = new Thread(new Person(sa));
        Thread lizer = new Thread(new Person(sa));

        // Start both threads
        alex.start();
        lizer.start();

        // Wait for both threads to end
        alex.join();
        lizer.join();

        // Print the money in the saving account
        System.out.println(sa.getMoney());

    }
}
