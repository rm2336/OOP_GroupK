/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roko;

/**
 *
 * @author rokom
 */
public class Cost implements java.io.Serializable {
    protected int id;
    protected static int currentId = -1;
    protected String name, date, goal;
    protected double amount;
    
    Cost() {
        currentId++;
    }
    
    Cost(String nameArg, String dateArg, String goalArg, double amountArg) {
        id = ++currentId;
        System.out.println("Cost " + id + " initialised.");
        name = nameArg;
        date = dateArg;
        goal = goalArg;
        amount = amountArg;
    }
   
    public int getCurrentId() {
        return currentId;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    String printDetails() {
        return "Name: " + name + "\n" + "Date: " + date + "\n" + "Goal: " +
        goal + "\n" + "Amount: " + amount + "\n";
    }
}
