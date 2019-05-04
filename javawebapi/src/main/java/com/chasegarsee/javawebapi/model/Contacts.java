package com.chasegarsee.javawebapi.model;

import java.util.concurrent.atomic.AtomicLong;

public class Contacts
{
    private static AtomicLong counter = new AtomicLong();
    private long id;
    private String fname;
    private String lname;
    private String address;
    private String email;
    private String sex;
    private String state;
    private String city;
    private String country;
    private long phoneNumber;

    public Contacts()
    {
    }

    public Contacts(String fname, String lname, String address, String email, String sex, String state, String city, String country, long phoneNumber)
    {
        this.id = counter.incrementAndGet();
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.email = email;
        this.sex = sex;
        this.state = state;
        this.city = city;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    public Contacts(String fname, String lname, String address, String email, String sex, String state, String city, String country, String phoneNumber)
    {
        this.id = counter.incrementAndGet();
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.email = email;
        this.sex = sex;
        this.state = state;
        this.city = city;
        this.country = country;
        this.phoneNumber = Long.valueOf(phoneNumber);
    }

    public long getId()
    {
        return id;
    }

    public String getFname()
    {
        return fname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public String getLname()
    {
        return lname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public long getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString()
    {
        return "Contacts{" + "id=" + id + ", fname='" + fname + '\'' + ", lname='" + lname + '\'' + ", address='" + address + '\'' + ", email='" + email + '\'' + ", sex='" + sex + '\'' + ", state='" + state + '\'' + ", city='" + city + '\'' + ", country='" + country + '\'' + ", phoneNumber=" + phoneNumber + '}';
    }
}
