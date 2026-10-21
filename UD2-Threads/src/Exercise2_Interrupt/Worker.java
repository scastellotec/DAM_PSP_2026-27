package Exercise2_Interrupt;

public class Worker implements Runnable{

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("I'm working ...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("I was sleeping and detect and interruption");
            }
        }
        System.out.println("Cleanly stopped");

    }
}
