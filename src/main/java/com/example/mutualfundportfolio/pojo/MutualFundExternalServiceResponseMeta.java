package com.example.mutualfundportfolio.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MutualFundExternalServiceResponseMeta {

    @JsonProperty("fund_house")
    private String fund_house;

    @JsonProperty("scheme_type")
    private String scheme_type;

    @JsonProperty("scheme_category")
    private String scheme_category;

    @JsonProperty("scheme_code")
    private int scheme_code;

    @JsonProperty("scheme_name")
    private String scheme_name;

    @JsonProperty("isin_growth")
    private String isin_growth;

    @JsonProperty("isin_div_reinvestment")
    private String isin_div_reinvestment;

    public String getFund_house() {
        return fund_house;
    }

    public void setFund_house(String fund_house) {
        this.fund_house = fund_house;
    }

    public String getScheme_type() {
        return scheme_type;
    }

    public void setScheme_type(String scheme_type) {
        this.scheme_type = scheme_type;
    }

    public String getScheme_category() {
        return scheme_category;
    }

    public void setScheme_category(String scheme_category) {
        this.scheme_category = scheme_category;
    }

    public int getScheme_code() {
        return scheme_code;
    }

    public void setScheme_code(int scheme_code) {
        this.scheme_code = scheme_code;
    }

    public String getScheme_name() {
        return scheme_name;
    }

    public void setScheme_name(String scheme_name) {
        this.scheme_name = scheme_name;
    }

    public String getIsin_growth() {
        return isin_growth;
    }

    public void setIsin_growth(String isin_growth) {
        this.isin_growth = isin_growth;
    }

    public String getIsin_div_reinvestment() {
        return isin_div_reinvestment;
    }

    public void setIsin_div_reinvestment(String isin_div_reinvestment) {
        this.isin_div_reinvestment = isin_div_reinvestment;
    }

    @Override
    public String toString() {
        return "MutualFundExternalServiceResponseMeta{" +
                "fund_house='" + fund_house + '\'' +
                ", scheme_type='" + scheme_type + '\'' +
                ", scheme_category='" + scheme_category + '\'' +
                ", scheme_code=" + scheme_code +
                ", scheme_name='" + scheme_name + '\'' +
                ", isin_growth='" + isin_growth + '\'' +
                ", isin_div_reinvestment='" + isin_div_reinvestment + '\'' +
                '}';
    }
}
