package com.example.demo.belajarOOP;

import javax.xml.registry.infomodel.PersonName;

public class AppPerson {
    public static void main(String[] args){
        var person = new PersonName("rafi", "kalimantan");
        // AppPerson person2 = new AppPerson();

        // AppPerson person3;
        // person3 = new AppPerson();

        // person.name = "rafi";
        // person.address = "kalimantan";
        // person.country = "Tidak Bisa Diubah"

        // System.out.println(person.name);
        // System.out.println(person.address);
        // System.out.println(person.country);

        person.sayHello("jadika");


   }
}

