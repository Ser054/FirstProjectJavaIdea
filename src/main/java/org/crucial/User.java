package org.crucial;

public class User {
    private int id;
    private String name;
    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public boolean isEqual(User user) {
        return this.id == user.id;
    }
}
