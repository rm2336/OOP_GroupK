/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roko;

/**
 *
 * @author rokom
 */
public class Programme extends Cost {
    private String department;
    private boolean isRecurrent;
    
    Programme(String departmentArg, boolean recurrent) {
        department = departmentArg;
        isRecurrent = recurrent;
    }
    
    Programme(String nameArg, String dateArg, String goalArg, double amountArg, String departmentArg, boolean recurrent) {
        super.name = nameArg;
        super.date = dateArg;
        super.goal = goalArg;
        super.amount = amountArg;
        department = departmentArg;
        isRecurrent = recurrent;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isIsRecurrent() {
        return isRecurrent;
    }

    public void setIsRecurrent(boolean isRecurrent) {
        this.isRecurrent = isRecurrent;
    }
    
    @Override
    public String printDetails() {
        return super.printDetails() + "Department: " + department + "\n" +
        "Recurrent: " + isRecurrent + "\n";
    }
}
