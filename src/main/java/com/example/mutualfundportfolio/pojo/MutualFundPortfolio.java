package com.example.mutualfundportfolio.pojo;

public class MutualFundPortfolio {

    int table_id;
    int scheme_code;
    String scheme_name;
    String isin_growth;
    String isin_div_reinvestment;

    public MutualFundPortfolio(int scheme_code, String scheme_name, String isin_growth, String isin_div_reinvestment, int table_id) {
        this.scheme_code = scheme_code;
        this.scheme_name = scheme_name;
        this.isin_growth = isin_growth;
        this.isin_div_reinvestment = isin_div_reinvestment;
        this.table_id = table_id;
    }

    public int getTable_id() {
        return table_id;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
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
        return "MutualFundPortfolio{" +
                "table_id=" + table_id +
                ", scheme_code=" + scheme_code +
                ", scheme_name='" + scheme_name + '\'' +
                ", isin_growth='" + isin_growth + '\'' +
                ", isin_div_reinvestment='" + isin_div_reinvestment + '\'' +
                '}';
    }
}
