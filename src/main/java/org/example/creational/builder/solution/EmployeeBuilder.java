package org.example.creational.builder.solution;

public class EmployeeBuilder {

    int empId;
    String empName;
    String address;
    int mobileNumber;
    String fatherName;
    String motherName;

    public EmployeeBuilder setEmpId(int empId) {
        this.empId = empId;
        return this;
    }

    public EmployeeBuilder setEmpName(String empName) {
        this.empName = empName;
        return this;
    }

    public EmployeeBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public EmployeeBuilder setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public EmployeeBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public EmployeeBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }


    public Employee build(){
        return new Employee(this);
    }
}
