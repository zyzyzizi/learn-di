package com.twobros.sample.data.entity;

public class User {
    private long id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public Company getCompany() {
        return company;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public String getWebsite() {
        return website;
    }
}
