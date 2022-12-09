/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.bankproject;

/**
 *
 * @author maggy
 * This is a class that globally stores data
 * 
 * This class allows us to display the balance of the user whenever they 
 * deposit or withdraw money
 */


public class DataSingleton {
    private static final DataSingleton instance = new DataSingleton();
    
    private int userAmount;
    
    private DataSingleton(){}
    
    public static DataSingleton getInstance(){
        return instance;
    }
    
    public int getAmount(){
        return userAmount;
    }
    
    public void setDeposit(int userAmount){
        this.userAmount = this.userAmount + userAmount;
    }
    
    public void setWithdrawal(int userAmount){
        this.userAmount = userAmount;
    }
}
