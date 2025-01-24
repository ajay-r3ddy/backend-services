package com.example.mutualfundportfolio.service;

import com.example.mutualfundportfolio.pojo.MutualFundExternalServiceResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MutualFundExternalService {

    private final OkHttpClient client = new OkHttpClient();

    public String callingMutualFundExternalApi(String schemeCode) throws IOException {
        Request request = new Request.Builder()
                .url("https://api.mfapi.in/mf/"+ schemeCode + "/latest")
                .build();

        ObjectMapper mapper = new ObjectMapper();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()){
                throw new IOException("Unexpected code " + response);
            }
            MutualFundExternalServiceResponse mutualFundExternalServiceResponse = mapper.readValue(response.body().string(), MutualFundExternalServiceResponse.class);
            System.out.println(mutualFundExternalServiceResponse);
            return  mutualFundExternalServiceResponse.toString();
        }
    }

}
