package com.techelevator.model;

public class Address {

    private float addressId;
    private String addressLineOne;
    private String addressLineTwo;
    private String city;
    private String stateName;
    private double zipCode;


    public float getAddressId() {
        return addressId;
    }

    public void setAddressId(float addressId) {
        this.addressId = addressId;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public void setAddressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public double getZipCode() {
        return zipCode;
    }

    public void setZipCode(double zipCode) {
        this.zipCode = zipCode;
    }
}
