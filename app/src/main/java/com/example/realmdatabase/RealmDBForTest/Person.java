package com.example.realmdatabase.RealmDBForTest;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Person extends RealmObject {



    private long id;

    private String name;

    public long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    long phoneno;

        public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Person(long id, String name ) {
        this.id = id;
        this.name = name;

    }

    public Person() {
    }
    // ... Generated getters and setters ...
}