package Exercise6_producerConsumer.Warehouse;

public class Main {

    static void main() {

        // Shared resource
        Warehouse wh = new Warehouse();

        // Producers
        new Thread(new ProducerLegs(wh)).start();
        new Thread(new ProducerTops(wh)).start();

        // Consumer
        new Thread(new ConsumerTable(wh)).start();
    }
}
