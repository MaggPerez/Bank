package test.bankproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author maggy
 */
public class PrimaryController {
    
     @FXML
        private Label myLabel;
     
     @FXML
        private Label myNextLabel;
        
        @FXML
        private TextField myTextField;
        
        @FXML
        private Button myButton;
        
         int userInput = 0;
        
         int total = userInput;
         
         int finalTotal = total;
         
         int moneyLost;
    
         
         //Creating object
         DataSingleton data = DataSingleton.getInstance();

    
    @FXML
    public void login(ActionEvent event) throws Exception {
        // TODO

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Checking_and_Saving.fxml"));
        
        App.setRoot("checking_and_saving");
        
    }    
    
    @FXML
    public void CheckingSaving(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Checking_and_Saving.fxml"));
        
        App.setRoot("checking_and_saving");
    }
    
    @FXML
    public void MainMenu(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
        
        App.setRoot("mainmenu");
        
        
    }
    
    @FXML
    public void SavingMenu(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SavingMenu.fxml"));
        
        App.setRoot("savingmenu");
        
        
    }

    @FXML
    public void deposit(ActionEvent event) throws Exception{
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Deposit.fxml"));
        
        App.setRoot("deposit");
        
    }
    
    
    
    
    
    public void withdraw(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Withdraw.fxml"));
        
        App.setRoot("withdraw");
    }

    
    public void TransLog(ActionEvent event) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TransactionLog.fxml"));
        
        App.setRoot("transactionlog");
    }
    
    @FXML
    public void ExitMenu(ActionEvent event) throws Exception{
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Checking_and_Saving.fxml"));
        
        App.setRoot("checking_and_saving");

        
    }
    
 

     @FXML
    public void depositAmount(ActionEvent event) throws Exception{
        try{
        userInput = Integer.parseInt(myTextField.getText()); //Getting value from user
        
        total = total + userInput; //Their total increases when they add more money
        
        finalTotal = total; //this will store users money and display it globaly
        

        
        myLabel.setText(Integer.toString(total)); //Displays the total amount from user
        }
        catch (NumberFormatException e){
            myLabel.setText("enter number");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        System.out.println(total);
        data.setDeposit(finalTotal); //Storing it globally
       

    }
    
    
    @FXML
    public void withdrawAmount(ActionEvent event) throws Exception{
        try{
            userInput = Integer.parseInt(myTextField.getText()); //Getting value from user
            
            total = data.getAmount(); //Grabbing user's money
            
            moneyLost = moneyLost - userInput; //Will show user money being removed
            
            total = total - userInput; //Their global amount total decreases when they withdraw money
        
            finalTotal = total; 
            
            myNextLabel.setText(Integer.toString(moneyLost)); //Displays the total amount of money lost
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println(total);
        data.setWithdrawal(finalTotal); //Storing it globally
    }
    
    @FXML
    public void seeBalance(ActionEvent event) throws Exception{
        System.out.println(data.getAmount());
        try{
        myLabel.setText(Integer.toString(data.getAmount()));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    
    
    
        
    
}
