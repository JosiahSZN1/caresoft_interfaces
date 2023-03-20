//Will implement HIPAACompliantUser and extend User
package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

//Copy and paste the code examples for each class file, keep method stubs created by STS.
public class Physician extends User implements HIPAACompliantUser {
//... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID

	
    public Physician(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
    
    // TO DO: Implement HIPAACompliantUser!



	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
    // TO DO: Setters & Getters
    
    @Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
    	//	Pin must be exactly 4 digits
        //	returns false if not
        //	assign the pin to the user (as a member variable)
//    	cast pin as Integer
    	Integer pinAsInteger = (Integer) pin;
//    	pinAsInteger toString method in order to access length method
    	if(pinAsInteger.toString().length() == 4) {
    		this.pin = pin;
    		return true;
    	}
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
//		Checks the physician's id against the given id
//		returns true if they are a match, otherwise false.
		if(confirmedAuthID == this.id) {
			return true;
		}
		return false;
	}
}
