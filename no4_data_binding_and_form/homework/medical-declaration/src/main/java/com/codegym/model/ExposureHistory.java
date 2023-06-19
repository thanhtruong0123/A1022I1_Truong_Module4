package com.codegym.model;

public class ExposureHistory {
    private boolean animalContact;      // Tiếp xúc qua động vật
    private boolean contactWithInfected; // Tiếp xúc qua người nhiễm nCOV

    public ExposureHistory() {
    }

    public ExposureHistory(boolean animalContact, boolean contactWithInfected) {
        this.animalContact = animalContact;
        this.contactWithInfected = contactWithInfected;
    }

    public boolean isAnimalContact() {
        return animalContact;
    }

    public void setAnimalContact(boolean animalContact) {
        this.animalContact = animalContact;
    }

    public boolean isContactWithInfected() {
        return contactWithInfected;
    }

    public void setContactWithInfected(boolean contactWithInfected) {
        this.contactWithInfected = contactWithInfected;
    }
}
