package se.iths.model;

import java.util.ArrayList;
import java.util.Collection;

public class Student {
    private final long id;
    private String name = "missing";
    private int age = 0;

    private Collection<School> schools = new ArrayList<>();

    private Student(long id, String name){
        this.id = id;
        this.name = name;
    }

    private void add(School school){
        schools.add(school);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Collection<School> getSchools() {
        return schools;
    }

    public String toString(){
        return "Not Implmemented!";
    }
}
