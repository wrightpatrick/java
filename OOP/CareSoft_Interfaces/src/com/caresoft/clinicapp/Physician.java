package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	
	Physician(int id) {
		this.id = id;
	}
	
	  // Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    // TO DO: Implement HIPAACompliantUser!
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
	//assign pin to user
	public boolean assignPin(int pin) {
		int testIntLength = String.valueOf(pin).length();
		if (testIntLength == 4) {
			this.pin = pin;
			return true;
		}
		else {
			
		}
			return false;
		
	}
	
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (this.id  == confirmedAuthID) {
			return true;
		} else {
			
		}
			return false;
		
	}
	
	
}
