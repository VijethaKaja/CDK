package BookAssignment.pack3;


public class BookNotFoundException extends Exception {
	public String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public BookNotFoundException()
	{
		
	}
	public BookNotFoundException(String message)
	{
		super(message);
		this.message=message;
	
	}
	public void display()
	{
		System.out.println(getMessage());
	}
	

}



