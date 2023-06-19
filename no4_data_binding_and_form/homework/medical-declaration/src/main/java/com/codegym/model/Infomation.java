package com.codegym.model;

public class Infomation {
    private String name;
    private String birthday;
    private boolean gender;
    private String country;
    private String citizenCard;
    private String vehicle;
    private String vehicleID;
    private String seatNumber;
    private Date firstDay;
    private Date lastDay;
    private String positionOverLast14Days;

    public Infomation() {
    }

    public Infomation(String name, String birthday, boolean gender, String country, String citizenCard, String vehicle, String vehicleID, String seatNumber, Date firstDay, Date lastDay, String positionOverLast14Days) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.country = country;
        this.citizenCard = citizenCard;
        this.vehicle = vehicle;
        this.vehicleID = vehicleID;
        this.seatNumber = seatNumber;
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.positionOverLast14Days = positionOverLast14Days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCitizenCard() {
        return citizenCard;
    }

    public void setCitizenCard(String citizenCard) {
        this.citizenCard = citizenCard;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Date getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(Date firstDay) {
        this.firstDay = firstDay;
    }

    public Date getLastDay() {
        return lastDay;
    }

    public void setLastDay(Date lastDay) {
        this.lastDay = lastDay;
    }

    public String getPositionOverLast14Days() {
        return positionOverLast14Days;
    }

    public void setPositionOverLast14Days(String positionOverLast14Days) {
        this.positionOverLast14Days = positionOverLast14Days;
    }
}
