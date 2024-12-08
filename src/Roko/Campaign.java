/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roko;

/**
 *
 * @author rokom
 */
public class Campaign extends Cost {
    private String manager, endDate;
    
    Campaign(String managerArg, String endDateArg) {
        manager = managerArg;
        endDate = endDateArg;
    }
    
    Campaign(String nameArg, String dateArg, String goalArg, double amountArg, String managerArg, String endDateArg) {
        super.name = nameArg;
        super.date = dateArg;
        super.goal = goalArg;
        super.amount = amountArg;
        manager = managerArg;
        endDate = endDateArg;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    @Override
    public String printDetails() {
        return super.printDetails() + "Manager: " + manager + "\n" +
        "End Date: " + endDate + "\n";
    }
}
