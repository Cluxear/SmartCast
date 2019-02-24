/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartCast.ui;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Walid
 */
public class AddTestFXMLController implements Initializable {

	/**
	 * Initializes the controller class.
	 */
	@FXML
	private JFXTextField pseudo;
	@FXML
	private JFXTextField password;
	@FXML
	private Button send;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}	
	
	public void sendAction(){
		System.out.println("Ok we are there");
	}
	
}
