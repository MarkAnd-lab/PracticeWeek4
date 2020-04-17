package se.lexicon.mark;

import java.time.LocalDate;

// Create method calculateSalary() in Super class and override this method in its subclasses
public abstract class Employee {

    private static int counter = 1;
    private int id;
    private String nameprivate;
    private double salary;
    private LocalDate dateHired;

    public Employee(String nameprivate, double salary){
        this();
        this.nameprivate = nameprivate;
        this.salary =salary;

             }

    public Employee(){
        this.dateHired = LocalDate.now();
        this.id = counter;
        counter++;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameprivate() {
        return nameprivate;
    }

    public void setNameprivate(String nameprivate) {
        this.nameprivate = nameprivate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }

    public abstract void calculateSalary();


}


