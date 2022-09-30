package com.example.restapiproba;

public class model {

    int id;
    String title, body;

    public model(int id, String name, String gender) { // generate --> constructor
        this.id = id;
        this.title = name;
        this.body = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}