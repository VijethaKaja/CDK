package com.personException;

public class PersonNotFoundException extends Exception {
	public String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public PersonNotFoundException()
	{
		
	}
	public PersonNotFoundException(String message)
	{
		super();
		this.message=message;
	}
	public void display()
	{
		System.out.println(getMessage());
	}
	

}
