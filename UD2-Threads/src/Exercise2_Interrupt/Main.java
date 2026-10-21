package Exercise2_Interrupt;

import static java.lang.Thread.sleep;

public class Main {
    static void main() throws InterruptedException {
        Thread t1 = new Thread(new Worker());
        t1.start();

        sleep(2000);

        t1.interrupt();
        t1.stop();
        System.out.println("Main ends");
    }
}
