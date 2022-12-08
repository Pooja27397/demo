package exceptionhandling1_abstraction;

public class Scooter extends Abstraction {
	void start() {
		System.out.println("Scooter start with kick");
	}

		public static void main(String[] args) {
			Car c=  new Car();
			c.start();
			Scooter s= new Scooter();
			s.start();
		}


	} 


