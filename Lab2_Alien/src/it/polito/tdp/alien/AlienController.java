/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */

package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	AlienDictionary ad = new AlienDictionary();

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnText"
    private TextField txtText; // Value injected by FXMLLoader

    @FXML // fx:id="btnTranslate"
    private Button btnTranslate; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader
    
    @FXML
    private Button btnReset;

    @FXML
    void doReset(ActionEvent event) {
    	txtResult.setText("Welcome to Alien Dictionary v2017");
    }

    @FXML
    void doTranslate(ActionEvent event) {
    	String array[] = txtText.getText().split(" ");
    	if (array.length==1){
    		if(array[0].contains("0") ||array[0].contains("1")||array[0].contains("2") ||array[0].contains("3") ||array[0].contains("4") ||array[0].contains("5") ||array[0].contains("6") ||array[0].contains("7") ||array[0].contains("8") ||array[0].contains("9")){
    			txtResult.appendText("NON PUOI INSERIRE NUMERI!!!!!!!!!!");
    		}
    		
    		txtResult.appendText("\n"+array[0]+"\t = \t"+ad.translateWord(array[0].toLowerCase()));
    	}
    	if (array.length==2){
    		ad.addWord(array[0].toLowerCase(), array[1].toLowerCase());
    		txtText.clear();
    	}
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtText != null : "fx:id=\"btnText\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
        txtResult.setText("Welcome to Alien Dictionary v2017");

    }
}
