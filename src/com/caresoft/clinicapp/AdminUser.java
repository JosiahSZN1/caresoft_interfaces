//Will implement both HIPAACompliantUser and HIPAACompliantAdmin
package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

//Copy and paste the code examples for each class file, keep method stubs created by STS.
public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
//... imports class definition...
    
    // Inside class:
    private String role;
    private ArrayList<String> securityIncidents;
    
	// TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer id, String role) {
		super(id);
		this.role = role;
		this.securityIncidents = new ArrayList<String>();
	}

    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!

	public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters
    
	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
//		Pin must be 6 digits or more
//		returns false if not
//		assign pin to user (as a member variable)
//		cast pin to Integer
		Integer pinAsInteger = (Integer) pin;
//		pinAsInteger toString method in order to access length method
		if(pinAsInteger.toString().length() >= 6) {
			this.pin = pin;
			return true;
		}
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
//		Compares ids, if not match creates incident report using authIncident method
//		returns true if match otherwise false
		if(confirmedAuthID != this.id) {
			this.authIncident();
			return false;
		}
		return true;
	}
    
    @Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
//    	Returns a list of strings(incidents reported)
		return this.securityIncidents;
	}
}
