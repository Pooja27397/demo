package multithreading_30;

public class ThreadDemo1 extends Thread{
public static void main(String[] args) {
	ThreadDemo1 thread=new ThreadDemo1();
	System.out.println(thread.getId());
	System.out.println(thread.getName());
	System.out.println(thread.getPriority());
	System.out.println(thread.getState());
}
}
