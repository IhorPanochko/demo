package com.example.demo.dto;

public class UserDto {

    public UserDto() {
    }

    public UserDto(String name, Byte age) {
        this.name = name;
        this.age = age;
    }

    private String name;

    private Byte age;

    public String getName() {
        return name;
    }

    public Byte getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
