/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 20115
 */
public class MainFXMLController implements Initializable {

    @FXML
    private Label lbWelcome;
    @FXML
    private TextField tfFirstName;
    @FXML
    private TextField tfLastName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OKBtnClicked(ActionEvent event) {
        String firstName = tfFirstName.getText();
        String lastName = tfLastName.getText();
        lbWelcome.setText("Welcome " + firstName+" " + lastName);
    }

    @FXML
    private void ClearBtnClicked(ActionEvent event) {
        tfFirstName.setText("");
        tfLastName.setText("");
        lbWelcome.setText("");
    }
    
}
