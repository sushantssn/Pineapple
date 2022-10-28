package com.pineapple.entity;

import javax.persistence.*;

@Entity
public class Scheme {
    @Id
    @GeneratedValue
    private int id;
    private String schemeName;
    private int noOfDays;
    private double rateOfIntrest;

    private String schemeDesc;

    @Column(columnDefinition = "text")
    private String schemeJSON;
    public Scheme() {
        super();
    }

    public Scheme(int id, String schemeName, int noOfDays, double rateOfIntrest, String schemeDesc,String schemeJSON) {
        this.id = id;
        this.schemeName = schemeName;
        this.noOfDays = noOfDays;
        this.rateOfIntrest = rateOfIntrest;
        this.schemeDesc = schemeDesc;
        this.schemeJSON=schemeJSON;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public double getRateOfIntrest() {
        return rateOfIntrest;
    }

    public void setRateOfIntrest(double rateOfIntrest) {
        this.rateOfIntrest = rateOfIntrest;
    }

    public String getSchemeDesc() {
        return schemeDesc;
    }

    public void setSchemeDesc(String schemeDesc) {
        this.schemeDesc = schemeDesc;
    }

    public String getSchemeJSON() {
        return schemeJSON;
    }

    public void setSchemeJSON(String schemeJSON) {
        this.schemeJSON = schemeJSON;
    }
}
