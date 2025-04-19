package com.conversor.service;

import com.conversor.api.ExchangeRateClient;
import com.conversor.model.ExchangeResponse;

public class CurrencyConverterImpl implements CurrencyConverter {
    private final ExchangeRateClient client = new ExchangeRateClient();
    @Override
    public double convert(String from, String to, double amount) throws Exception {
        ExchangeResponse response = client.getConversion(from, to, amount);
        return response.conversion_result();
    }
}
