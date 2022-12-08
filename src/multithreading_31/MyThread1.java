//with>>>wait&notify example for reference

package multithreading_31;

public class MyThread1 extends Thread {
int sum=0;
public void run() {
	synchronized(this) {
		for(int i=1;i<5;i++) {
			sum=sum+40;
			
		}
	this.notify();
	}
}
public static void main(String[] args) throws InterruptedException{
	MyThread mt1=new MyThread();
	mt1.start();
	//sop(mt1.sum);
	synchronized(mt1) {
		mt1.wait();
		System.out.println(mt1.sum);
	}
}
	
}