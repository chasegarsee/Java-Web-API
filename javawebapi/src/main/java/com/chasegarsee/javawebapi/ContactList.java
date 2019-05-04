package com.chasegarsee.javawebapi;


import com.chasegarsee.javawebapi.model.Contacts;

import java.util.ArrayList;

public class ContactList
{

    public ArrayList<Contacts> contactsList = new ArrayList<>();
    public ContactList()
    {
        contactsList.add(new Contacts("Chase", "Garsee", "2213 Button Quail Court", "chasegarsee@gmail.com", "Male", "Tennessee", "Nashville", "United States", "4096594941"));
        contactsList.add(new Contacts("Sydney", "Garsee", "2214 Button Quail Court", "sydneygarsee@gmail.com", "Female", "Tennessee", "Nashville", "United States", "6158306199"));
    }

    public Contacts findContacts (CheckContacts tester)
    {
        for (Contacts c : contactsList)
        {
            if (tester.test(c))
            {
                return c;
            }
        }
        return null;
    }
}
