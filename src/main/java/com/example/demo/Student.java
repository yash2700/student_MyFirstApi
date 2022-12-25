package com.example.demo;

public class Student {
    public int age;
    public String name;
    public int admNo;

    public int classNo;

    public Student(int age, String name, int admNo,int classNo) {
        this.age = age;
        this.name = name;
        this.admNo = admNo;
        this.classNo=classNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdmNo() {
        return admNo;
    }

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
    }
}
