package org.example.builder.solution;

public class Employee {

    int empId;
    String empName;
    String address;
    int mobileNumber;
    String fatherName;
    String motherName;


    public Employee(EmployeeBuilder employeeBuilder) {
        this.empId = employeeBuilder.empId;
        this.empName = employeeBuilder.empName;
        this.address = employeeBuilder.address;
        this.mobileNumber = employeeBuilder.mobileNumber;
        this.fatherName = employeeBuilder.fatherName;
        this.motherName = employeeBuilder.motherName;
    }
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getAddress() {
        return address;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }



   }
