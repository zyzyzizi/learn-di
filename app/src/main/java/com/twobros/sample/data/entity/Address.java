package com.twobros.sample.data.entity;

import androidx.annotation.NonNull;

public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    public Geo getGeo() {
        return geo;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getSuite() {
        return suite;
    }

    public String getZipcode() {
        return zipcode;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s, %s, %s", suite, street, city);
    }
}
