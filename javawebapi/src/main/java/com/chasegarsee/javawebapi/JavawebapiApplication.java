package com.chasegarsee.javawebapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavawebapiApplication
{

    public static ContactList contactList;

    public static void main(String[] args)
    {
        contactList = new ContactList();
        SpringApplication.run(JavawebapiApplication.class, args);
    }

}
