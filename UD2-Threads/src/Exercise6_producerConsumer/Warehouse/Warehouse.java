package Exercise6_producerConsumer.Warehouse;

public class Warehouse {

    private final int MAX_LEGS = 6;
    private final int MAX_TOPS = 2;

    private int numberLegs = 0;
    private int numberTops = 0;
    private int tablesMade = 0;

    public Warehouse() {}

    synchronized void storeLeg() throws InterruptedException {
        // Check if can continue storing legs
        while( numberLegs >= MAX_LEGS){
            System.out.println("Max legs reached. Waiting");
            wait();
        }

        // Print that a leg is stored
        numberLegs++;
        System.out.println("New leg store: "+numberLegs+"/"+MAX_LEGS);

        //wake up the thread builtable
        notifyAll();
    }
    synchronized void storeTop() throws InterruptedException {
        // Check if can continue storing top
        while( numberTops >= MAX_TOPS){
            System.out.println("Max top reached. Waiting");
            wait();
        }

        // Print that a leg is stored
        numberTops++;
        System.out.println("New top store: "+numberTops+"/"+MAX_TOPS);

        //wake up the thread builtable
        notifyAll();
    }
    synchronized void buildTable() throws InterruptedException {

        // check if i have the needed materials
        while(numberTops<1 || numberLegs<4){
            System.out.println("Not ready for building. Legs: "+numberLegs +" - Tops: "+numberTops);
            wait();
        }

        // decrease the amount of items used
        numberLegs -= 4;
        numberTops -= 1;

        // increment tables made
        tablesMade++;

        // Print that a table is made
        System.out.println("A new table is made: "+tablesMade + " - Remain legs: "+numberLegs + " tops: "+numberTops);

        // wake up producers, new space in the warehouse available
        notifyAll();
    }


}
