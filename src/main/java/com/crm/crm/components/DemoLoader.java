package com.crm.crm.components;

import com.crm.crm.model.Contact;
import com.crm.crm.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {

    private final ContactRepository contactRepository;

    @Autowired
    public DemoLoader(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.contactRepository.save(new Contact("Benny", "Chan", "me@me.com"));
    }
}
