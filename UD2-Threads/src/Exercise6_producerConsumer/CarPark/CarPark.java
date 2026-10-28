package Exercise6_producerConsumer.CarPark;

public class CarPark {

    private int numerSpacesAvailable;

    public CarPark(int numerSpacesAvailable) {
        this.numerSpacesAvailable = numerSpacesAvailable;
    }

    public synchronized void park(int name) throws InterruptedException {
        // Check if there is space available
        while(numerSpacesAvailable <= 0){
            // there is no space available the car must wait
            System.out.println(name + " is waiting");
            wait();
        }

        // If there is place to park
        numerSpacesAvailable--;
        System.out.println(name + " is parked");

    }

    public synchronized void leave(int name){

        // The car leaves
        System.out.println(name + " left the parking");

        // Increment the spaces available
        numerSpacesAvailable++;

        // Wakeup waiting threads
        notifyAll();

    }
}
