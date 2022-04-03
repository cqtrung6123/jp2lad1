package part413;

public class Message extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Multithreading");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
