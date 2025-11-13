package org.example;

import java.time.LocalDate;

public class Person {
    private String name;
    private String document;
    private LocalDate birthdate;
    private LocalizationData address;

    public Person(final String name, final String document, final LocalDate birthdate) {
        this.name = name;
        this.document = document;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public LocalizationData getAddress() {
        return address;
    }

    public void addAddressData(LocalizationData localizationData){
        this.address = localizationData;
    }
}
