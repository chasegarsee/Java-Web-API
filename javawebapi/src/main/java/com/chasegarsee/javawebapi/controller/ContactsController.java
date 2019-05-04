package com.chasegarsee.javawebapi.controller;


import com.chasegarsee.javawebapi.JavawebapiApplication;
import com.chasegarsee.javawebapi.exception.ResourceNotFoundException;
import com.chasegarsee.javawebapi.model.Contacts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;


@RestController
public class ContactsController
{
    private static final Logger logger = LoggerFactory.getLogger(Contacts.class);

    @GetMapping(value = "/contacts", produces = {"application/json"})
            public ResponseEntity<?> allContacts()
    {
        logger.info("RECEIVED FULL CONTACT LIST");
        return new ResponseEntity<>(JavawebapiApplication.contactList.contactsList, HttpStatus.OK);
    }

    @GetMapping(value = "/contacts/{fname}")
    public ResponseEntity<?> specificContactInfo(@PathVariable String fname) throws ResourceNotFoundException
    {
        Contacts rtnContacts = JavawebapiApplication.contactList.findContacts(c -> c.getFname().toLowerCase().equals(fname.toLowerCase()));
        if (rtnContacts == null)
        {
            throw new ResourceNotFoundException("COULDN'T FIND CONTACT NAMED: " + fname);
        }
        logger.info("RECEIVED " + fname);
        return new ResponseEntity<>(rtnContacts, HttpStatus.OK);
    }

    @GetMapping(value = "/contacts/table")
    public ModelAndView getContacts()
    {
            ArrayList<Contacts> newContactList = JavawebapiApplication.contactList.contactsList;

        ModelAndView mav = new ModelAndView();
        mav.setViewName("contacts");
        mav.addObject("contactList", newContactList);

        return mav;
    }

}
