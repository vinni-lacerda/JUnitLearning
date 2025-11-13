package org.example;

import java.time.LocalDate;

public class PersonRegister {
    private MailAPI mailAPI;

    public PersonRegister(final MailAPI mailAPI) {
        this.mailAPI = mailAPI;
    }

    public Person personRegister(String name, String document, LocalDate birthdate, String cep){
        Person person = new Person(name, document, birthdate);
        LocalizationData localizationData = mailAPI.searchDataWithCep(cep);
        person.addAddressData(localizationData);
        return person;
    }
}
