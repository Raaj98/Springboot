package com.socialmedia.socialmedia;

public class StudentNameRequest {

    private String[] name;

    public StudentNameRequest(String[] name) {
        this.name = name;
    }

    public StudentNameRequest(){}

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }
}
