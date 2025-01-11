package org.example;

import java.util.Arrays;
import java.util.Stack;

public class Employee {
    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;


//constructor for all 5 vars
    public Employee(long id, String fullName, String email, String password, String[] healthPlans){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }


//getter methods in order
    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }


//setter methods in order
    public void setId(long id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }
//add health plan method
public void addHealthPlan(int index, String name) {
    if (index < 0 || index >= healthPlans.length) {
        System.out.println("Index out of bounds for healthplans array. min / max limit");
        return;
    }
    if (healthPlans[index] == null) {
        healthPlans[index] = name;
    } else {
        System.out.println("Healthplan slot at index " + index + " is already occupied.");
    }
}

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password="+ password +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
