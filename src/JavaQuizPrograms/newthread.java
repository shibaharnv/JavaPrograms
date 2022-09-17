package JavaQuizPrograms;

public class newthread extends Thread{

    Thread t;
    newthread()
    {
        t= new Thread(this,"My Thread");
        t.start();
    }

    public void run()
    {
        try{
            t.join();
            System.out.println(t.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
    }
}
