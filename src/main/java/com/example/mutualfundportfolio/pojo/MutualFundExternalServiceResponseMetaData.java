package com.example.mutualfundportfolio.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MutualFundExternalServiceResponseMetaData {

    @JsonProperty("date")
    private String date;

    @JsonProperty("nav")
    private String nav;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNav() {
        return nav;
    }

    public void setNav(String nav) {
        this.nav = nav;
    }

    @Override
    public String toString() {
        return "MutualFundExternalServiceResponseMetaData{" +
                "date='" + date + '\'' +
                ", nav='" + nav + '\'' +
                '}';
    }
}
