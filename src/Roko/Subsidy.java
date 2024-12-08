/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roko;

/**
 *
 * @author rokom
 */
public class Subsidy extends Cost {
    private String beneficiary;
    private boolean isLumpSum;
    
    Subsidy(String beneficiaryArg, boolean lumpSum) {
        beneficiary = beneficiaryArg;
        isLumpSum = lumpSum;
    }
    
    Subsidy(String nameArg, String dateArg, String goalArg, double amountArg, String beneficiaryArg, boolean lumpSum) {
        super.name = nameArg;
        super.date = dateArg;
        super.goal = goalArg;
        super.amount = amountArg;
        beneficiary = beneficiaryArg;
        isLumpSum = lumpSum;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public boolean isIsLumpSum() {
        return isLumpSum;
    }

    public void setIsLumpSum(boolean isLumpSum) {
        this.isLumpSum = isLumpSum;
    }
    
    @Override
    String printDetails() {
        return super.printDetails() + "Beneficiary: " + beneficiary + "\n" + 
        "Lump Sum: " + isLumpSum + "\n";
    }
}
