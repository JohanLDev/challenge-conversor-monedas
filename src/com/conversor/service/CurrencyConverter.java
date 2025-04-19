package com.conversor.service;

public interface CurrencyConverter {
    double convert(String from, String to, double amount) throws Exception;
}

