package com.caresoft.clinicapp;


import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser {

	 // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<String>();
    
    AdminUser() {
    	
    }
    
    // TO DO: Implement a constructor that takes an ID and a role
    AdminUser(int id, String role){
    	this.id = id;
    	this.role = role;
    }
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newUser(Integer id, String role) {
    	
    }
    
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
    
	// assign pin to user
    public boolean assignPin(int pin) {
		int testIntLength = String.valueOf(pin).length();
		if (testIntLength == 6) {
			this.pin = pin;
			return true;
		}
		else {
			authIncident();
		}
			return false;
		
		
	}

	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (this.id != confirmedAuthID) {
			authIncident();
			return false;
		} else
			return false;
	}


	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return this.getSecurityIncidents();
	}
	
	//getters and setters
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
	
	//getters and setters
	
}
