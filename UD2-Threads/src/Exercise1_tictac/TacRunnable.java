package Exercise1_tictac;

public class TacRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("TAC");
        }
    }
}
