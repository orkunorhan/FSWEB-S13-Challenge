package org.example;

import org.example.enums.Plan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Company company = new Company(
                1,
                "TechCorp",
                100000,
                new String[3]
        );

        Employee employee = new Employee(
                1,
                "Ali Veli",
                "ali@mail.com",
                "1234",
                new String[3]
        );

        Healthplan healthplan1 = new Healthplan(1, "Standart Plan", Plan.BASIC);
        Healthplan healthplan2 = new Healthplan(2, "Premium Plan", Plan.PREMIUM);

        company.addEmployee(0, "Dev1");
        company.addEmployee(1, "Dev2");

        employee.addHealthPlan(0, healthplan1.getName());
        employee.addHealthPlan(1, healthplan2.getName());

        company.addEmployee(1, "Dev3");
        employee.addHealthPlan(0, "Another Plan");

        company.addEmployee(-1, "Hatalı");
        company.addEmployee(5, "Hatalı");

        employee.addHealthPlan(10, "Hatalı");

        company.setGiro(-500);

        System.out.println(company);
        System.out.println(employee);
        System.out.println(healthplan1);
        System.out.println(healthplan2);
    }
}