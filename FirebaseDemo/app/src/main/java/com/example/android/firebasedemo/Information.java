package com.example.android.firebasedemo;

public class Information {
    /**
     * email: used to store the email of the branch
     * name: used to store the name of the branch
     *
     * Step 56: Create the data members.
     * Step 57: Create the constructor.
     * Step 58: Create the getters and setters.
     */

    // Data Members
    private String email;
    private String name;

    // Constructor
    public Information(String email, String name){
        this.email = email;
        this.name = name;
    }

    // Getters and Setters
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
