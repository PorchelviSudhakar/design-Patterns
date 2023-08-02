package org.example.creational.prototype;

public class Main {


    public static void main(String args[]){
        Student student = new Student(10,"Jasmine"," 213 streer Anna Nagar");
        Student studentCopy = student.clone();
        System.out.println("Student Name "+studentCopy.name+" Student Address "+studentCopy.address);
    }
}
