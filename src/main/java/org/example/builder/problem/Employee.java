package org.example.builder.problem;

public class Employee {

    int empId;
    String empName;
    String address;
    int mobileNumber;
    String fatherName;
    String motherName;

    public Employee(int empId, String empName, String address, int mobileNumber, String fatherName, String motherName) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
}
