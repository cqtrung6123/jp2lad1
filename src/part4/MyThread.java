package part4;

public class MyThread extends Thread{
   private String name;
   public MyThread(String name){
       this.name=name;
   }
   public void run(){
       System.out.println("Name:"+name);
   }
   public void setNameThread(String nameThread){
       this.name=nameThread;
       System.out.println("Name:"+name);
   }
   public void sleep(){
       try {
           for (int i=0;i<=10;i++){
               if (i%2==0){
                   System.out.println(i);
                   Thread.sleep(1500);
               }
           }
       }catch (InterruptedException e){
           e.printStackTrace();
       }
   }
}
