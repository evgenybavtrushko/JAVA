package com.lectures.lecture8.task3;

/**
 * Created by User on 005 05.07.17.
 */
public class Students implements Comparable <Students>{
    private String name;

    public Students(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Students p) {
        return name.compareTo(p.getName());
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                '}';
    }
}
