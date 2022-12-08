package exceptionhandlind_2_UDE;

public class InsufficientFundException extends RuntimeException {
private String message;
public InsufficientFundException(String message) {
	//this.message=message;
	super (message);
  }
}

