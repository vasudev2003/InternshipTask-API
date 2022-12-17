package com.example.barriaztechtask;

import org.json.JSONObject;

public class Result {
    private String name;
    private String alpha_two_code;
    private String country;


    public Result(String name, String country,  String alpha_two_code) {
        this.name = name;
        this.alpha_two_code = alpha_two_code;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlpha_two_code(String web_pages) {
        this.alpha_two_code = alpha_two_code;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

   public String getAlpha_two_code() {
        return alpha_two_code;
    }

    public String getCountry() {
        return country;
    }
}
