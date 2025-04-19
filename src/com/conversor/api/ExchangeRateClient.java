package com.conversor.api;

import com.conversor.model.ExchangeResponse;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateClient {

    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/0dd6631f166ad408e67fd5e6/pair/";
    private final HttpClient client = HttpClient.newHttpClient();
    private final Gson gson = new Gson();

    public ExchangeResponse getConversion(String from, String to, double amount) throws Exception {
        String url = BASE_URL + from + "/" + to + "/" + amount;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new RuntimeException("Error en la solicitud: " + response.statusCode());
        }

        return gson.fromJson(response.body(), ExchangeResponse.class);
    }
}
