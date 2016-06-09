package com.vach.tryout.protobuf;

import com.vach.tryout.AddressBookProtos.Person;

public class Main {

    public static void main(String[] args) {
        System.out.println("something");

        Person.Builder p = Person.newBuilder();
        p.setEmail("email");
        p.build();

    }
}
