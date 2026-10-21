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
        // Car attemps to park
        carPark.park();
        System.out.println(name + " is parked");

        // Wait some time
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Car leves
        carPark.leave();
        System.out.println(name + " left the parking");
    }
}
