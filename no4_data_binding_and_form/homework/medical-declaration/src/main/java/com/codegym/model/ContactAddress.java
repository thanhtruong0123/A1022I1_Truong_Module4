package com.codegym.model;

public class ContactAddress {
    private String provinceOrCity;
    private String districtOrTown;
    private String wardOrCommune;
    private String residentialAddress;
    private String phoneNumber;
    private String email;

    public ContactAddress() {
    }

    public ContactAddress(String provinceOrCity, String districtOrTown, String wardOrCommune, String residentialAddress, String phoneNumber, String email) {
        this.provinceOrCity = provinceOrCity;
        this.districtOrTown = districtOrTown;
        this.wardOrCommune = wardOrCommune;
        this.residentialAddress = residentialAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getProvinceOrCity() {
        return provinceOrCity;
    }

    public void setProvinceOrCity(String provinceOrCity) {
        this.provinceOrCity = provinceOrCity;
    }

    public String getDistrictOrTown() {
        return districtOrTown;
    }

    public void setDistrictOrTown(String districtOrTown) {
        this.districtOrTown = districtOrTown;
    }

    public String getWardOrCommune() {
        return wardOrCommune;
    }

    public void setWardOrCommune(String wardOrCommune) {
        this.wardOrCommune = wardOrCommune;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
