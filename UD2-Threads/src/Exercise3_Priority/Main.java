package Exercise3_Priority;

public class Main {

    static void main() {
        Thread threadMax = new Thread(new Counter("MAX"));
        Thread threadAvg = new Thread(new Counter("AVG"));
        Thread threadMin = new Thread(new Counter("MIN"));

        threadMax.setPriority(Thread.MAX_PRIORITY);
        threadAvg.setPriority(Thread.NORM_PRIORITY);
        threadMin.setPriority(Thread.MIN_PRIORITY);

        threadMax.start();
        threadAvg.start();
        threadMin.start();
    }
}
