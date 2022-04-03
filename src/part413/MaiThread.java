package part413;

public class MaiThread {
    public static void main(String[] args) {
        Message message=new Message();
        Message2 message2=new Message2();
        System.out.println("MESSAGE BOARD");
        System.out.println("=====================");
        System.out.println("Numer of messages : 2");
        System.out.println("Message 1: multihreading");
        System.out.println("Time out : 1000");
        System.out.println("Priority : hight");
        System.out.println("Message 1: multitasking");
        System.out.println("Time out : 2000");
        System.out.println("Priority : medium");
        System.out.println("Result:");
        try {
            message.start();
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        try {
            message2.start();
            Thread.sleep(2000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

    }
}
