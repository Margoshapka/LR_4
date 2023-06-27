package shapovalova.java.labs.controller;

import shapovalova.java.labs.model.Group;

public class GroupCreator {
    public GroupCreator() {
    }

    public Group createGroup(String name) {
        return new Group(name);
    }
}