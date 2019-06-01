package com.lizkrz.app;

/**
 * A simple class for passenger information
 *
 * @author Liz Krznarich
 */

public class Ticketholder {
    
    private String firstName;
    private String lastName;
    private String userId;
    
    /**
     * Creates ticketholder instance
     *
     * @param firstName - first/given name
     * @param lastName - last/family name
     * @param userId - user ID within the system
     *
     */ 
    public Ticketholder (String firstName, String lastName, String userId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId; 
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
