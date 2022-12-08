//Without>>> wait & notify example for reference

package multithreading_31;

public class MyThread extends Thread {

int sum=0;
public void run() {
	for(int i=1;i<5;i++);
	sum=sum+10;
}

public static void main(String[] args) {
	MyThread mt1=new MyThread();
	mt1.start();
	System.out.println(mt1.sum);
}
}