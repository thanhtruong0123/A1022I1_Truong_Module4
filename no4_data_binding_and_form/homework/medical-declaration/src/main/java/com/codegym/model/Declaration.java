package com.codegym.model;

public class Declaration {
    private Infomation infomation;
    private ContactAddress contactAddress;
    private SymptomsPast14Days symptomsPast14Days;
    private ExposureHistory exposureHistory;

    public Declaration() {
    }

    public Declaration(Infomation infomation, ContactAddress contactAddress, SymptomsPast14Days symptomsPast14Days, ExposureHistory exposureHistory) {
        this.infomation = infomation;
        this.contactAddress = contactAddress;
        this.symptomsPast14Days = symptomsPast14Days;
        this.exposureHistory = exposureHistory;
    }

    public Infomation getInfomation() {
        return infomation;
    }

    public void setInfomation(Infomation infomation) {
        this.infomation = infomation;
    }

    public ContactAddress getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(ContactAddress contactAddress) {
        this.contactAddress = contactAddress;
    }

    public SymptomsPast14Days getSymptomsPast14Days() {
        return symptomsPast14Days;
    }

    public void setSymptomsPast14Days(SymptomsPast14Days symptomsPast14Days) {
        this.symptomsPast14Days = symptomsPast14Days;
    }

    public ExposureHistory getExposureHistory() {
        return exposureHistory;
    }

    public void setExposureHistory(ExposureHistory exposureHistory) {
        this.exposureHistory = exposureHistory;
    }
}
