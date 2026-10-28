package Exercise6_producerConsumer.Example;

public class Buffer {
    private char content;
    private boolean full = false;

    public synchronized char get() throws InterruptedException {
        while (!full) {
            wait();
        }
        full = false;
        notify();
        return content;
    }

    public synchronized void put(char value) throws InterruptedException {
        while (full) {
            wait();
        }
        content = value;
        full = true;
        notify();
    }
}
