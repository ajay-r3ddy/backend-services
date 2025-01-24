package com.example.mutualfundportfolio.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MutualFundExternalServiceResponse {

    @JsonProperty("meta")
    private MutualFundExternalServiceResponseMeta meta;

    @JsonProperty("data")
    private List<MutualFundExternalServiceResponseMetaData> data;

    @JsonProperty("status")
    private String MutualFundExternalServiceResponseStatus;

    public MutualFundExternalServiceResponseMeta getMeta() {
        return meta;
    }

    public void setMeta(MutualFundExternalServiceResponseMeta meta) {
        this.meta = meta;
    }

    public List<MutualFundExternalServiceResponseMetaData> getData() {
        return data;
    }

    public void setData(List<MutualFundExternalServiceResponseMetaData> data) {
        this.data = data;
    }

    public String getMutualFundExternalServiceResponseStatus() {
        return MutualFundExternalServiceResponseStatus;
    }

    public void setMutualFundExternalServiceResponseStatus(String mutualFundExternalServiceResponseStatus) {
        MutualFundExternalServiceResponseStatus = mutualFundExternalServiceResponseStatus;
    }

    @Override
    public String toString() {
        return "MutualFundExternalServiceResponse{" +
                "meta=" + meta +
                ", data=" + data +
                ", MutualFundExternalServiceResponseStatus='" + MutualFundExternalServiceResponseStatus + '\'' +
                '}';
    }
}
