package org.example.creational.prototype;

public class Student {
    int rollNo;
    String name;
    String address;

    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }


    public Student clone(){
        return new Student(rollNo,name,address);
    }
}
