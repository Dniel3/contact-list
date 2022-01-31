package com.crm.crm.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ContactLoader implements CommandLineRunner {

  private final ContactRepository repository;

  @Autowired
  public ContactLoader(ContactRepository repository) {
    this.repository = repository;
  }

  @Override
  public void run(String... args) throws Exception {
    this.repository.save(new Contact("dan", "ram", "a@a.com"));
  }
}
