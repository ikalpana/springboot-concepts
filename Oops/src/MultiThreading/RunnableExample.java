package MultiThreading;

public class RunnableExample implements Runnable{

    @Override
    public void run() {
        System.out.println("Inside the run method ");
    }

    public static void main(String[] args ) {
        Thread thread = new Thread(new RunnableExample());
        thread.start();

    }
}
