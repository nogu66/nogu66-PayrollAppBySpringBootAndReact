package com.nogu66.PayrollApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner { // CommandLineRunner is a Spring Boot specific interface with a run method that will be called when the application is started.

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) { // Spring Boot will create a DatabaseLoader and use it to run the following method.
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception { // The run method is invoked with command line arguments, loading up your database.
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
    }

}