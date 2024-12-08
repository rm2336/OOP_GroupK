package Alex;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Alex MacHugh
 */
public class User {
    
    //Declare variables
    private int userID;
    private String userName;
    private int score;
    
    public User(int userID, String userName){
        this.userID = userID;
        this.userName = userName;
        this.score = 0; // Initialize score
        
    }
    
    public String DisplayProfile(){
        return "UserID: " + userID + ", UserName: " + userName + ", Score: " + score;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }
    
    public void incrementScore() {
        score++;
    }
    
    public int getScore() {
        return score;
    }
    

    
    
}
