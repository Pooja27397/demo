package multithreading_30;

public class MultithreadingExample2 extends Thread{
public void run() {
	for (int i=1;i<=10;i++) {
				try {
					Thread.sleep(500);

		}catch(Exception e) {
		System.out.println(e.getMessage());	
		}
		System.out.println(i);
		}
	}

public static void main(String[] args) {
	MultithreadingExample2 thread=new MultithreadingExample2();
	MultithreadingExample2 thread1=new MultithreadingExample2();
	thread.start();
	thread1.start();
}
}
