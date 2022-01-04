package com.example.fragment.classes;

public class phonemassege {
    public String getPhone() {
        return phone;
    }

    public phonemassege(String phone, String massage) {
        this.phone = phone;
        this.massage = massage;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    private String phone;
    private String massage;

}
