package MultiThreading;

public class MainClass {

	public static void main(String args[]) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		ThreadC c = new ThreadC();
		a.start();
		b.start();
		c.start();
		try {
			a.join();
			b.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}
