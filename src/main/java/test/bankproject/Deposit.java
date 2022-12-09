/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.bankproject;

/**
 *
 * @author maggy
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

/**
 *
 * @author maggy
 */
public class Deposit implements Initializable {
    
    
    
    
    
    @FXML
    Label nameLabel;
    
    @FXML
    private Text nameText;
    
    private int globalAmount;
    
    DataSingleton data = DataSingleton.getInstance();
    
    public void displayValue(String values){
        nameLabel.setText(values);
    }
    
    //Grabbing values from user
    public void setValues(int userAmount){
        globalAmount = userAmount + userAmount;
    }
    
    //Returning the values
    public int getValues(){
        return globalAmount;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameText.setText(Integer.toString(data.getAmount()));
    }
}
