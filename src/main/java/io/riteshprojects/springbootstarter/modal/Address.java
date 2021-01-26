package io.riteshprojects.springbootstarter.modal;

public class Address {
    public String addressLine1;
    public String addressLisne2;
    public String postalCode;
    public String state;
    public String city;
    public String country;

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLisne2() {
        return addressLisne2;
    }

    public void setAddressLisne2(String addressLisne2) {
        this.addressLisne2 = addressLisne2;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
