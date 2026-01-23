package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Artem", "Chigarov", "+7813747614", "Stuttgart")
        );
        ArrayList<Person> persons = phones.find("Artem");
        assertThat(persons.get(0).getSurname()).isEqualTo("Chigarov");
    }

    @Test
    public void whenCanNotFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Nurlan", "Safarov", "+7392653892", "Asstrachan")
        );
        ArrayList<Person> persons = phones.find("Yura");
        assertThat(persons).isEmpty();
    }
}