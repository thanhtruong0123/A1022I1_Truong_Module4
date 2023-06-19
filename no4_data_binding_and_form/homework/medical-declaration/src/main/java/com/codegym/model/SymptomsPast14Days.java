package com.codegym.model;

public class SymptomsPast14Days {
    private boolean fever;                      // Triệu chứng: sốt
    private boolean cough;                      // Triệu chứng: ho
    private boolean shortnessOfBreath;          // Triệu chứng: khó thở
    private boolean soreThroat;                 // Triệu chứng: đau họng
    private boolean nausea;                     // Triệu chứng: nôn
    private boolean diarrhea;                   // Triệu chứng: tiêu chảy
    private boolean externalBleeding;           // Triệu chứng: xuất huyết ngoài da
    private boolean skinRash;                   // Triệu chứng: nổi ban ngoài da

    public SymptomsPast14Days() {
    }

    public SymptomsPast14Days(boolean fever, boolean cough, boolean shortnessOfBreath, boolean soreThroat, boolean nausea, boolean diarrhea, boolean externalBleeding, boolean skinRash) {
        this.fever = fever;
        this.cough = cough;
        this.shortnessOfBreath = shortnessOfBreath;
        this.soreThroat = soreThroat;
        this.nausea = nausea;
        this.diarrhea = diarrhea;
        this.externalBleeding = externalBleeding;
        this.skinRash = skinRash;
    }

    public boolean isFever() {
        return fever;
    }

    public void setFever(boolean fever) {
        this.fever = fever;
    }

    public boolean isCough() {
        return cough;
    }

    public void setCough(boolean cough) {
        this.cough = cough;
    }

    public boolean isShortnessOfBreath() {
        return shortnessOfBreath;
    }

    public void setShortnessOfBreath(boolean shortnessOfBreath) {
        this.shortnessOfBreath = shortnessOfBreath;
    }

    public boolean isSoreThroat() {
        return soreThroat;
    }

    public void setSoreThroat(boolean soreThroat) {
        this.soreThroat = soreThroat;
    }

    public boolean isNausea() {
        return nausea;
    }

    public void setNausea(boolean nausea) {
        this.nausea = nausea;
    }

    public boolean isDiarrhea() {
        return diarrhea;
    }

    public void setDiarrhea(boolean diarrhea) {
        this.diarrhea = diarrhea;
    }

    public boolean isExternalBleeding() {
        return externalBleeding;
    }

    public void setExternalBleeding(boolean externalBleeding) {
        this.externalBleeding = externalBleeding;
    }

    public boolean isSkinRash() {
        return skinRash;
    }

    public void setSkinRash(boolean skinRash) {
        this.skinRash = skinRash;
    }
}
