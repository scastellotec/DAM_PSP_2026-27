package Exercise6_producerConsumer.Warehouse;

public class ConsumerTable implements Runnable{

    private Warehouse wh;

    public ConsumerTable(Warehouse wh) {
        this.wh = wh;
    }

    @Override
    public void run() {
        while(true){
            wh.buildTable();
        }
    }
}

