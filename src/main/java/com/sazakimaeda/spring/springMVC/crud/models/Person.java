package com.sazakimaeda.spring.springMVC.crud.models;

import jakarta.validation.constraints.*;

public class Person {
    private int id;

    @NotEmpty(message = "Write name!")
    @Size(min = 2, max = 30, message = "name min = 2, max = 30!")
    private String name;

    @NotEmpty(message = "Write surname, pidr!")
    @Size(min = 2, max = 30, message = "surname min = 2, max = 30, pidr!")
    private String surname;

    @Min(value = 0, message = "You are little pidr!")
    @Max(value = 120, message = "You are so older!")
//    @NotEmpty(message = "You are pidr, empty!")
//    Кажется для int не работает @NotEmpty
    @NotNull(message = "Dolbaeb?")
    private int age;

    @Email(message = "Write correct email!")
    @NotEmpty(message = "Write email, pidrila!")
    private String email;


    public Person() {}

    public Person(String name, int id, String surname,int age, String email) {
        this.name = name;
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public int getAge() { return age;}
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email;}
    public void setEmail(String email) { this.email = email; }
}
