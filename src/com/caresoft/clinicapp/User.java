//None. (Leave as is, no implementations)
package com.caresoft.clinicapp;
//Copy and paste the code examples for each class file, keep method stubs created by STS.
public class User {
    protected Integer id;
    protected int pin;
    
    // TO DO: Getters and setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	 // Implement a constructor that takes an ID
	public User(Integer id) {
		super();
		this.id = id;
	}

}
