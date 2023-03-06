package Sychronization;

public class SychronizationMain {
	public static void main(String[] args) {
		SychronizationExample obj=new SychronizationExample();
        
        Thread thread1=new Thread(obj,"person 1");
        Thread thread2=new Thread(obj,"person 2");
        
        thread1.start();
        thread2.start();

	}
}
