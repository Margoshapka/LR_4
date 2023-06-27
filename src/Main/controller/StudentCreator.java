package shapovalova.java.labs.controller;

import shapovalova.java.labs.model.Group;
import shapovalova.java.labs.model.Sex;
import shapovalova.java.labs.model.Student;

public class StudentCreator {
    public StudentCreator() {
    }

    public Student createStudent(String firstName, String lastName, String parentage, Sex gender) {
        return new Student(firstName, lastName, parentage, gender);
    }
}