package org.example;

import java.util.Arrays;
public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;


// constructor for all 4 vars
    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro < 0 ? 0 : giro;
        this.developerNames = developerNames;
    }

// getter methods in order

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    // setter methods in order

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiro(double giro) {
        this.giro = giro;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    // add employee method
    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Index out of range: " + index);
            return;
        }
        if (developerNames[index] == null) {
            developerNames[index] = name;
            System.out.println("Employee '" + name + "' added at index " + index);
        } else {
            System.out.println("Hey "+ name +"! Index " + index + " is already filled with: " + developerNames[index]);
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}

