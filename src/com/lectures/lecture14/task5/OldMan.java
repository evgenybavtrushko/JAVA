package com.lectures.lecture14.task5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import lombok.*;

/**
 * Created by nimf8 on 7/20/2017.
 */
@AllArgsConstructor
public class OldMan {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Bob", "Black", 18),
                new Person("Adolf", "Schicklgruber", 40),
                new Person("Sid", "Miller", 30),
                new Person("Winston", "Churchill", 45),
                new Person("Karl", "Gray", 28),
                new Person("Joseph", "Dzhugashvili", 55));
        Person oldPerson = personList
                .stream()
                .filter(x -> (x.getFirstName() + " " + x.getLastName()).length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .get();
        System.out.println(oldPerson);
    }
}
