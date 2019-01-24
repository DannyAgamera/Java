/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SquareRooter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Danny Agamera
 */
public class SquareRooterController implements Initializable {

    @FXML private AnchorPane rootPane;
    @FXML private TextField SquareRootTextField;
    @FXML private Button SquareRootButton;
    @FXML private Label SquareRootLabel;
    @FXML private Label nextPossibleSquaredNumber;
    @FXML private Label nextPossibleSquaredNumberLabel;
    @FXML private Label nextPossibleSquareRoot;
    @FXML private Label nextPossibleSquareRootLabel;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void squareRootButtonClicked(ActionEvent e){
        int squaredNumber = Integer.parseInt(SquareRootTextField.getText());
        
        int possibleSquareRoot = 1;
        int squaredTestingNumber = possibleSquareRoot * possibleSquareRoot;
        
        while (squaredTestingNumber < squaredNumber){
            possibleSquareRoot++;
            squaredTestingNumber = possibleSquareRoot * possibleSquareRoot;
        }
        
        if(squaredTestingNumber == squaredNumber){
            System.out.println("The Square Root: " + possibleSquareRoot);
            String num = String.valueOf(possibleSquareRoot);
            SquareRootLabel.setText(num);
            nextPossibleSquaredNumber.setText("");
            nextPossibleSquaredNumberLabel.setText("");
            nextPossibleSquareRoot.setText("");
            nextPossibleSquareRootLabel.setText("");
        }else{
            System.out.println("Next Possible Squared Number: " + squaredTestingNumber);
            System.out.println("Next Possible Square Root: " + possibleSquareRoot);
            
            SquareRootLabel.setText("Sorry!");
            nextPossibleSquaredNumber.setText("Next Possible Squared Number");
            String nextPossibleSqrNum = String.valueOf(squaredTestingNumber);
            nextPossibleSquaredNumberLabel.setText(nextPossibleSqrNum);
            nextPossibleSquareRoot.setText("Next Possible Square Root");
            String nextPossibleSqrt = String.valueOf(possibleSquareRoot);
            nextPossibleSquareRootLabel.setText(nextPossibleSqrt);
        }
        
        
    }
    
}
