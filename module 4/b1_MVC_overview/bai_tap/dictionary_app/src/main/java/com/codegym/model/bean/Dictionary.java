package com.codegym.model.bean;

public class Dictionary {
    private String eng;
    private String viet;

    public Dictionary() {
    }

    public Dictionary(String eng, String viet) {
        this.eng = eng;
        this.viet = viet;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getViet() {
        return viet;
    }

    public void setViet(String viet) {
        this.viet = viet;
    }
}
