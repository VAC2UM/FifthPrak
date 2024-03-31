package com.itproger.fifthprak;

public class Club {

    private String name; // название
    private String country;  // страна
    private int flagResource; // ресурс эмблемы

    public Club(String name, String country, int flag){

        this.name=name;
        this.country=country;
        this.flagResource=flag;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCapital(String country) {
        this.country = country;
    }

    public int getFlagResource() {
        return this.flagResource;
    }

    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }
}
