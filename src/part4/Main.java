package part4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MyThread myThread=new MyThread("MyThread");
        myThread.start();//call run()
        String namethread=scanner.next();
        myThread.setNameThread(namethread);
        myThread.sleep();
    }
}
