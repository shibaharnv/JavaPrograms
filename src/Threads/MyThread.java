package Threads;

class hi extends Thread
{
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class hello extends Thread
{
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class MyThread {

    public static void main(String[] args) throws InterruptedException {
       hi hiobj = new hi();
        hello helloobj = new hello();
        hiobj.start();
        helloobj.start();
    }
}
