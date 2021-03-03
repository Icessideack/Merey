package com.company.entities;

public class Merey {
    private int id;
    private String name;
    private String project;
    private int totalcost;

    public Merey(String name, String project, int totalcost) {
        setName(name);
        setProject(project);
        setTotalcost(totalcost);
    }

    public Merey(int id, String name, String project, int totalcost) {
    }


    public String getProject() {
        return project;
    }

    private void setProject(String project) {
        this.project= project;
    }

    public int getTotalcost() {
        return totalcost;
    }

    private void setTotalcost(int totalcost) {
        this.totalcost = totalcost;
    }

    public Merey(int id, String name, String surname, boolean gender, String role, int projectId) {
        setId(id);
        setName(name);
        setProject(project);
        setTotalcost(totalcost);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name=" + name + '\'' +
                ", project=" + project + '\'' +
                ", totalcost=" + totalcost +
                '}';
    }


}