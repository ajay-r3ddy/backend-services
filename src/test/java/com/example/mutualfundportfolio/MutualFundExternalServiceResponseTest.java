package com.example.mutualfundportfolio;

import com.example.mutualfundportfolio.pojo.MutualFundExternalServiceResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class MutualFundExternalServiceResponseTest {

    public static void main(String args[]) throws IOException {

        System.out.println("Test 1");
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.mfapi.in/mf/100028/latest")
                .build();

        try (Response response = client.newCall(request).execute()) {
            System.out.println("Test 2");
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }

            assert response.body() != null;
            String json = response.body().string();
            System.out.println(json);
            ObjectMapper mapper = new ObjectMapper();
            try {
                MutualFundExternalServiceResponse fundResponse = mapper.readValue(json, MutualFundExternalServiceResponse.class);
                System.out.println("Test");
                System.out.println(fundResponse);
                System.out.println("Fund House: " + fundResponse.getMeta().getFund_house());
                System.out.println("NAV: " + fundResponse.getData().get(0).getNav());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
