package Exercise3_Priority;

public class Counter implements Runnable{

    private int counter = 0;
    private String name;

    public Counter(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0; i<1000000; i++){
            counter++;
        }

        System.out.println("Thread: "+name+" finnished");
    }

    private void superComplexMethod(){

    }
}
