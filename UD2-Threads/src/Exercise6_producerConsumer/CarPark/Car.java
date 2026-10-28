package Exercise6_producerConsumer.CarPark;

public class Car implements Runnable {

    private CarPark carPark;
    private int name;

    public Car(CarPark carPark, int name) {
        this.carPark = carPark;
        this.name = name;
    }

    @Override
    public void run() {

        try {
            // Car attemps to park
            carPark.park(name);
            // wait some time parked
            Thread.sleep(5000);
            // leave the parking
            carPark.leave(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
