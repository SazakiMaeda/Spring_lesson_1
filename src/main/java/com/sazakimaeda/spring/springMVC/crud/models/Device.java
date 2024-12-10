package com.sazakimaeda.spring.springMVC.crud.models;


public class Device {
    private int id;
    private String name;
    private String model;
    private String problem;

    public Device() {}

    public Device(int id, String name, String model, String problem) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.problem = problem;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id;}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getModel() { return model;}
    public void setModel(String model) { this.model = model; }

    public String getProblem() { return problem; }
    public void setProblem(String problem) { this.problem = problem; }


}

