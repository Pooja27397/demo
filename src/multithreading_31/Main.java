package multithreading_31;

public class Main {
public static void main(String[] args) {
	AccountDetails accountdetails= new AccountDetails();
	Thread thread=new Thread(accountdetails);
	Thread thread1=new Thread(accountdetails);
	thread.setName("Rohan");
     thread1.setName("Soham");
     		thread.start();
     		thread1.start();
}
}
