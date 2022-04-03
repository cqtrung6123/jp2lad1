package part412;

public class Main {
    public static void main(String[] args) {
        new DemoThread("Frist");
        new DemoThread("Second");
        new DemoThread("Third");
       try {
           Thread.sleep(12000);
       }catch (InterruptedException e){
           e.printStackTrace();
       }
        System.out.println("Main thread exiting");
    }
}
