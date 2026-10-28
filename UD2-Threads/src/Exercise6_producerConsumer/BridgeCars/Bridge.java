package Exercise6_producerConsumer.BridgeCars;

public class Bridge {

    private int nCochesNorte = 0;
    private int nCochesSur = 0;
    private boolean isBusy = false;

    /* metodo al que llamaran los coches que quieren cruzar del norte */
    public synchronized void entraCocheNorte(int nombre) throws InterruptedException {

    }

    /* metodo al que llamaran los coches que quieren cruzar del sur */
    public synchronized void entraCocheSur(int nombre) throws InterruptedException {

    }

    /* metodo para salir del puente, tanto si eres norte como sur */
    public synchronized void salirPuente(int nombre) {

    }
}
