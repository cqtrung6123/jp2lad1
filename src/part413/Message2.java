package part413;

public class Message2 extends Thread{
    @Override
    public void run() {
        try {
            for (int j=0;j<2;j++){
                System.out.println("Multitasking");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
