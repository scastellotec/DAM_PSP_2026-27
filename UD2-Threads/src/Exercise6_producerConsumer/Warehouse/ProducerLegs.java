package Exercise6_producerConsumer.Warehouse;

public class ProducerLegs implements Runnable{

    private Warehouse wh;

    public ProducerLegs(Warehouse wh) {
        this.wh = wh;
    }

    @Override
    public void run() {
        while(true){
            try {
                wh.storeLeg();
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
