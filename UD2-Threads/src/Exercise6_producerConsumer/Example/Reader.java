package Exercise6_producerConsumer.Example;

public class Reader extends Thread {
    private final Buffer buffer;
    private final int length;

    public Reader(Buffer buffer, int length) {
        this.buffer = buffer;
        this.length = length;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < length; i++) {
                System.out.println(buffer.get());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
