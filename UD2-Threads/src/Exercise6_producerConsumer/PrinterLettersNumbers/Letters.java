package Exercise6_producerConsumer.PrinterLettersNumbers;

public class Letters implements Runnable{

    private Printer printer;

    public Letters(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for(int i=0; i<26; i++){
            try {
                printer.imprimeCaracter();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

