package com.pineapple.dto;

import com.fasterxml.jackson.databind.JsonNode;

public class SchemeDTO {

    private int id;
    private String schemeName;
    private int noOfDays;
    private double rateOfIntrest;

    private String schemeDesc;

    private JsonNode schemeDescJson;

    public SchemeDTO() {
        super();
    }

    public SchemeDTO(int id, String schemeName, int noOfDays, double rateOfIntrest, String schemeDesc) {
        this.id = id;
        this.schemeName = schemeName;
        this.noOfDays = noOfDays;
        this.rateOfIntrest = rateOfIntrest;
        this.schemeDesc = schemeDesc;
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

    public JsonNode getSchemeDescJson() {
        return schemeDescJson;
    }

    public void setSchemeDescJson(JsonNode schemeDescJson) {
        this.schemeDescJson = schemeDescJson;
    }
}
