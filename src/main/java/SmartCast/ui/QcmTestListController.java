package SmartCast.ui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import SmartCast.main.App;
import com.jfoenix.controls.JFXButton;
import com.qoppa.pdf.PDFException;
import com.qoppa.pdfViewerFX.PDFViewer;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Walid
 */
public class QcmTestListController implements Initializable {

	/**
	 * Initializes the controller class.
	 */
	@FXML
	private JFXButton English1;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	
	public void getEnglish1Qcm() throws IOException, PDFException{

				//File file = new File("C:/wamp64/www/cv.pdf"); 
				//PDDocument doc = PDDocument.load(file);
//				WebView browser = new WebView();
//				WebEngine webEngine = browser.getEngine();
//				webEngine.load(doc.toString());

        			Parent page = (Parent) FXMLLoader.load(getClass().getClassLoader().getResource("fxml/QcmEnglishPage.fxml"));
				
				//pane.getChildren().add(browser);
				
				App.getInstance().getMyStage().getScene().setRoot(page);
	}		
	
}
