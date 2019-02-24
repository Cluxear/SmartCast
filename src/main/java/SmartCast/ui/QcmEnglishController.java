package SmartCast.ui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.qoppa.pdf.PDFException;
import com.qoppa.pdfViewerFX.PDFViewer;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Walid
 */
public class QcmEnglishController implements Initializable {

@FXML 
private SplitPane splitPane;
	/**
	 * Initializes the controller class.
	 */
		
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	try {
		PDFViewer m_PDFViewer = new PDFViewer();
		m_PDFViewer.loadPDF("C:/wamp64/www/QcmExams/1.pdf");
		HBox hbox = new HBox();
		Button b1 = new Button("A3mal");
		Button b2 = new Button("Eli");
		Button b3 = new Button("Trah");
		hbox.getChildren().addAll(b1, b2, b3);
		StackPane stackpane = new StackPane(hbox);
		splitPane.getItems().addAll(m_PDFViewer, stackpane);
		
		splitPane.setDividerPositions(0.5f, 0.5f);
	} catch (PDFException ex) {
		Logger.getLogger(QcmEnglishController.class.getName()).log(Level.SEVERE, null, ex);
	}
	}	
	
		
}
