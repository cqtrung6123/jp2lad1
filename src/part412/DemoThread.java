package part412;

public class DemoThread implements Runnable{
    private String name;
    Thread thread;
        public DemoThread(String namethread){
        name=namethread;
        thread=new Thread(this,name);
        System.out.println("New thread: "+thread);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i=5;i>0;i--){
                System.out.println(name+" : "+i);
                if (i==1){
                    System.out.println(name+" exiting");
                    Thread.sleep(600);
                }
                Thread.sleep(1200);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
