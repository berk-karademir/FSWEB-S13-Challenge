package org.example;

import org.example.enums.Plan;

public class HealthPlan {
    private int id;
    private String name;
    private Plan plan;


//constructor for all 3 vars
    public HealthPlan(int id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

// getter methods in order

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Plan getPlan() {
        return plan;
    }

// setter methods in order

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }


    @Override
    public String toString() {
        return "HealthPlan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plan=" + plan +
                '}';
    }
}
