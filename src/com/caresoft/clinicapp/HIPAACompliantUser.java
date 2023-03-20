//make a new interface called HIPAACompliantUser
package com.caresoft.clinicapp;
//Copy and paste the given code for each interface below.
public interface HIPAACompliantUser {
    abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
}


