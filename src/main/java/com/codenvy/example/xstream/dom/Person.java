package com.codenvy.example.xstream.dom;

import java.util.HashSet;
import java.util.Set;

public class Person {

    private String name;
    private Set<Person> friends;

    public Person() {
    }

    public Person(String name, Set<Person> friends) {
        this.name = name;
        this.friends = friends;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Person> getFriends() {
        if (friends == null) {
            friends = new HashSet<Person>();
        }

        return friends;
    }

    public void setFriends(Set<Person> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", friends=" + friends +
               '}';
    }
}
