package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    private String name;
    private LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    public int getAge(){
        return (int) ChronoUnit.YEARS.between(this.birthdate, LocalDate.now());
    }
    public boolean isOver18(){
        return getAge()>=18;
    }
}
