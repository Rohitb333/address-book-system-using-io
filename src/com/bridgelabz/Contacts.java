package com.bridgelabz;

public class Contacts {
    private String firstName, lastName, address, city, state, emailId;
    private int zip;
    private long phoneNumber;

    //Used constructor to store parameters
    public Contacts(String firstName, String lastName, String address, String city, String state, String emailId, int zip, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.emailId = emailId;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    //Usd getters And setters to get and set contact details
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return ("First name: " + firstName + "\n Last name: " + lastName + "\n Address: " + address + "\n city: " + city
                + "\n state: " + state + "\n email: " + emailId + "\n zip: " + zip + "\n phone number:" + phoneNumber);
    }
}
