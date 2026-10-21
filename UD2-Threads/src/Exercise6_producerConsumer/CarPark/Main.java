package Exercise6_producerConsumer.CarPark;

import Exercise5_Starvation.Person;

public class Main {

    static void main() {
        CarPark carPark = new CarPark(4);

        for (int i = 0; i < 10; i++) {   // create and start 10 people
            new Thread(new Car(carPark, i)).start();
        }
    }
}
