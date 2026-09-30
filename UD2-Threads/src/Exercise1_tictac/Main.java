package Exercise1_tictac;

public class Main {
    static void main() throws InterruptedException {
        // Create and declare the thread
        Thread threadTic = new Thread(new TicRunnable());
        Thread threadTac = new Thread(new TacRunnable());

        System.out.println("Inicio del programa");

        // Set ready to run the thread
        threadTic.start();
        threadTac.start();

        // forcing the main thead to wait for the other threads to finish
        threadTac.join();
        threadTic.join();

        System.out.println("Fin del programa");
    }
}
