package Exercise6_producerConsumer.Warehouse;

public class ProducerTops  implements Runnable{

    private Warehouse wh;

    public ProducerTops(Warehouse wh) {
        this.wh = wh;
    }

    @Override
    public void run() {
        while(true){
            try {
                wh.storeTop();
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
