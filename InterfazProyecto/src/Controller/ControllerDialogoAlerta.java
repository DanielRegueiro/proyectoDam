package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ControllerDialogoAlerta {

    @FXML
    private Text textoAlerta;

    @FXML
    private Button boton;

    public void cambiarTexto(String texto) {
    	
    	textoAlerta.setText(texto);
    	
    }
    
    
    @FXML
	void cerrar(ActionEvent event) {
		Stage stage = (Stage) boton.getScene().getWindow();
		stage.close();
	}

    
}
