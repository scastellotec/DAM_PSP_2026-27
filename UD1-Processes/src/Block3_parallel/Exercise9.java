package Block3_parallel;

import java.util.Arrays;
import java.util.List;

public class Exercise9 {
    static void main() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Stream secuencial: el hilo principal procesa todos los elementos en orden
        numeros.parallelStream()
                .forEach(System.out::println);
    }
}
