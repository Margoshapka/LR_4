package shapovalova.java.labs.controller;

import shapovalova.java.labs.model.Faculty;
import shapovalova.java.labs.model.Human;

public class FacultyCreator {
    public FacultyCreator() {
    }

    public Faculty createFaculty(String name, Human headmaster) {
        return new Faculty(name, headmaster);
    }
}