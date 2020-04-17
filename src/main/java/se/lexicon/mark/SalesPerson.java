package se.lexicon.mark;

import java.time.LocalDate;

public class SalesPerson extends Employee {



    private String[] clients = new String[0];
    private int aquiredClients;

    public SalesPerson(String namePrivate, double salery){
        super(namePrivate, salery);

    }

    @Override
    public void calculateSalary() {
        double clientBonus = 500;
        double newClients = 1000;
        if (getSalary()!= 25000){
            setSalary(25000);
        }

            setSalary(getSalary() + (clientBonus * clients.length)  + (newClients * aquiredClients));
    }
   // SalesPersons get 500 extra for each client they maintain and 1000 extra for each new client they have aquired.
    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public int getAquiredClients() {
        return aquiredClients;
    }

    public void setAquiredClients(int aquiredClients) {
        this.aquiredClients = aquiredClients;
    }

    public String toString() {
        return "";

        }


}
