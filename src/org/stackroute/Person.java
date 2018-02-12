package org.stackroute;

public class Person {
	private String firstName="V";
	private String lastName="N";
	
	public Person(String firs, String las){
		firstName = firs;
		lastName = las;	
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void display(){
		System.out.println(getFirstName() +" "+ getLastName()); 
	}
	

}
