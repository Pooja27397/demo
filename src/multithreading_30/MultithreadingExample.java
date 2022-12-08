package multithreading_30;

public class MultithreadingExample extends Thread{
public void run() {
	for(int i=1;i<=5;i++) {
		try {
		Thread.sleep(500);	
		} catch(Exception e) {
		System.out.println (e.getMessage());	
		}
		System.out.println(i);
	}
}
public static void main(String[] args) {
	MultithreadingExample thread1=new MultithreadingExample();
	MultithreadingExample thread2=new MultithreadingExample();
	thread1.start();
	thread2.start();
	
}
}
