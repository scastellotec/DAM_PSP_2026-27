package Exercise6_producerConsumer.CarPark;

public class CarPark {

    private int numerSpacesAvailable;

    public CarPark(int numerSpacesAvailable) {
        this.numerSpacesAvailable = numerSpacesAvailable;
    }

    public void park(){
        // Comprobar si hay hueco para que un coche aparque
            // si no hay hueco wait()

        // Reduce by 1 the number of available spaces
    }

    public void leave(){

        // The car leaves

        // Increment the spaces available

        // despertar a hilos dormidos que no han podido aparcar y estan en wait()
        // se despierta con notify
    }
}
