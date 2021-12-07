package com.techelevator.model;

public class Profile {

    private float profileId;
    private float userId;
    private String firstName;
    private String lastName;
    private Address address;
    private String phoneNumber;
    private String contactTimes;

    public float getProfileId() {
        return profileId;
    }

    public void setProfileId(float profileId) {
        this.profileId = profileId;
    }

    public float getUserId() {
        return userId;
    }

    public void setUserId(float userId) {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactTimes() {
        return contactTimes;
    }

    public void setContactTimes(String contactTimes) {
        this.contactTimes = contactTimes;
    }
}