package org.example;

import org.example.enums.Plan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        runExample();
    }

    public static void runExample() {

        System.out.println();
        System.out.println("------***   Company instance 1 (predefined devs array) ***-------");
        String[] devs = {"Berk", "Furkan", "Gökhan", "Emrah","Enis", "Emre"};
        Company companyInstance1 = new Company(1, "BerkinTech", 1.0, devs);
        companyInstance1.addEmployee(0, "John");
        companyInstance1.addEmployee(1, "Jane");
        companyInstance1.addEmployee(7 ,"Osman");
        System.out.println(companyInstance1);

        System.out.println();
        System.out.println("------***   Company instance 2 (array for max 3 ppl)  ***-------");
        String[] devs2 = new String[3];
        Company companyInstance2 = new Company(1,"BerkinTech", 5.00, devs2);
        companyInstance2.addEmployee(0,"Ali");
        companyInstance2.addEmployee(0,"Ahmet");
        companyInstance2.addEmployee(1,"Ayşe");
        companyInstance2.addEmployee(2,"Fatma");
        companyInstance2.addEmployee(3,"Hayriye");
        companyInstance2.addEmployee(4,"Mahmut");
        companyInstance2.addEmployee(5,"Kandıralı Ferdi");
        System.out.println(companyInstance2);


        int randomNumber = (int) (Math.random() * 1000) + 1; // 1 ile 1000 arasında
        System.out.println();
        System.out.println("------***   Health Plan instance 1   ***-------");
        HealthPlan healthPlanInstance1 = new HealthPlan(randomNumber+1, "Basic plan", Plan.BASIC);
        HealthPlan healthPlanInstance2 = new HealthPlan(randomNumber+2, "mid range plan", Plan.MIDDLE);
        HealthPlan healthPlanInstance3 = new HealthPlan(randomNumber+5,"premium plan", Plan.PREMIUM);
        HealthPlan healthPlanInstance4 = new HealthPlan(randomNumber+10, "Plan for Companies", Plan.ENTERPRISE);

        System.out.println(healthPlanInstance1);
        System.out.println(healthPlanInstance2);
        System.out.println(healthPlanInstance3);
        System.out.println(healthPlanInstance4);


        System.out.println();
        System.out.println("------***   Employee 1 (max array 5)  ***-------");
        String[] healthPlans = new String[5];
        Employee employeeInstance1 = new Employee(123,"Berk K.","a@b.com","asdasd", healthPlans);
        employeeInstance1.addHealthPlan(0,"asd");
        employeeInstance1.addHealthPlan(0,"qwe");
        employeeInstance1.addHealthPlan(6,"gdsf");
        System.out.println(employeeInstance1);


    }
}
