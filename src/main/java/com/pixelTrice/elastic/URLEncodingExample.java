package com.pixelTrice.elastic;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.io.UnsupportedEncodingException;

class URLEncodingExample {

    // Method to encode a string value using `UTF-8` encoding scheme
    private static String encodeValue(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex.getCause());
        }
    }

    private static String decodeValue(String value) {
        try {
            return URLDecoder.decode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex.getCause());
        }
    }

    public static void main(String[] args) {
        String baseUrl = "https://www.google.com/search?q=";

        String query = "AOBC (1)";
        String encodedQuery = encodeValue(query); // Encoding a query string

//        String completeUrl = baseUrl + encodedQuery;
        System.out.println(encodedQuery);

        String decodedQuery = decodeValue("Vishwwa   iii  %20%281%29 bsadbsabdsabdsbmsbc.xls");

        System.out.println(decodedQuery);
    }
}