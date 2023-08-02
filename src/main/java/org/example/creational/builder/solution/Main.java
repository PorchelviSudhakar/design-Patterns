package org.example.creational.builder.solution;

public class Main {


    public static void main(String args[]){
        Employee employee = new EmployeeBuilder()
                                .setEmpId(1)
                                .setEmpName("Thomas")
                                .setAddress("213 street")
                                .setMobileNumber(213)
                                .build();
        System.out.println("Employee Address==="+employee.getAddress()+"Employee Name==="+employee.getEmpName());

    }
}
