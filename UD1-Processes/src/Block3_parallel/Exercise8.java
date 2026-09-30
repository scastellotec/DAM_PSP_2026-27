package Block3_parallel;

public class Exercise8 {
    static void main() {
        Runtime r = Runtime.getRuntime();

        long totalBytes = r.totalMemory();
        long libreBytes = r.freeMemory();
        long usadaBytes = totalBytes - libreBytes;

        System.out.println("Number of processors avilable:    " + r.availableProcessors());
        System.out.println("Total memory allocated JVM:     " + totalBytes / 1024 / 1024 + " MB");
        System.out.println("Free memory JVM:                " + libreBytes / 1024 / 1024 + " MB");
        System.out.println("Memory in use:                    " + usadaBytes / 1024 / 1024 + " MB");
    }
}
