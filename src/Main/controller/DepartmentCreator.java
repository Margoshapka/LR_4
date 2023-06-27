package shapovalova.java.labs.controller;

import shapovalova.java.labs.model.Department;
import shapovalova.java.labs.model.Human;

public class DepartmentCreator {
    public DepartmentCreator() {
    }

    public Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }
}