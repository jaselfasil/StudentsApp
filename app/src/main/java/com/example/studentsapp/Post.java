package com.example.studentsapp;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class Post {
    @SerializedName("id")
    private Integer id;
    private Integer age;
    private String email;
    private String name;
    private String layout;
    private Integer size;
    private Integer credits;
    private String teacher;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public String getLayout() {
        return layout;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getCredits() {
        return credits;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
