package se.iths.model;

import java.util.ArrayList;
import java.util.Collection;

public class School {
    private final long id;
    private String name = "missing";

    private Collection<Student> students = new ArrayList<>();

    private School(long id, String name){
        this.id = id;
        this.name = name;
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

    public Collection<Student> getStudents() {
        return students;
    }

    public void add(Student student) {
        this.students.add(student);
    }

    public String toString(){
        return "Not Implmemented!";
    }
}
