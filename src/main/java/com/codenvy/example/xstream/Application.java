package com.codenvy.example.xstream;

import com.codenvy.example.xstream.core.XStreamFactory;
import com.codenvy.example.xstream.dom.Person;
import com.thoughtworks.xstream.XStream;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        XStream xStream = XStreamFactory.buildXStream();
        XStream xStreamCDATA = XStreamFactory.buildXStreamCDATA();

        Set<Person> persons = getPersons(3);

        String xml = xStream.toXML(persons);
        String xmlWithCDATA = xStreamCDATA.toXML(persons);

        System.out.println("Person set: " + persons.toString());
        System.out.println("\nXML:\n" + xml);
        System.out.println("\nXML with CDATA:\n" + xmlWithCDATA);
    }

    public static Set<Person> getPersons(int num) {
        Set<Person> persons = new HashSet<>(num);

        for (int i = 0; i < 5; i++) {
            Person person = new Person("Person-" + new Random().nextInt(4));
            person.getFriends().addAll(persons);
            persons.add(person);
        }

        return persons;
    }
}
